package net.h3rx4.brickables.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.h3rx4.brickables.Brickables;
import net.h3rx4.brickables.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BRICKABLES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Brickables.MOD_ID, "brickables"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.CALCITE_BRICKS))
                    .displayName(Text.translatable("itemgroup.brickables.brickables"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CALCITE_BRICKS);
                        entries.add(ModBlocks.CALCITE_BRICK_STAIRS);
                        entries.add(ModBlocks.CALCITE_BRICK_SLAB);
                        entries.add(ModBlocks.CALCITE_BRICK_WALL);
                        entries.add(ModBlocks.INTERWOVEN_CALCITE_BRICKS);
                        entries.add(ModBlocks.INTERWOVEN_CALCITE_BRICK_STAIRS);
                        entries.add(ModBlocks.INTERWOVEN_CALCITE_BRICK_SLAB);
                        entries.add(ModBlocks.INTERWOVEN_CALCITE_BRICK_WALL);
                        entries.add(ModBlocks.INTERWOVEN_CALCITE);
                        entries.add(ModBlocks.INTERWOVEN_DIORITE);
                        entries.add(ModBlocks.INTERWOVEN_POLISHED_DIORITE);
                        entries.add(ModBlocks.INTERWOVEN_POLISHED_DIORITE_SLAB);
                        entries.add(ModBlocks.INTERWOVEN_POLISHED_DIORITE_STAIRS);
                        entries.add(ModBlocks.INTERWOVEN_POLISHED_DIORITE_WALL);
                        entries.add(ModBlocks.INTERWOVEN_CALCITE_SLAB);
                        entries.add(ModBlocks.INTERWOVEN_CALCITE_STAIRS);
                        entries.add(ModBlocks.INTERWOVEN_CALCITE_WALL);
                        entries.add(ModBlocks.INTERWOVEN_DIORITE_SLAB);
                        entries.add(ModBlocks.INTERWOVEN_DIORITE_WALL);
                        entries.add(ModBlocks.INTERWOVEN_DIORITE_STAIRS);
                        entries.add(ModBlocks.CALCITE_SLAB);
                        entries.add(ModBlocks.CALCITE_STAIRS);
                        entries.add(ModBlocks.CALCITE_WALL);
                        entries.add(ModBlocks.SMOOTH_BASALT_SLAB);
                        entries.add(ModBlocks.SMOOTH_BASALT_STAIRS);
                        entries.add(ModBlocks.SMOOTH_BASALT_WALL);


                    })


                    .build());



    public static void registerItemGroups() {
        Brickables.LOGGER.info("Registering Item Groups for" + Brickables.MOD_ID);
    }
}
