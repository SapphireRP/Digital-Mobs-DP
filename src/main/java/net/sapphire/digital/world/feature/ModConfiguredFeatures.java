package net.sapphire.digital.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.sapphire.digital.DigitalMobs;
import net.sapphire.digital.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_DATA_CHUNKS = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.DATA_CHUNKS.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DATA_CHUNKS.getDefaultState()));

    public static final List<OreFeatureConfig.Target> OVERWORLD_HUANGLONG_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.HUANGLONG_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.HUANGLONG_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> OVERWORLD_DIGICOPPER_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.DIGICOPPER_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DIGICOPPER_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> OVERWORLD_MITHRIL_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MITHRIL_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.MITHRIL_ORE.getDefaultState()));



    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DATA_CHUNKS =
            ConfiguredFeatures.register("data_chunk", Feature.ORE, new OreFeatureConfig(OVERWORLD_DATA_CHUNKS, 24));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> HUANGLONG_ORE =
            ConfiguredFeatures.register("huanglong_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_HUANGLONG_ORE, 12));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DIGICOPPER_ORE =
            ConfiguredFeatures.register("digicopper_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_DIGICOPPER_ORE, 6));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MITHRIL_ORE =
            ConfiguredFeatures.register("mithril_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_MITHRIL_ORE, 3));


    public static void registerConfiguredFeatures() {
        DigitalMobs.LOGGER.debug("Registering the ModConfiguredFeatures" + DigitalMobs.MOD_ID);
    }
}
