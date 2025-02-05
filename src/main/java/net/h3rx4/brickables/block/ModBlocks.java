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

    public static final Block INTERWOVEN_CALCITE_STAIRS = registerBlock("interwoven_calcite_stairs",
            new StairsBlock(ModBlocks.INTERWOVEN_CALCITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(0.75f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block INTERWOVEN_CALCITE_SLAB = registerBlock("interwoven_calcite_slab",
            new SlabBlock (AbstractBlock.Settings.create().strength(0.75f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block INTERWOVEN_CALCITE_WALL = registerBlock("interwoven_calcite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(0.75f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block INTERWOVEN_DIORITE_STAIRS = registerBlock("interwoven_diorite_stairs",
            new StairsBlock(ModBlocks.INTERWOVEN_DIORITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block INTERWOVEN_DIORITE_SLAB = registerBlock("interwoven_diorite_slab",
            new SlabBlock (AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block INTERWOVEN_DIORITE_WALL = registerBlock("interwoven_diorite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(0.75f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock (AbstractBlock.Settings.create().strength(0.75f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(0.75f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new StairsBlock(Blocks.BASALT.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.BASALT)));

    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock (AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.BASALT)));

    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.BASALT)));

    public static final Block INTERWOVEN_ICE = registerBlock("interwoven_ice",
            new Block(AbstractBlock.Settings.create().slipperiness(1.1f).requiresTool().strength(0.5f).sounds(BlockSoundGroup.GLASS)));

    public static final Block CALCITE_PILLAR = registerBlock("calcite_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(0.75f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block BLUE_SHROOMLIGHT = registerBlock("blue_shroomlight",
            new Block(AbstractBlock.Settings.create().luminance((state -> {return 15;})).strength(1.0F).sounds(BlockSoundGroup.SHROOMLIGHT)));

    public static final Block FOLLY_SHROOMLIGHT = registerBlock("folly_shroomlight",
            new Block(AbstractBlock.Settings.create().luminance((state -> {return 15;})).strength(1.0F).sounds(BlockSoundGroup.SHROOMLIGHT)));



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