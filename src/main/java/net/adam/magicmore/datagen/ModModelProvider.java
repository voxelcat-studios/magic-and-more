package net.adam.magicmore.datagen;

import net.adam.magicmore.MagicAndMore;
import net.adam.magicmore.block.ModBlocks;
import net.adam.magicmore.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
        generator.registerSimpleCubeAll(ModBlocks.JUMPER_BLOCK);
        generator.registerSimpleCubeAll(ModBlocks.END_TELEPORTER);
        generator.registerSimpleCubeAll(ModBlocks.BUILDING_HAY);
        

    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DENSE_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.DENSER_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUPERDENSE_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.HANDHELD_ROD);
        itemModelGenerator.register(ModItems.PHANTASIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.INVISIBALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGIC_BALL, Models.GENERATED);
    }
}
