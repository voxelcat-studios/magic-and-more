package net.adam.magicmore;

import net.adam.magicmore.entity.ModEntities;
import net.adam.magicmore.entity.client.ModModelLayers;
import net.adam.magicmore.entity.client.PorcupineModel;
import net.adam.magicmore.entity.client.PorcupineRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class MagicAndMoreClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.PORCUPINE, PorcupineRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PORCUPINE, PorcupineModel::getTexturedModelData);
    }
}