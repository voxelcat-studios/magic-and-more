package net.adam.magicmore.block;

import net.adam.magicmore.MagicAndMore;
import net.adam.magicmore.block.custom.EnderPortBlock;
import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BUILDING_HAY = registerBlock("building_hay", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    public static final Block JUMPER_BLOCK = registerBlock("jumper_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).jumpVelocityMultiplier(2).requiresTool().strength(5f)));

    public static final Block END_TELEPORTER = registerBlock("end_tp",
            new EnderPortBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

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
