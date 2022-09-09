package net.sapphire.digital;

import net.fabricmc.api.ModInitializer;
import net.sapphire.digital.block.ModBlocks;
import net.sapphire.digital.item.ModItems;
import net.sapphire.digital.util.ModRegistries;
import net.sapphire.digital.world.feature.ModConfiguredFeatures;
import net.sapphire.digital.world.gen.ModOreGeneration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class DigitalMobs implements ModInitializer {
	public static final String MOD_ID = "digital";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


		ModRegistries.registerModStuffs();
		ModOreGeneration.generateOres();
	}
}

