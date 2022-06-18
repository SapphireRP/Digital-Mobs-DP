package net.sapphire.digital.item;

import net.sapphire.digital.DigitalMobs;
import net.sapphire.digital.item.custom.DataFinderItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item DATA_SHARD = registerItem("data_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    public static final Item DATA_FINDER = registerItem("data_finder",
            new DataFinderItem(new FabricItemSettings().group(ModItemGroup.DIGITALMOBS).maxCount(1)));

    public static final Item CLAY_COAL = registerItem("clay_coal",
            new Item(new FabricItemSettings().group(ModItemGroup.DIGITALMOBS)));

    private  static  Item registerItem(String name, Item item) {
        return  Registry.register(Registry.ITEM, new Identifier(DigitalMobs.MOD_ID, name), item);
    }


    public static void registerModItems()
        {DigitalMobs.LOGGER.info("Registering Mod Items For" + DigitalMobs.MOD_ID);
    }
}
