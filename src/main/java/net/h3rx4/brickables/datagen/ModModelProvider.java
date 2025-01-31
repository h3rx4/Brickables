package net.h3rx4.brickables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.h3rx4.brickables.block.ModBlocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INTERWOVEN_CALCITE);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INTERWOVEN_DIORITE);
        BlockStateModelGenerator.BlockTexturePool calciteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CALCITE_BRICKS);
       BlockStateModelGenerator.BlockTexturePool spiderCalciteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.INTERWOVEN_CALCITE_BRICKS);
       BlockStateModelGenerator.BlockTexturePool interwovenDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.INTERWOVEN_POLISHED_DIORITE);
        calciteBrickPool.slab(ModBlocks.CALCITE_BRICK_SLAB);
        calciteBrickPool.stairs(ModBlocks.CALCITE_BRICK_STAIRS);
        calciteBrickPool.wall(ModBlocks.CALCITE_BRICK_WALL);
        spiderCalciteBrickPool.slab(ModBlocks.INTERWOVEN_CALCITE_BRICK_SLAB);
        spiderCalciteBrickPool.stairs(ModBlocks.INTERWOVEN_CALCITE_BRICK_STAIRS);
        spiderCalciteBrickPool.wall(ModBlocks.INTERWOVEN_CALCITE_BRICK_WALL);
        interwovenDioritePool.slab(ModBlocks.INTERWOVEN_POLISHED_DIORITE_SLAB);
        interwovenDioritePool.stairs(ModBlocks.INTERWOVEN_POLISHED_DIORITE_STAIRS);
        interwovenDioritePool.wall(ModBlocks.INTERWOVEN_POLISHED_DIORITE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register();

    }
}
