package net.sapphire.digital.util;


import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sapphire.digital.DigitalMobs;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> DATA_SHARD = createCommonTag("data_shard");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(DigitalMobs.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}