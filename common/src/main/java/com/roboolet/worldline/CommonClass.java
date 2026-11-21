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

	public static final Set<Item> MID_STACK_FOODS = Set.of(
			Items.GLOW_BERRIES,
			Items.SWEET_BERRIES,
			Items.COOKIE,
			Items.MELON_SLICE,
			Items.POTATO,
			Items.CARROT,
			Items.APPLE,
			Items.CHORUS_FRUIT,
			Items.PUFFERFISH,
			Items.TROPICAL_FISH,
			Items.COD,
			Items.SALMON,
			Items.RABBIT,
			Items.PORKCHOP,
			Items.BEEF,
			Items.ROTTEN_FLESH,
			Items.CHICKEN,
			Items.MUTTON
	);

	public static final Set<Item> MAX_STACK_FOODS = Set.of(
			Items.DRIED_KELP,
			Items.POISONOUS_POTATO,
			Items.BEETROOT,
			Items.SPIDER_EYE
	);
}