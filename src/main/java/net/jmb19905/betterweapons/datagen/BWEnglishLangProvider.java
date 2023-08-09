package net.jmb19905.betterweapons.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.jmb19905.betterweapons.BetterWeapons;

public class BWEnglishLangProvider extends FabricLanguageProvider {

    protected BWEnglishLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(BetterWeapons.WOODEN_BATTLESTAFF, "Wooden Battlestaff");
        translationBuilder.add(BetterWeapons.IRON_BATTLESTAFF, "Iron Battlestaff");
        translationBuilder.add(BetterWeapons.GOLD_BATTLESTAFF, "Gold Battlestaff");
        translationBuilder.add(BetterWeapons.DIAMOND_BATTLESTAFF, "Diamond Battlestaff");
        translationBuilder.add(BetterWeapons.NETHERITE_BATTLESTAFF, "Netherite Battlestaff");

        translationBuilder.add(BetterWeapons.IRON_DAGGER, "Iron Dagger");
        translationBuilder.add(BetterWeapons.GOLD_DAGGER, "Gold Dagger");
        translationBuilder.add(BetterWeapons.DIAMOND_DAGGER, "Diamond Dagger");
        translationBuilder.add(BetterWeapons.NETHERITE_DAGGER, "Netherite Dagger");

        translationBuilder.add(BetterWeapons.IRON_LONGSWORD, "Iron Longsword");
        translationBuilder.add(BetterWeapons.GOLD_LONGSWORD, "Gold Longsword");
        translationBuilder.add(BetterWeapons.DIAMOND_LONGSWORD, "Diamond Longsword");
        translationBuilder.add(BetterWeapons.NETHERITE_LONGSWORD, "Netherite Longsword");

        translationBuilder.add(BetterWeapons.WOODEN_SPEAR, "Wooden Spear");
        translationBuilder.add(BetterWeapons.IRON_SPEAR, "Iron Spear");
        translationBuilder.add(BetterWeapons.GOLD_SPEAR, "Gold Spear");
        translationBuilder.add(BetterWeapons.DIAMOND_SPEAR, "Diamond Spear");
        translationBuilder.add(BetterWeapons.NETHERITE_SPEAR, "Netherite Spear");

        translationBuilder.add(BetterWeapons.CLUB, "Club");
        translationBuilder.add(BetterWeapons.IRON_MACE, "Iron Mace");
        translationBuilder.add(BetterWeapons.GOLD_MACE, "Gold Mace");
        translationBuilder.add(BetterWeapons.DIAMOND_MACE, "Diamond Mace");
        translationBuilder.add(BetterWeapons.NETHERITE_MACE, "Netherite Mace");

        translationBuilder.add(BetterWeapons.IRON_GLAIVE, "Iron Glaive");
        translationBuilder.add(BetterWeapons.GOLD_GLAIVE, "Gold Glaive");
        translationBuilder.add(BetterWeapons.DIAMOND_GLAIVE, "Diamond Glaive");
        translationBuilder.add(BetterWeapons.NETHERITE_GLAIVE, "Netherite Glaive");

        translationBuilder.add(BetterWeapons.IRON_HALBERD, "Iron Halberd");
        translationBuilder.add(BetterWeapons.GOLD_HALBERD, "Gold Halberd");
        translationBuilder.add(BetterWeapons.DIAMOND_HALBERD, "Diamond Halberd");
        translationBuilder.add(BetterWeapons.NETHERITE_HALBERD, "Netherite Halberd");

        translationBuilder.add(BetterWeapons.IRON_LONGAXE, "Iron Long Axe");
        translationBuilder.add(BetterWeapons.GOLD_LONGAXE, "Gold Long Axe");
        translationBuilder.add(BetterWeapons.DIAMOND_LONGAXE, "Diamond Long Axe");
        translationBuilder.add(BetterWeapons.NETHERITE_LONGAXE, "Netherite Long Axe");

        translationBuilder.add("tooltip.betterweapons.dismounting", "Dismounting");
        translationBuilder.add("tooltip.betterweapons.stunning", "Stunning");
        translationBuilder.add("tooltip.betterweapons.chance", "Chance: ");

    }
}
