package com.roboolet.worldline;

import com.roboolet.worldline.config.WorldlineConfig;
import fuzs.forgeconfigapiport.fabric.api.v5.ConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.neoforged.fml.config.ModConfig;

public class ClassicFoodFabric implements ModInitializer {

	@Override
	public void onInitialize() {
		ConfigRegistry.INSTANCE.register(Constants.MOD_ID, ModConfig.Type.COMMON, WorldlineConfig.commonSpec);
		ServerLifecycleEvents.SERVER_STARTED.register(ForceGamerulesLogic::SetGamerules);
	}
}
