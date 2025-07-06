package net.adam.magicmore.item;

import net.adam.magicmore.MagicAndMore;
import net.adam.magicmore.item.custom.ArrowSpawn;
import net.adam.magicmore.item.custom.MetalDetectorItem;
import net.adam.magicmore.item.custom.InvisiballItem;
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
    //items
    public  static final Item INVISIBALL = registerItem("invisiball", new InvisiballItem(new FabricItemSettings().maxDamage(40)));
    public static final Item BOB = registerItem("bob",
            new ArrowSpawn(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));
    public static final Item MAGIC_BALL = registerItem("magic_ball", new Item(new FabricItemSettings()));
    public static final Item DENSE_BRICK = registerItem("dense_brick", new Item(new FabricItemSettings()));
    public static final Item DENSER_BRICK = registerItem("denser_brick", new Item(new FabricItemSettings()));
    public static final Item SUPERDENSE_BRICK = registerItem("superdense_brick", new Item(new FabricItemSettings()));
    public static final Item PHANTASIUM_INGOT = registerItem("fantasy_ingot", new Item(new FabricItemSettings()));

    //Tabs

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(BOB);
    }
    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(PHANTASIUM_INGOT);
    }

    //registering

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MagicAndMore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MagicAndMore.LOGGER.info("registering Mod Items for " + MagicAndMore.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);


    }
}
