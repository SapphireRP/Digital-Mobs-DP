package net.brendon.digital;

import net.brendon.digital.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DigitalMobs implements ModInitializer {
	public static final String MOD_ID = "digital";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void  onInitialize() {

		ModItems.registerModItems();
	}
}
