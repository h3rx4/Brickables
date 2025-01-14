package net.h3rx4.brickables.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.h3rx4.brickables.Brickables;
import net.minecraft.item.ItemGroups;

public class ModBlocks {




    public static void registerModBlocks() {
        Brickables.LOGGER.debug("Registering ModBlocks for " + Brickables.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entires -> {

        });

    }
}