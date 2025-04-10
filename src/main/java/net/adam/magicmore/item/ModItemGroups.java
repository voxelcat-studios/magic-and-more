package net.adam.magicmore.item;

import net.adam.magicmore.MagicAndMore;
import net.adam.magicmore.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MinecartItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup MAGIC = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MagicAndMore.MOD_ID, "fantasy"),
            FabricItemGroup.builder().displayName(Text.translatable("magicmore.itemgroup.magic"))
                    .icon(() -> new ItemStack(ModItems.PHANTASIUM_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PHANTASIUM_INGOT);
                        entries.add(Items.COPPER_INGOT);

                    }).build());
    public static final ItemGroup MORE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MagicAndMore.MOD_ID, "more"),
            FabricItemGroup.builder().displayName(Text.translatable("magicmore.itemgroup.more"))
                    .icon(() -> new ItemStack(ModItems.BOB)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BOB);
                        entries.add(ModBlocks.DEV_BLOCK);
                        entries.add(ModItems.DENSE_BRICK);
                        entries.add(ModItems.DENSER_BRICK);
                        entries.add(ModItems.SUPERDENSE_BRICK);
                    }).build());

    public static void registerItemGroups() {
        MagicAndMore.LOGGER.info("Registering Item Groups for " + MagicAndMore.MOD_ID);
    }

}
