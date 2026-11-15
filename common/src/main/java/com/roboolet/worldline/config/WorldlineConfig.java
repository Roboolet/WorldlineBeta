package com.roboolet.worldline.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class WorldlineConfig {
	public static class Common {
		public final ModConfigSpec.BooleanValue instantFood;
		public final ModConfigSpec.BooleanValue unstackable;

		Common(ModConfigSpec.Builder builder) {
			// Food settings
			builder.comment("Food settings")
					.push("food");

			instantFood = builder
					.comment("When enabled food will be eaten much quicker (Default: true)")
					.define("instantFood", true);

			unstackable = builder
					.comment("When enabled food items have their stack sizes adjusted (Default: true)")
					.define("unstackable", true);

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
