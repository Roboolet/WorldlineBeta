package com.roboolet.worldline.mixin;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WitherBoss.class)
public class WitherDropMixin {
	@Inject(
			method = "dropCustomDeathLoot",
			at = @At("HEAD"),
			cancellable = true
	)
	private void dropCustomDeathLoot(ServerLevel level, DamageSource source, boolean killedByPlayer, CallbackInfo ci)
	{
		ci.cancel();
	}
}
