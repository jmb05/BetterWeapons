package net.jmb19905.betterweapons;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jmb19905.betterweapons.effect.GoalAdder;
import net.jmb19905.betterweapons.effect.StunEffect;
import net.jmb19905.betterweapons.effect.StunGoal;
import net.jmb19905.betterweapons.item.DismountingItem;
import net.jmb19905.betterweapons.item.StaffItem;
import net.jmb19905.betterweapons.item.StunWeapon;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BetterWeapons implements ModInitializer {

	public static final String MOD_ID = "betterweapons";
	public static final SwordItem WOODEN_BATTLESTAFF = new StaffItem(ToolMaterials.WOOD, 1, -2.7F, new FabricItemSettings());
	public static final SwordItem IRON_BATTLESTAFF = new StaffItem(ToolMaterials.IRON, 1, -2.7F, new FabricItemSettings());
	public static final SwordItem GOLD_BATTLESTAFF = new StaffItem(ToolMaterials.GOLD, 1, -2.7F, new FabricItemSettings());
	public static final SwordItem DIAMOND_BATTLESTAFF = new StaffItem(ToolMaterials.DIAMOND, 1, -2.7F, new FabricItemSettings());
	public static final SwordItem NETHERITE_BATTLESTAFF = new StaffItem(ToolMaterials.NETHERITE, 1, -2.7F, new FabricItemSettings());

	public static final SwordItem IRON_DAGGER = new SwordItem(ToolMaterials.IRON, 1, -2F, new FabricItemSettings());
	public static final SwordItem GOLD_DAGGER = new SwordItem(ToolMaterials.GOLD, 1, -2F, new FabricItemSettings());
	public static final SwordItem DIAMOND_DAGGER = new SwordItem(ToolMaterials.DIAMOND, 1, -2F, new FabricItemSettings());
	public static final SwordItem NETHERITE_DAGGER = new SwordItem(ToolMaterials.NETHERITE, 1, -2F, new FabricItemSettings());

	public static final SwordItem IRON_LONGSWORD = new SwordItem(ToolMaterials.IRON, 5, -3F, new FabricItemSettings());
	public static final SwordItem GOLD_LONGSWORD = new SwordItem(ToolMaterials.GOLD, 5, -3F, new FabricItemSettings());
	public static final SwordItem DIAMOND_LONGSWORD = new SwordItem(ToolMaterials.DIAMOND, 5, -3F, new FabricItemSettings());
	public static final SwordItem NETHERITE_LONGSWORD = new SwordItem(ToolMaterials.NETHERITE, 5, -3F, new FabricItemSettings());

	public static final SwordItem WOODEN_SPEAR = new SwordItem(ToolMaterials.WOOD, 4, -3F, new FabricItemSettings());
	public static final SwordItem IRON_SPEAR = new SwordItem(ToolMaterials.IRON, 4, -3F, new FabricItemSettings());
	public static final SwordItem GOLD_SPEAR = new SwordItem(ToolMaterials.GOLD, 4, -3F, new FabricItemSettings());
	public static final SwordItem DIAMOND_SPEAR = new SwordItem(ToolMaterials.DIAMOND, 4, -3F, new FabricItemSettings());
	public static final SwordItem NETHERITE_SPEAR = new SwordItem(ToolMaterials.NETHERITE, 4, -3F, new FabricItemSettings());

	public static final SwordItem CLUB = new StunWeapon(ToolMaterials.WOOD, 6, -3.3F, 0.2f, new FabricItemSettings());
	public static final SwordItem IRON_MACE = new StunWeapon(ToolMaterials.IRON, 6, -3.3F, 0.25f, new FabricItemSettings());
	public static final SwordItem GOLD_MACE = new StunWeapon(ToolMaterials.GOLD, 6, -3.3F, 0.5f, new FabricItemSettings());
	public static final SwordItem DIAMOND_MACE = new StunWeapon(ToolMaterials.DIAMOND, 6, -3.3F, 0.2f, new FabricItemSettings());
	public static final SwordItem NETHERITE_MACE = new StunWeapon(ToolMaterials.NETHERITE, 6, -3.3F, 0.35f, new FabricItemSettings());

	public static final SwordItem IRON_GLAIVE = new SwordItem(ToolMaterials.IRON, 4, -3F, new FabricItemSettings());
	public static final SwordItem GOLD_GLAIVE = new SwordItem(ToolMaterials.GOLD, 4, -3F, new FabricItemSettings());
	public static final SwordItem DIAMOND_GLAIVE = new SwordItem(ToolMaterials.DIAMOND, 4, -3F, new FabricItemSettings());
	public static final SwordItem NETHERITE_GLAIVE = new SwordItem(ToolMaterials.NETHERITE, 4, -3F, new FabricItemSettings());

	public static final SwordItem IRON_HALBERD = new DismountingItem(ToolMaterials.IRON, 3, -3F, 0.25f, new FabricItemSettings());
	public static final SwordItem GOLD_HALBERD = new DismountingItem(ToolMaterials.GOLD, 3, -3F, 0.40f, new FabricItemSettings());
	public static final SwordItem DIAMOND_HALBERD = new DismountingItem(ToolMaterials.DIAMOND, 3, -3F, 0.2f, new FabricItemSettings());
	public static final SwordItem NETHERITE_HALBERD = new DismountingItem(ToolMaterials.NETHERITE, 3, -3F, 0.35f, new FabricItemSettings());

	public static final AxeItem IRON_LONGAXE = new AxeItem(ToolMaterials.IRON, 4, -3f, new FabricItemSettings());
	public static final AxeItem GOLD_LONGAXE = new AxeItem(ToolMaterials.GOLD, 4, -3f, new FabricItemSettings());
	public static final AxeItem DIAMOND_LONGAXE = new AxeItem(ToolMaterials.DIAMOND, 4, -3f, new FabricItemSettings());
	public static final AxeItem NETHERITE_LONGAXE = new AxeItem(ToolMaterials.NETHERITE, 4, -3f, new FabricItemSettings());


	public static final StunEffect STUN = new StunEffect(StatusEffectCategory.HARMFUL, 8815963);

	public static final GoalAdder<MobEntity> STUN_GOAL_ADDER = GoalAdder.mobGoal(MobEntity.class)
			.add(1, StunGoal::new)
			.build();

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "wooden_battlestaff"), WOODEN_BATTLESTAFF);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "iron_battlestaff"), IRON_BATTLESTAFF);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold_battlestaff"), GOLD_BATTLESTAFF);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "diamond_battlestaff"), DIAMOND_BATTLESTAFF);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "netherite_battlestaff"), NETHERITE_BATTLESTAFF);

		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "iron_dagger"), IRON_DAGGER);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold_dagger"), GOLD_DAGGER);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "diamond_dagger"), DIAMOND_DAGGER);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "netherite_dagger"), NETHERITE_DAGGER);

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

		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "iron_glaive"), IRON_GLAIVE);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold_glaive"), GOLD_GLAIVE);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "diamond_glaive"), DIAMOND_GLAIVE);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "netherite_glaive"), NETHERITE_GLAIVE);

		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "iron_halberd"), IRON_HALBERD);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold_halberd"), GOLD_HALBERD);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "diamond_halberd"), DIAMOND_HALBERD);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "netherite_halberd"), NETHERITE_HALBERD);

		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "iron_longaxe"), IRON_LONGAXE);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "gold_longaxe"), GOLD_LONGAXE);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "diamond_longaxe"), DIAMOND_LONGAXE);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "netherite_longaxe"), NETHERITE_LONGAXE);


		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "stun"), STUN);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
			content.add(WOODEN_BATTLESTAFF);
			content.add(IRON_BATTLESTAFF);
			content.add(GOLD_BATTLESTAFF);
			content.add(DIAMOND_BATTLESTAFF);
			content.add(NETHERITE_BATTLESTAFF);

			content.add(IRON_DAGGER);
			content.add(GOLD_DAGGER);
			content.add(DIAMOND_DAGGER);
			content.add(NETHERITE_DAGGER);

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

			content.add(IRON_GLAIVE);
			content.add(GOLD_GLAIVE);
			content.add(DIAMOND_GLAIVE);
			content.add(NETHERITE_GLAIVE);

			content.add(IRON_HALBERD);
			content.add(GOLD_HALBERD);
			content.add(DIAMOND_HALBERD);
			content.add(NETHERITE_HALBERD);

			content.add(IRON_LONGAXE);
			content.add(GOLD_LONGAXE);
			content.add(DIAMOND_LONGAXE);
			content.add(NETHERITE_LONGAXE);
		});

		ServerEntityEvents.ENTITY_LOAD.register((entity, world) -> STUN_GOAL_ADDER.onEntityJoinWorld(entity));
	}
}