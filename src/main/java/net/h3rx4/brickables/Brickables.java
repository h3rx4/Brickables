package net.h3rx4.brickables;

import net.fabricmc.api.ModInitializer;

import net.h3rx4.brickables.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Brickables implements ModInitializer {
	public static final String MOD_ID = "brickables";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
	}
}