package net.h3rx4.brickables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.h3rx4.brickables.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("RRR")
                .input('R', ModBlocks.CALCITE_BRICKS)
                .criterion(hasItem(ModBlocks.CALCITE_BRICKS), conditionsFromItem(ModBlocks.CALCITE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.CALCITE_BRICKS)
                .criterion(hasItem(ModBlocks.CALCITE_BRICKS), conditionsFromItem(ModBlocks.CALCITE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, 6)
                .pattern("   ")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModBlocks.CALCITE_BRICKS)
                .criterion(hasItem(ModBlocks.CALCITE_BRICKS), conditionsFromItem(ModBlocks.CALCITE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, 4)
                .pattern("   ")
                .pattern("RR ")
                .pattern("RR ")
                .input('R', Blocks.CALCITE)
                .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPIDER_CALCITE_BRICKS,4)
                .pattern(" R ")
                .pattern("RER")
                .pattern(" R ")
                .input('R', ModBlocks.CALCITE_BRICKS)
                .input('E', Items.SPIDER_EYE)
                .criterion(hasItem(Items.SPIDER_EYE), conditionsFromItem(Items.SPIDER_EYE))
                .criterion(hasItem(ModBlocks.CALCITE_BRICKS), conditionsFromItem(ModBlocks.CALCITE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPIDER_CALCITE_BRICK_WALL, 6)
                .pattern("   ")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModBlocks.SPIDER_CALCITE_BRICKS)
                .criterion(hasItem(ModBlocks.SPIDER_CALCITE_BRICKS), conditionsFromItem(ModBlocks.SPIDER_CALCITE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPIDER_CALCITE_BRICK_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.SPIDER_CALCITE_BRICKS)
                .criterion(hasItem(ModBlocks.SPIDER_CALCITE_BRICKS), conditionsFromItem(ModBlocks.SPIDER_CALCITE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPIDER_CALCITE_BRICK_SLAB, 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("RRR")
                .input('R', ModBlocks.SPIDER_CALCITE_BRICKS)
                .criterion(hasItem(ModBlocks.SPIDER_CALCITE_BRICKS), conditionsFromItem(ModBlocks.SPIDER_CALCITE_BRICKS))
                .offerTo(exporter);
    }
}
