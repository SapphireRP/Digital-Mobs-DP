package net.sapphire.digital.item.custom.obs;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import net.sapphire.digital.item.ModItemGroup;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class AlterOrbItem extends Item {
    public AlterOrbItem(Settings settings) {
        super(settings.group(ModItemGroup.DIGITALMOBS));
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("§eIt Might Be Able To Let One Digimon Become Their Alter Forms"));
    }

}