package com.roboolet.worldline.mixin;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.cubemob.SulfurCube;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class SulfurCubeDropMixin {
	@Inject(method = "shouldDropLoot", at = @At("HEAD"), cancellable = true)
	private void allowSmallSulfurCubeLoot(CallbackInfoReturnable<Boolean> cir) {
		if((Object) this instanceof SulfurCube){
			cir.setReturnValue(true);
			cir.cancel();
		}
	}
}