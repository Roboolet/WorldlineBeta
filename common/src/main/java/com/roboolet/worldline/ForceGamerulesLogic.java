package com.roboolet.worldline;

import net.minecraft.world.level.gamerules.GameRule;
import net.minecraft.world.level.gamerules.GameRules;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;

public class ForceGamerulesLogic {

	public static void SetGamerules(MinecraftServer server) {
		ServerLevel overworld = server.overworld();

		server.getGameRules().set(GameRules.PLAYERS_SLEEPING_PERCENTAGE, 101, server);
		server.getGameRules().set(GameRules.SPAWN_PATROLS, false, server);
		server.getGameRules().set(GameRules.SPAWN_PHANTOMS, false, server);
		server.getGameRules().set(GameRules.SPAWN_WANDERING_TRADERS, false, server);
		server.getGameRules().set(GameRules.RAIDS, false, server);
		server.getGameRules().set(GameRules.NATURAL_HEALTH_REGENERATION, false, server);
	}
}
