package io.github.mounderfod.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RodItem extends Item {
    public Enchantment enchantment;

    public RodItem(Settings settings, Enchantment enchantment) {
        super(settings);
        this.enchantment = enchantment;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable(enchantment.getTranslationKey()));
    }
}
