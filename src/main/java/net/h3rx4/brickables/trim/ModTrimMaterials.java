package net.h3rx4.brickables.trim;

import net.h3rx4.brickables.Brickables;
import net.h3rx4.brickables.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class ModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> PINK_AMETHYST_SHARD = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(Brickables.MOD_ID, "pink_amethyst_shard"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, PINK_AMETHYST_SHARD, Registries.ITEM.getEntry(ModItems.PINK_AMETHYST_SHARD),
                Style.EMPTY.withColor(TextColor.parse("#ff004f").getOrThrow()), 1.0f);
    }



    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey,
                                 RegistryEntry<Item> item, Style style, float itemModelIndex) {
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(), item, itemModelIndex, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        registerable.register(armorTrimKey, trimMaterial);
    }
}
