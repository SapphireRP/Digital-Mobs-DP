package net.sapphire.digital.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.sapphire.digital.DigitalMobs;
import net.sapphire.digital.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBlocks {
    public static final Block DATA_CHUNKS = registerBlock("data_chunks",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool()), ModItemGroup.DIGITALMOBS);

    public static final Block DIGITAL_GRASS = registerBlock("digital_grass",
            new Block(FabricBlockSettings.of(Material.PLANT).strength(0f)), ModItemGroup.DIGITALMOBS);
    public static final Block DIGITAL_DIRT = registerBlock("digital_dirt",
            new Block(FabricBlockSettings.of(Material.PLANT).strength(0f)), ModItemGroup.DIGITALMOBS);

    public static final Block CORRUPTED_LOG = registerBlock("corrupted_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(0.10f).requiresTool()), ModItemGroup.DIGITALMOBS);
    public static final Block CORRUPTED_WOOD = registerBlock("corrupted_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(0.10f).requiresTool()), ModItemGroup.DIGITALMOBS);
    public static final Block STRIPPED_CORRUPTED_LOG = registerBlock("stripped_corrupted_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(0.10f).requiresTool()), ModItemGroup.DIGITALMOBS);
    public static final Block STRIPPED_CORRUPTED_WOOD = registerBlock("stripped_corrupted_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(0.10f).requiresTool()), ModItemGroup.DIGITALMOBS);

    public static final Block CORRUPTED_PLANKS = registerBlock("corrupted_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(0.10f).requiresTool()), ModItemGroup.DIGITALMOBS);
    public static final Block CORRUPTED_LEAVES = registerBlock("corrupted_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.DIGITALMOBS);

    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey) {
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(DigitalMobs.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(DigitalMobs.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        tooltip.add(new TranslatableText(tooltipKey));
                    }
                });
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(DigitalMobs.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(DigitalMobs.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        DigitalMobs.LOGGER.info("Registering ModBlocks for " + DigitalMobs.MOD_ID);
    }
}