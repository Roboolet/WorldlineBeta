package com.roboolet.worldline.mixin;

import com.roboolet.worldline.config.WorldlineConfig;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemInstance;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static com.roboolet.worldline.CommonClass.MAX_STACK_FOODS;
import static com.roboolet.worldline.CommonClass.MID_STACK_FOODS;

@Mixin(ItemInstance.class)
public interface ItemInstanceMixin {
	@Inject(method = "getMaxStackSize", at = @At("HEAD"), cancellable = true)
	private void worldline$getMaxStackSize(CallbackInfoReturnable<Integer> cir) {
		ItemInstance self = (ItemInstance) this;
		if (self instanceof ItemStack itemStack) {
			if (WorldlineConfig.COMMON.unstackable.get() && itemStack.has(DataComponents.FOOD)) {
				// for almost all food, stack size is set to 1
				int stackSize = 1;

				// set some foods to 16
				if (MID_STACK_FOODS.contains(itemStack.getItem())) {
					stackSize = 16;
				}

				// a few are set to 64
				if (MAX_STACK_FOODS.contains(itemStack.getItem())) {
					stackSize = 64;
				}
				cir.setReturnValue(stackSize);
			}
		}
	}
}

