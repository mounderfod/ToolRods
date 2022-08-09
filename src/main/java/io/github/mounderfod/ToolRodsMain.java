package io.github.mounderfod;

import io.github.mounderfod.item.RodItem;
import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToolRodsMain implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("tool_rods");

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("tool_rods", "emerald_rod"), new RodItem(new Item.Settings().group(ItemGroup.MATERIALS).rarity(Rarity.RARE), Enchantments.FORTUNE));
		Registry.register(Registry.ITEM, new Identifier("tool_rods", "bone_rod"), new RodItem(new Item.Settings().group(ItemGroup.MATERIALS).rarity(Rarity.RARE), Enchantments.SHARPNESS));
		Registry.register(Registry.ITEM, new Identifier("tool_rods", "diamond_rod"), new RodItem(new Item.Settings().group(ItemGroup.MATERIALS).rarity(Rarity.RARE), Enchantments.SILK_TOUCH));
		Registry.register(Registry.ITEM, new Identifier("tool_rods", "obsidian_rod"), new RodItem(new Item.Settings().group(ItemGroup.MATERIALS).rarity(Rarity.RARE), Enchantments.LOOTING));
		LOGGER.info("Consider your taters tinied.");
	}
}
