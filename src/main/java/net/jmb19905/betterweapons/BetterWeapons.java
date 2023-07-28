package net.jmb19905.betterweapons;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BetterWeapons implements ModInitializer {

	public static final String MOD_ID = "betterweapons";
	public static final SwordItem WOODEN_BATTLESTAFF = new SwordItem(ToolMaterials.WOOD, 1, -2.7F, new FabricItemSettings());
	public static final SwordItem IRON_BATTLESTAFF = new SwordItem(ToolMaterials.IRON, 1, -2.7F, new FabricItemSettings());
	public static final SwordItem GOLD_BATTLESTAFF = new SwordItem(ToolMaterials.GOLD, 1, -2.7F, new FabricItemSettings());
	public static final SwordItem DIAMOND_BATTLESTAFF = new SwordItem(ToolMaterials.DIAMOND, 1, -2.7F, new FabricItemSettings());
	public static final SwordItem NETHERITE_BATTLESTAFF = new SwordItem(ToolMaterials.NETHERITE, 1, -2.7F, new FabricItemSettings());

	public static final SwordItem WOODEN_DAGGER = new SwordItem(ToolMaterials.WOOD, 1, -2F, new FabricItemSettings());
	public static final SwordItem IRON_DAGGER = new SwordItem(ToolMaterials.IRON, 1, -2F, new FabricItemSettings());
	public static final SwordItem GOLD_DAGGER = new SwordItem(ToolMaterials.GOLD, 1, -2F, new FabricItemSettings());
	public static final SwordItem DIAMOND_DAGGER = new SwordItem(ToolMaterials.DIAMOND, 1, -2F, new FabricItemSettings());
	public static final SwordItem NETHERITE_DAGGER = new SwordItem(ToolMaterials.NETHERITE, 1, -2F, new FabricItemSettings());

	public static final SwordItem WOODEN_LONGSWORD = new SwordItem(ToolMaterials.WOOD, 5, -3F, new FabricItemSettings());
	public static final SwordItem IRON_LONGSWORD = new SwordItem(ToolMaterials.IRON, 5, -3F, new FabricItemSettings());
	public static final SwordItem GOLD_LONGSWORD = new SwordItem(ToolMaterials.GOLD, 5, -3F, new FabricItemSettings());
	public static final SwordItem DIAMOND_LONGSWORD = new SwordItem(ToolMaterials.DIAMOND, 5, -3F, new FabricItemSettings());
	public static final SwordItem NETHERITE_LONGSWORD = new SwordItem(ToolMaterials.NETHERITE, 5, -3F, new FabricItemSettings());

	public static final SwordItem WOODEN_SPEAR = new SwordItem(ToolMaterials.WOOD, 5, -3F, new FabricItemSettings());
	public static final SwordItem IRON_SPEAR = new SwordItem(ToolMaterials.WOOD, 5, -3F, new FabricItemSettings());
	public static final SwordItem GOLD_SPEAR = new SwordItem(ToolMaterials.WOOD, 5, -3F, new FabricItemSettings());
	public static final SwordItem DIAMOND_SPEAR = new SwordItem(ToolMaterials.WOOD, 5, -3F, new FabricItemSettings());
	public static final SwordItem NETHERITE_SPEAR = new SwordItem(ToolMaterials.WOOD, 5, -3F, new FabricItemSettings());

	public static final SwordItem CLUB = new SwordItem(ToolMaterials.WOOD, 4, -3.3F, new FabricItemSettings());
	public static final SwordItem IRON_MACE = new SwordItem(ToolMaterials.IRON, 5, -3.3F, new FabricItemSettings());
	public static final SwordItem GOLD_MACE = new SwordItem(ToolMaterials.IRON, 3, -3.3F, new FabricItemSettings());
	public static final SwordItem DIAMOND_MACE = new SwordItem(ToolMaterials.IRON, 6, -3.3F, new FabricItemSettings());
	public static final SwordItem NETHERITE_MACE = new SwordItem(ToolMaterials.IRON, 7, -3.3F, new FabricItemSettings());

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "wooden_battlestaff"), WOODEN_BATTLESTAFF);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "iron_battlestaff"), IRON_BATTLESTAFF);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold_battlestaff"), GOLD_BATTLESTAFF);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "diamond_battlestaff"), DIAMOND_BATTLESTAFF);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "netherite_battlestaff"), NETHERITE_BATTLESTAFF);

		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "wooden_dagger"), WOODEN_DAGGER);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "iron_dagger"), IRON_DAGGER);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold_dagger"), GOLD_DAGGER);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "diamond_dagger"), DIAMOND_DAGGER);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "netherite_dagger"), NETHERITE_DAGGER);

		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "wooden_longsword"), WOODEN_LONGSWORD);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "iron_longsword"), IRON_LONGSWORD);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold_longsword"), GOLD_LONGSWORD);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "diamond_longsword"), DIAMOND_LONGSWORD);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "netherite_longsword"), NETHERITE_LONGSWORD);

		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "wooden_spear"), WOODEN_SPEAR);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "iron_spear"), IRON_SPEAR);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold_spear"), GOLD_SPEAR);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "diamond_spear"), DIAMOND_SPEAR);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "netherite_spear"), NETHERITE_SPEAR);

		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "club"), CLUB);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "iron_mace"), IRON_MACE);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold_mace"), GOLD_MACE);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "diamond_mace"), DIAMOND_MACE);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "netherite_mace"), NETHERITE_MACE);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
			content.add(WOODEN_BATTLESTAFF);
			content.add(IRON_BATTLESTAFF);
			content.add(GOLD_BATTLESTAFF);
			content.add(DIAMOND_BATTLESTAFF);
			content.add(NETHERITE_BATTLESTAFF);

			content.add(WOODEN_DAGGER);
			content.add(IRON_DAGGER);
			content.add(GOLD_DAGGER);
			content.add(DIAMOND_DAGGER);
			content.add(NETHERITE_DAGGER);

			content.add(WOODEN_LONGSWORD);
			content.add(IRON_LONGSWORD);
			content.add(GOLD_LONGSWORD);
			content.add(DIAMOND_LONGSWORD);
			content.add(NETHERITE_LONGSWORD);

			content.add(WOODEN_SPEAR);
			content.add(IRON_SPEAR);
			content.add(GOLD_SPEAR);
			content.add(DIAMOND_SPEAR);
			content.add(NETHERITE_SPEAR);

			content.add(CLUB);
			content.add(IRON_MACE);
			content.add(GOLD_MACE);
			content.add(DIAMOND_MACE);
			content.add(NETHERITE_MACE);
		});
	}
}