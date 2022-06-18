package net.sapphire.digital.util;

import net.sapphire.digital.DigitalMobs;
import net.sapphire.digital.block.ModBlocks;
import net.sapphire.digital.item.ModItems;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerFlammableBlock();
    }

    private static void registerFuels() {
        DigitalMobs.LOGGER.info("Registering Fuels for " + DigitalMobs.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.CLAY_COAL, 800);
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.CORRUPTED_LOG, 5, 5);
    }
}
