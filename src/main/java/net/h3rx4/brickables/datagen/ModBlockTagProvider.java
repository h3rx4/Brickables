package net.h3rx4.brickables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.h3rx4.brickables.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.INTERWOVEN_CALCITE_BRICKS)
                .add(ModBlocks.CALCITE_BRICKS)
                .add(ModBlocks.CALCITE_BRICK_STAIRS)
                .add(ModBlocks.INTERWOVEN_CALCITE_BRICK_SLAB)
                .add(ModBlocks.INTERWOVEN_CALCITE_BRICK_STAIRS)
                .add(ModBlocks.INTERWOVEN_CALCITE_BRICK_WALL)
                .add(ModBlocks.CALCITE_BRICK_WALL)
                .add(ModBlocks.CALCITE_BRICK_SLAB)
                .add(ModBlocks.INTERWOVEN_CALCITE)
                .add(ModBlocks.INTERWOVEN_DIORITE)
                .add(ModBlocks.INTERWOVEN_POLISHED_DIORITE)
                .add(ModBlocks.INTERWOVEN_POLISHED_DIORITE_SLAB)
                .add(ModBlocks.INTERWOVEN_POLISHED_DIORITE_WALL)
                .add(ModBlocks.INTERWOVEN_POLISHED_DIORITE_STAIRS)
                .add(ModBlocks.INTERWOVEN_CALCITE_SLAB)
                .add(ModBlocks.INTERWOVEN_CALCITE_STAIRS)
                .add(ModBlocks.INTERWOVEN_CALCITE_WALL)
                .add(ModBlocks.INTERWOVEN_DIORITE_SLAB)
                .add(ModBlocks.INTERWOVEN_DIORITE_WALL)
                .add(ModBlocks.INTERWOVEN_DIORITE_STAIRS)
                .add(ModBlocks.CALCITE_SLAB)
                .add(ModBlocks.CALCITE_WALL)
                .add(ModBlocks.CALCITE_STAIRS)
                .add(ModBlocks.SMOOTH_BASALT_SLAB)
                .add(ModBlocks.SMOOTH_BASALT_STAIRS)
                .add(ModBlocks.SMOOTH_BASALT_WALL)
                .add(ModBlocks.INTERWOVEN_ICE)
                .add(ModBlocks.CALCITE_PILLAR)
                .add(ModBlocks.BLUE_SHROOMLIGHT)
                .add(ModBlocks.FOLLY_SHROOMLIGHT)
                .add(ModBlocks.SMOOTH_STONE_STAIRS)
                .add(ModBlocks.SMOOTH_STONE_WALL)
                .add(ModBlocks.STONE_WALL)
                .add(ModBlocks.POLISHED_ANDESITE_WALL)
                .add(ModBlocks.POLISHED_DIORITE_WALL)
                .add(ModBlocks.POLISHED_GRANITE_WALL)
                .add(ModBlocks.INTERWOVEN_SANDSTONE)
                .add(ModBlocks.INTERWOVEN_SANDSTONE_SLAB)
                .add(ModBlocks.INTERWOVEN_SANDSTONE_WALL)
                .add(ModBlocks.INTERWOVEN_SANDSTONE_STAIRS)
                .add(ModBlocks.UNLIT_LANTERN);


                getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.CALCITE_BRICK_WALL);
                getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.INTERWOVEN_CALCITE_BRICK_WALL);
                getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.INTERWOVEN_POLISHED_DIORITE_WALL);
                getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.INTERWOVEN_CALCITE_WALL);
                getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.INTERWOVEN_DIORITE_WALL);
                getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.CALCITE_WALL);
                getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.SMOOTH_BASALT_WALL);
                getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.SMOOTH_STONE_WALL);
                getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.STONE_WALL);
                getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.POLISHED_GRANITE_WALL);
                getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.POLISHED_ANDESITE_WALL);
                getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.POLISHED_DIORITE_WALL);
                getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.INTERWOVEN_SANDSTONE_WALL);



    }
}
