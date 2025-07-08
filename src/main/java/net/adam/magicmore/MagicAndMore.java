package net.adam.magicmore;

import net.adam.magicmore.block.ModBlocks;
import net.adam.magicmore.entity.ModEntities;
import net.adam.magicmore.entity.custom.PorcupineEntity;
import net.adam.magicmore.item.ModItemGroups;
import net.adam.magicmore.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicAndMore implements ModInitializer {
	public static final String MOD_ID = "magicmore";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());
		LOGGER.info("MAGIC!!!!");
	}
}