package net.adam.magicmore.item;

import net.adam.magicmore.MagicAndMore;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item BOB = registerItem("bob", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof().maxCount(1)));
    public static final Item PHANTASIUM_INGOT = registerItem("fantasy_ingot", new Item(new FabricItemSettings()));
    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(BOB);
    }
    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(PHANTASIUM_INGOT);

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MagicAndMore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MagicAndMore.LOGGER.info("registering Mod Items for " + MagicAndMore.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);

    }
}
