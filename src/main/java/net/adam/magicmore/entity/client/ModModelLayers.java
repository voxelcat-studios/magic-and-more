package net.adam.magicmore.entity.client;

import net.adam.magicmore.MagicAndMore;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer PORCUPINE =
            new EntityModelLayer(new Identifier(MagicAndMore.MOD_ID, "porcupine"), "main");
}
