package net.sapphire.digital;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.sapphire.digital.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class DigitalClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CORRUPTED_LEAVES, RenderLayer.getCutout());

    }
}