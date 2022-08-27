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


public class OmniShardItem extends Item {
    public OmniShardItem(Settings settings) {
        super(settings.group(ModItemGroup.DIGITALMOBS));
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("§1Wonder What Would Happen If You Fuse Two Of Them Together"));
    }

}