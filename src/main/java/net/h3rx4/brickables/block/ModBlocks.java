package net.h3rx4.brickables.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.h3rx4.brickables.Brickables;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(AbstractBlock.Settings.create().strength(1f)
                    .requiresTool().sounds(BlockSoundGroup.CALCITE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
         return Registry.register(Registries.BLOCK, Identifier.of(Brickables.MOD_ID, name ),block);
    }

 private static void registerBlockItem(String name, Block block) {
     Registry.register(Registries.ITEM, Identifier.of(Brickables.MOD_ID, name),
             new BlockItem(block, new Item.Settings()));
 }

    public static void registerModBlocks() {
        Brickables.LOGGER.info("Registering Mod Blocks for " + Brickables.MOD_ID);
    }
}