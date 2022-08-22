package net.sapphire.digital.item.custom.materials_ores;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import net.sapphire.digital.item.ModItemGroup;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class DigiCopperItem extends Item {
    public DigiCopperItem(Settings settings) {
        super(settings.group(ModItemGroup.DIGITALMOBS));
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("Metal similar to brass in the Digital World."));
    }

}