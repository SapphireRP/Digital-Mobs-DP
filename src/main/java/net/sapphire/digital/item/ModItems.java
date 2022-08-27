package net.sapphire.digital.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sapphire.digital.DigitalMobs;
import net.sapphire.digital.item.custom.ModAxeItem;
import net.sapphire.digital.item.custom.ModFireAspectSwordItem;
import net.sapphire.digital.item.custom.materials_ores.*;
import net.sapphire.digital.item.custom.ModPickaxeItem;
import net.sapphire.digital.item.custom.obs.AlterOrbItem;
import net.sapphire.digital.item.custom.obs.AlterShardItem;
import net.sapphire.digital.item.custom.obs.OmniOrbItem;
import net.sapphire.digital.item.custom.obs.OmniShardItem;

public class ModItems {

    public static final Item DATA_SHARD = registerItem("data_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    public static final Item DIGI_COPPER = registerItem("digi_copper",
            new DigiCopperItem(new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    public static final Item DIGI_IRON = registerItem("digi_iron",
            new DigiIronItem(new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    public static final Item DIGI_SILVER = registerItem("digi_silver",
            new DigiSilverItem(new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    public static final Item DIGI_GOLD = registerItem("digi_gold",
            new DigiGoldItem(new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    public static final Item DIGI_WHITEGOLD = registerItem("digi_whitegold",
            new DigiWhiteGoldItem(new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    public static final Item MITHRIL = registerItem("mithril",
            new MithrilItem(new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    public static final Item ALTER_ORB = registerItem("alter_orb",
            new AlterOrbItem(new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    public static final Item OMNI_ORB = registerItem("omni_orb",
            new OmniOrbItem(new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    public static final Item ALTER_SHARD = registerItem("alter_shard",
            new AlterShardItem(new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    public static final Item OMNI_SHARD = registerItem("omni_shard",
            new OmniShardItem(new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    public static final Item CLAY_COAL = registerItem("clay_coal",
            new Item(new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    public static final Item CHAOS_SWORD = registerItem("chaos_sword",
            new ModFireAspectSwordItem(ModToolMaterials.DIGI_COPPER, 10, 8f,
                    new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    public static final Item CHAOS_HAMMER = registerItem("chaos_hammer",
            new ModAxeItem(ModToolMaterials.DIGI_COPPER, 8, 6f,
                    new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    public static final Item CHAOS_SHOVEL = registerItem("chaos_shovel",
            new ShovelItem(ModToolMaterials.DIGI_COPPER, 3, 3f,
                    new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    public static final Item CHAOS_PICKAXE = registerItem("chaos_pickaxe",
            new ModPickaxeItem(ModToolMaterials.DIGI_COPPER, 5, 3f,
                    new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    private  static  Item registerItem(String name, Item item) {
        return  Registry.register(Registry.ITEM, new Identifier(DigitalMobs.MOD_ID, name), item);
    }


    public static void registerModItems()
        {DigitalMobs.LOGGER.info("Registering Mod Items For" + DigitalMobs.MOD_ID);
    }
}
