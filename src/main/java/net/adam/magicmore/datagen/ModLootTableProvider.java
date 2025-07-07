package net.adam.magicmore.datagen;

import net.adam.magicmore.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.item.Items;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.JUMPER_BLOCK);
        addDrop(ModBlocks.BUILDING_HAY);
        addDropWithSilkTouch(ModBlocks.END_TELEPORTER);
        addDrop(ModBlocks.END_TELEPORTER, Items.ENDER_PEARL);
    }
}
