package net.brendon.digital.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.brendon.digital.DigitalMobs;

public class ModItemGroup {
    public static final ItemGroup DIGIMON = FabricItemGroupBuilder.build(new Identifier(DigitalMobs.MOD_ID, "digimon"),
            () -> new ItemStack(ModItems.DIGIVICE));
}
