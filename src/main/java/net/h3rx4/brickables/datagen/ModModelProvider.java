package net.h3rx4.brickables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.h3rx4.brickables.block.ModBlocks;
import net.h3rx4.brickables.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
       BlockStateModelGenerator.BlockTexturePool calciteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CALCITE_BRICKS);
       BlockStateModelGenerator.BlockTexturePool spiderCalciteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.INTERWOVEN_CALCITE_BRICKS);
       BlockStateModelGenerator.BlockTexturePool interwovenPolishedDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.INTERWOVEN_POLISHED_DIORITE);
       BlockStateModelGenerator.BlockTexturePool interwovenCalcitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.INTERWOVEN_CALCITE);
       BlockStateModelGenerator.BlockTexturePool interwovenDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.INTERWOVEN_DIORITE);
       BlockStateModelGenerator.BlockTexturePool calcitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CALCITE);
       BlockStateModelGenerator.BlockTexturePool basaltPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_BASALT);
       BlockStateModelGenerator.BlockTexturePool interwovenIcePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.INTERWOVEN_ICE);
       BlockStateModelGenerator.BlockTexturePool blueShroomlightPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_SHROOMLIGHT);
       BlockStateModelGenerator.BlockTexturePool follyShroomLightPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FOLLY_SHROOMLIGHT);
        calciteBrickPool.slab(ModBlocks.CALCITE_BRICK_SLAB);
        calciteBrickPool.stairs(ModBlocks.CALCITE_BRICK_STAIRS);
        calciteBrickPool.wall(ModBlocks.CALCITE_BRICK_WALL);
        spiderCalciteBrickPool.slab(ModBlocks.INTERWOVEN_CALCITE_BRICK_SLAB);
        spiderCalciteBrickPool.stairs(ModBlocks.INTERWOVEN_CALCITE_BRICK_STAIRS);
        spiderCalciteBrickPool.wall(ModBlocks.INTERWOVEN_CALCITE_BRICK_WALL);
        interwovenPolishedDioritePool.slab(ModBlocks.INTERWOVEN_POLISHED_DIORITE_SLAB);
        interwovenPolishedDioritePool.stairs(ModBlocks.INTERWOVEN_POLISHED_DIORITE_STAIRS);
        interwovenPolishedDioritePool.wall(ModBlocks.INTERWOVEN_POLISHED_DIORITE_WALL);
        interwovenCalcitePool.wall(ModBlocks.INTERWOVEN_CALCITE_WALL);
        interwovenCalcitePool.slab(ModBlocks.INTERWOVEN_CALCITE_SLAB);
        interwovenCalcitePool.stairs(ModBlocks.INTERWOVEN_CALCITE_STAIRS);
        interwovenDioritePool.slab(ModBlocks.INTERWOVEN_DIORITE_SLAB);
        interwovenDioritePool.wall(ModBlocks.INTERWOVEN_DIORITE_WALL);
        interwovenDioritePool.stairs(ModBlocks.INTERWOVEN_DIORITE_STAIRS);
        calcitePool.stairs(ModBlocks.CALCITE_STAIRS);
        calcitePool.wall(ModBlocks.CALCITE_WALL);
        calcitePool.slab(ModBlocks.CALCITE_SLAB);
        basaltPool.stairs(ModBlocks.SMOOTH_BASALT_STAIRS);
        basaltPool.wall(ModBlocks.SMOOTH_BASALT_WALL);
        basaltPool.slab(ModBlocks.SMOOTH_BASALT_SLAB);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.THE_TALE_OF_A_CRUEL_WORLD_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register();

    }
}
