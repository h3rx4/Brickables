package net.h3rx4.brickables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.h3rx4.brickables.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.CALCITE_BRICKS);
        addDrop(ModBlocks.CALCITE_BRICK_STAIRS);
        addDrop(ModBlocks.CALCITE_BRICK_SLAB, slabDrops(ModBlocks.CALCITE_BRICK_SLAB));
        addDrop(ModBlocks.INTERWOVEN_CALCITE_BRICKS);
        addDrop(ModBlocks.INTERWOVEN_CALCITE_BRICK_STAIRS);
        addDrop(ModBlocks.INTERWOVEN_CALCITE_BRICK_SLAB, slabDrops(ModBlocks.INTERWOVEN_CALCITE_BRICK_SLAB));
        addDrop(ModBlocks.INTERWOVEN_CALCITE_BRICK_WALL);
        addDrop(ModBlocks.CALCITE_BRICK_WALL);
        addDrop(ModBlocks.INTERWOVEN_POLISHED_DIORITE);
        addDrop(ModBlocks.INTERWOVEN_POLISHED_DIORITE_WALL);
        addDrop(ModBlocks.INTERWOVEN_POLISHED_DIORITE_STAIRS);
        addDrop(ModBlocks.INTERWOVEN_POLISHED_DIORITE_SLAB, slabDrops(ModBlocks.INTERWOVEN_POLISHED_DIORITE_SLAB));
        addDrop(ModBlocks.INTERWOVEN_CALCITE);
        addDrop(ModBlocks.INTERWOVEN_DIORITE);
        addDrop(ModBlocks.INTERWOVEN_CALCITE_SLAB);
        addDrop(ModBlocks.INTERWOVEN_CALCITE_STAIRS);
        addDrop(ModBlocks.INTERWOVEN_CALCITE_WALL);
        addDrop(ModBlocks.INTERWOVEN_DIORITE_SLAB);
        addDrop(ModBlocks.INTERWOVEN_DIORITE_STAIRS);
        addDrop(ModBlocks.INTERWOVEN_DIORITE_WALL);
        addDrop(ModBlocks.CALCITE_SLAB);
        addDrop(ModBlocks.CALCITE_WALL);
        addDrop(ModBlocks.CALCITE_STAIRS);
        addDrop(ModBlocks.SMOOTH_BASALT_SLAB);
        addDrop(ModBlocks.SMOOTH_BASALT_STAIRS);
        addDrop(ModBlocks.SMOOTH_BASALT_WALL);
        addDrop(ModBlocks.INTERWOVEN_ICE);
        addDrop(ModBlocks.CALCITE_PILLAR);
        addDrop(ModBlocks.BLUE_SHROOMLIGHT);
        addDrop(ModBlocks.FOLLY_SHROOMLIGHT);

    }
}
