package net.sapphire.digital;

import net.sapphire.digital.block.ModBlocks;
import net.sapphire.digital.item.ModItems;
import net.sapphire.digital.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DigitalMobs implements ModInitializer {
	public static final String MOD_ID = "digital";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();
	}
}

