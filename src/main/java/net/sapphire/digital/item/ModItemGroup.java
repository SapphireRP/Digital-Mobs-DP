package net.sapphire.digital.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.sapphire.digital.DigitalMobs;


public class ModItemGroup {
    public static final ItemGroup DIGITALMOBS = FabricItemGroupBuilder.build(new Identifier(DigitalMobs.MOD_ID, "digital-mobs"),
            () -> new ItemStack(ModItems.DATA_SHARD));
}
