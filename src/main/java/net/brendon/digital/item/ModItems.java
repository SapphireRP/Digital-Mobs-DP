package net.brendon.digital.item;

import net.brendon.digital.DigitalMobs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item HUANGLONGORE_INGOT = registerItem("huanglongore_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.DIGIMON)));

    public static final Item DIGIVICE = registerItem("digivice",
            new Item(new FabricItemSettings().group(ModItemGroup.DIGIMON).maxCount(1)));

    public static final Item DIGIVICEBLUE = registerItem("digivice_blue",
            new Item(new FabricItemSettings().group(ModItemGroup.DIGIMON).maxCount(1)));

    public static final Item DIGIVICEGRAY = registerItem("digivice_gray",
            new Item(new FabricItemSettings().group(ModItemGroup.DIGIMON).maxCount(1)));

    public static final Item DIGIVICEGREEN = registerItem("digivice_green",
            new Item(new FabricItemSettings().group(ModItemGroup.DIGIMON).maxCount(1)));

    public static final Item DIGIVICEORANGE = registerItem("digivice_orange",
            new Item(new FabricItemSettings().group(ModItemGroup.DIGIMON).maxCount(1)));

    public static final Item DIGIVICEPINK = registerItem("digivice_pink",
            new Item(new FabricItemSettings().group(ModItemGroup.DIGIMON).maxCount(1)));

    public static final Item DIGIVICEPURPLE = registerItem("digivice_purple",
            new Item(new FabricItemSettings().group(ModItemGroup.DIGIMON).maxCount(1)));

    public static final Item DIGIVICERED = registerItem("digivice_red",
            new Item(new FabricItemSettings().group(ModItemGroup.DIGIMON).maxCount(1)));

    public static final Item DIGIVICEYELLOW = registerItem("digivice_yellow",
            new Item(new FabricItemSettings().group(ModItemGroup.DIGIMON).maxCount(1)));

    private  static  Item registerItem(String name, Item item) {
        return  Registry.register(Registry.ITEM, new Identifier(DigitalMobs.MOD_ID, name), item);
    }


    public static void registerModItems()
        {DigitalMobs.LOGGER.info("Registering Mod Items For" + DigitalMobs.MOD_ID);
    }
}
