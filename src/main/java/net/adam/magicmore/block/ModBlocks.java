package net.adam.magicmore.block;

import net.adam.magicmore.MagicAndMore;
import net.adam.magicmore.item.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block JUMPER_BLOCK = registerBlock("jumper_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).jumpVelocityMultiplier(2).requiresTool().strength(5f)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MagicAndMore.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MagicAndMore.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void  registerModBlocks() {
        MagicAndMore.LOGGER.info("Registering ModBlocks for " + MagicAndMore.MOD_ID);
    }
}
