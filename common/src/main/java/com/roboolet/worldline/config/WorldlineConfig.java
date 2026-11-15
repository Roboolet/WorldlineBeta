package com.roboolet.worldline.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class WorldlineConfig {
	public static class Common {
		public final ModConfigSpec.BooleanValue instantFood;
		public final ModConfigSpec.BooleanValue unstackable;

		Common(ModConfigSpec.Builder builder) {
			//General settings
			builder.comment("General settings")
					.push("general");

			instantFood = builder
					.comment("When enabled food will be eaten instantly (Default: false)")
					.define("instantFood", false);

			unstackable = builder
					.comment("When enabled food items won't be able to stack (Default: false)")
					.define("unstackable", false);

			builder.pop();
		}
	}

	public static final ModConfigSpec commonSpec;
	public static final Common COMMON;

	static {
		final Pair<Common, ModConfigSpec> specPair = new ModConfigSpec.Builder().configure(Common::new);
		commonSpec = specPair.getRight();
		COMMON = specPair.getLeft();
	}
}
