package com.roboolet.worldline;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.Set;

public class CommonClass {

    public static void onPlayerTick(Player player) {
        if (player.level() instanceof ServerLevel serverLevel) {
            /*if (WorldlineConfig.COMMON.poisonousHunger.get() && player.hasEffect(MobEffects.HUNGER)) {
                MobEffectInstance instance = player.getEffect(MobEffects.HUNGER);
                if (instance != null) {
                    int duration = instance.isInfiniteDuration() ? player.tickCount : instance.getDuration();

                    if (isDurationEffectTick(duration, instance.getAmplifier()) && player.getHealth() > 1.0F) {
                        player.hurtServer(serverLevel, player.damageSources().magic(), 1.0F);
                    }
                }
            }*/
        }
    }

    private static boolean isDurationEffectTick(int duration, int amplifier) {
        int amplifiedCount = 25 >> amplifier;
        if (amplifiedCount > 0) {
            return duration % amplifiedCount == 0;
        } else {
            return true;
        }
    }

	public static final Set<Item> UNSTACKABLE_FOODS = Set.of(
			Items.RABBIT_STEW,
			Items.SUSPICIOUS_STEW,
			Items.MUSHROOM_STEW,
			Items.BEETROOT_SOUP
	);

	public static final Set<Item> MAX_STACK_FOODS = Set.of(
			Items.DRIED_KELP,
			Items.SPIDER_EYE,
			Items.GLOW_BERRIES,
			Items.SWEET_BERRIES,
			Items.BEETROOT,
			Items.COOKIE
	);
}