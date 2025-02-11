package net.h3rx4.brickables;

import net.fabricmc.api.ModInitializer;

import net.h3rx4.brickables.block.ModBlocks;
import net.h3rx4.brickables.item.ModItemGroups;
import net.h3rx4.brickables.item.ModItems;
import net.h3rx4.brickables.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Brickables implements ModInitializer {
	public static final String MOD_ID = "brickables";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModSounds.registerSounds();
		ModBlocks.registerModBlocks();
	}
}