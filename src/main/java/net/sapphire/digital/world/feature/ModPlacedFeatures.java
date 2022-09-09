package net.sapphire.digital.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> DATA_CHUNKS_PLACED = PlacedFeatures.register("data_chunks_placed",
            ModConfiguredFeatures.DATA_CHUNKS, modifiersWithCount(24,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> HUANGLONG_ORE_PLACED = PlacedFeatures.register("huanglong_ore_placed",
            ModConfiguredFeatures.HUANGLONG_ORE, modifiersWithCount(12,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-70), YOffset.fixed(70))));

    public static final RegistryEntry<PlacedFeature> DIGICOPPER_ORE_PLACED = PlacedFeatures.register("digicopper_ore_placed",
            ModConfiguredFeatures.DIGICOPPER_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-60), YOffset.fixed(60))));

    public static final RegistryEntry<PlacedFeature> MITHRIL_ORE_PLACED = PlacedFeatures.register("mithril_ore_placed",
            ModConfiguredFeatures.MITHRIL_ORE, modifiersWithCount(3,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-50), YOffset.fixed(50))));

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
