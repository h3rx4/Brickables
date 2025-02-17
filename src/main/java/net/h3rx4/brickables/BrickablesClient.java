package net.h3rx4.brickables;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.h3rx4.brickables.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class BrickablesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.UNLIT_LANTERN, RenderLayer.getCutout());

    }
}
