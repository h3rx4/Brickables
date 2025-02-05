package net.h3rx4.brickables.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.h3rx4.brickables.Brickables;
import net.h3rx4.brickables.block.ModBlocks;
import net.h3rx4.brickables.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item THE_TALE_OF_A_CRUEL_WORLD_MUSIC_DISC = registerItem("the_tale_of_a_cruel_world_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.THE_TALE_OF_A_CRUEL_WORLD_KEY).maxCount(1).rarity(Rarity.RARE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Brickables.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Brickables.LOGGER.debug("Registering Mod Items for " + Brickables.MOD_ID);


        };
    }
