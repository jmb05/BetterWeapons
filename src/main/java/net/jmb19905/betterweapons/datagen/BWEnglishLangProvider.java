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

        translationBuilder.add(BetterWeapons.WOODEN_DAGGER, "Wooden Dagger");
        translationBuilder.add(BetterWeapons.IRON_DAGGER, "Iron Dagger");
        translationBuilder.add(BetterWeapons.GOLD_DAGGER, "Gold Dagger");
        translationBuilder.add(BetterWeapons.DIAMOND_DAGGER, "Diamond Dagger");
        translationBuilder.add(BetterWeapons.NETHERITE_DAGGER, "Netherite Dagger");

        translationBuilder.add(BetterWeapons.WOODEN_LONGSWORD, "Wooden Longsword");
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
    }
}
