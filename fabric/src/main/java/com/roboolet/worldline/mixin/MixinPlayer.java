package com.roboolet.worldline.mixin;

import com.roboolet.worldline.CommonClass;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Player.class)
public class MixinPlayer {

	@Inject(method = "tick", at = @At("HEAD"))
	private void worldline$preTick(CallbackInfo ci) {
		CommonClass.onPlayerTick((Player) (Object) this);
	}
}