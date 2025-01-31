package net.h3rx4.brickables.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.h3rx4.brickables.Brickables;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(AbstractBlock.Settings.create().strength(0.75f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            new StairsBlock(ModBlocks.CALCITE_BRICKS.getDefaultState(),
            AbstractBlock.Settings.create().strength(0.75f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            new SlabBlock (AbstractBlock.Settings.create().strength(0.75f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(0.75f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block INTERWOVEN_CALCITE_BRICKS = registerBlock("interwoven_calcite_bricks",
            new Block(AbstractBlock.Settings.create().strength(0.75f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block INTERWOVEN_CALCITE_BRICK_STAIRS = registerBlock("interwoven_calcite_brick_stairs",
            new StairsBlock(ModBlocks.INTERWOVEN_CALCITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(0.75f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block INTERWOVEN_CALCITE_BRICK_SLAB = registerBlock("interwoven_calcite_brick_slab",
            new SlabBlock (AbstractBlock.Settings.create().strength(0.75f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block INTERWOVEN_CALCITE_BRICK_WALL = registerBlock("interwoven_calcite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(0.75f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block INTERWOVEN_CALCITE = registerBlock("interwoven_calcite",
            new Block(AbstractBlock.Settings.create().strength(0.75f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block INTERWOVEN_DIORITE = registerBlock("interwoven_diorite",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block INTERWOVEN_POLISHED_DIORITE = registerBlock("interwoven_polished_diorite",
            new Block(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block INTERWOVEN_POLISHED_DIORITE_STAIRS = registerBlock("interwoven_polished_diorite_stairs",
            new StairsBlock(ModBlocks.INTERWOVEN_POLISHED_DIORITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block INTERWOVEN_POLISHED_DIORITE_SLAB = registerBlock("interwoven_polished_diorite_slab",
            new SlabBlock (AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block INTERWOVEN_POLISHED_DIORITE_WALL = registerBlock("interwoven_polished_diorite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.STONE)));









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

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {;
        });
    }
}