package net.h3rx4.brickables.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.h3rx4.brickables.Brickables;
import net.h3rx4.brickables.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Brickables.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Brickables.LOGGER.debug("Registering Mod Items for " + Brickables.MOD_ID);


        };
    }
