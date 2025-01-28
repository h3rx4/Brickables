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
       BlockStateModelGenerator.BlockTexturePool calciteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CALCITE_BRICKS);
       BlockStateModelGenerator.BlockTexturePool spiderCalciteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPIDER_CALCITE_BRICKS);
        calciteBrickPool.slab(ModBlocks.CALCITE_BRICK_SLAB);
        calciteBrickPool.stairs(ModBlocks.CALCITE_BRICK_STAIRS);
        calciteBrickPool.wall(ModBlocks.CALCITE_BRICK_WALL);
        spiderCalciteBrickPool.slab(ModBlocks.SPIDER_CALCITE_BRICK_SLAB);
        spiderCalciteBrickPool.stairs(ModBlocks.SPIDER_CALCITE_BRICK_STAIRS);
        spiderCalciteBrickPool.wall(ModBlocks.SPIDER_CALCITE_BRICK_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register();

    }
}
