package net.jmb19905.betterweapons.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.jmb19905.betterweapons.BetterWeapons;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Consumer;

@SuppressWarnings("SameParameterValue")
public class BWRecipeGenerator extends FabricRecipeProvider {

    public BWRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        battlestaff(BetterWeapons.WOODEN_BATTLESTAFF, ItemTags.PLANKS, exporter);
        battlestaff(BetterWeapons.IRON_BATTLESTAFF, Items.IRON_INGOT, exporter);
        battlestaff(BetterWeapons.GOLD_BATTLESTAFF, Items.GOLD_INGOT, exporter);
        battlestaff(BetterWeapons.DIAMOND_BATTLESTAFF, Items.DIAMOND, exporter);

        dagger(BetterWeapons.IRON_DAGGER, Items.IRON_INGOT, exporter);
        dagger(BetterWeapons.GOLD_DAGGER, Items.GOLD_INGOT, exporter);
        dagger(BetterWeapons.DIAMOND_DAGGER, Items.DIAMOND, exporter);

        longsword(BetterWeapons.IRON_LONGSWORD, Items.IRON_INGOT, exporter);
        longsword(BetterWeapons.GOLD_LONGSWORD, Items.GOLD_INGOT, exporter);
        longsword(BetterWeapons.DIAMOND_LONGSWORD, Items.DIAMOND, exporter);

        spear(BetterWeapons.WOODEN_SPEAR, ItemTags.PLANKS, exporter);
        spear(BetterWeapons.IRON_SPEAR, Items.IRON_INGOT, exporter);
        spear(BetterWeapons.GOLD_SPEAR, Items.GOLD_INGOT, exporter);
        spear(BetterWeapons.DIAMOND_SPEAR, Items.DIAMOND, exporter);

        mace(BetterWeapons.CLUB, ItemTags.LOGS, exporter);
        mace(BetterWeapons.IRON_MACE, Items.IRON_INGOT, exporter);
        mace(BetterWeapons.GOLD_MACE, Items.GOLD_INGOT, exporter);
        mace(BetterWeapons.DIAMOND_MACE, Items.DIAMOND, exporter);

        glaive(BetterWeapons.IRON_GLAIVE, Items.IRON_INGOT, exporter);
        glaive(BetterWeapons.GOLD_GLAIVE, Items.GOLD_INGOT, exporter);
        glaive(BetterWeapons.DIAMOND_GLAIVE, Items.DIAMOND, exporter);

        halberd(BetterWeapons.IRON_HALBERD, Items.IRON_INGOT, exporter);
        halberd(BetterWeapons.GOLD_HALBERD, Items.GOLD_INGOT, exporter);
        halberd(BetterWeapons.DIAMOND_HALBERD, Items.DIAMOND, exporter);

        longaxe(BetterWeapons.IRON_LONGAXE, Items.IRON_INGOT, exporter);
        longaxe(BetterWeapons.GOLD_LONGAXE, Items.GOLD_INGOT, exporter);
        longaxe(BetterWeapons.DIAMOND_LONGAXE, Items.DIAMOND, exporter);

        offerNetheriteUpgradeRecipe(exporter, BetterWeapons.DIAMOND_BATTLESTAFF, RecipeCategory.COMBAT, BetterWeapons.NETHERITE_BATTLESTAFF);
        offerNetheriteUpgradeRecipe(exporter, BetterWeapons.DIAMOND_DAGGER, RecipeCategory.COMBAT, BetterWeapons.NETHERITE_DAGGER);
        offerNetheriteUpgradeRecipe(exporter, BetterWeapons.DIAMOND_LONGSWORD, RecipeCategory.COMBAT, BetterWeapons.NETHERITE_LONGSWORD);
        offerNetheriteUpgradeRecipe(exporter, BetterWeapons.DIAMOND_SPEAR, RecipeCategory.COMBAT, BetterWeapons.NETHERITE_SPEAR);
        offerNetheriteUpgradeRecipe(exporter, BetterWeapons.DIAMOND_MACE, RecipeCategory.COMBAT, BetterWeapons.NETHERITE_MACE);
        offerNetheriteUpgradeRecipe(exporter, BetterWeapons.DIAMOND_GLAIVE, RecipeCategory.COMBAT, BetterWeapons.NETHERITE_GLAIVE);
        offerNetheriteUpgradeRecipe(exporter, BetterWeapons.DIAMOND_HALBERD, RecipeCategory.COMBAT, BetterWeapons.NETHERITE_HALBERD);
        offerNetheriteUpgradeRecipe(exporter, BetterWeapons.DIAMOND_LONGAXE, RecipeCategory.COMBAT, BetterWeapons.NETHERITE_LONGAXE);
    }

    private void battlestaff(ItemConvertible output, ItemConvertible material, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("  x")
                .pattern(" / ")
                .pattern("x  ")
                .input('x', material)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material))
                .offerTo(exporter);
    }

    private void battlestaff(ItemConvertible output, TagKey<Item> material, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("  x")
                .pattern(" / ")
                .pattern("x  ")
                .input('x', material)
                .input('/', Items.STICK)
                .criterion("has_material", FabricRecipeProvider.conditionsFromTag(material))
                .offerTo(exporter);
    }

    private void dagger(ItemConvertible output, ItemConvertible material, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("A")
                .pattern("|")
                .input('A', material)
                .input('|', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material))
                .offerTo(exporter);
    }

    private void longsword(ItemConvertible output, ItemConvertible material, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern(" x ")
                .pattern(" x ")
                .pattern("x/x")
                .input('x', material)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material))
                .offerTo(exporter);
    }

    private void spear(ItemConvertible output, ItemConvertible material, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("  x")
                .pattern(" / ")
                .pattern("/  ")
                .input('x', material)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material))
                .offerTo(exporter);
    }

    private void spear(ItemConvertible output, TagKey<Item> material, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("  x")
                .pattern(" / ")
                .pattern("/  ")
                .input('x', material)
                .input('/', Items.STICK)
                .criterion("has_material", FabricRecipeProvider.conditionsFromTag(material))
                .offerTo(exporter);
    }

    private void mace(ItemConvertible output, ItemConvertible material, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("  x")
                .pattern(" x ")
                .pattern("/  ")
                .input('x', material)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material))
                .offerTo(exporter);
    }

    private void mace(ItemConvertible output, TagKey<Item> material, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("  x")
                .pattern(" x ")
                .pattern("/  ")
                .input('x', material)
                .input('/', Items.STICK)
                .criterion("has_material", FabricRecipeProvider.conditionsFromTag(material))
                .offerTo(exporter);
    }

    private void glaive(ItemConvertible output, ItemConvertible material, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("  x")
                .pattern(" /x")
                .pattern("/  ")
                .input('x', material)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material))
                .offerTo(exporter);
    }

    private void halberd(ItemConvertible output, ItemConvertible material, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern(" xx")
                .pattern(" /x")
                .pattern("/  ")
                .input('x', material)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material))
                .offerTo(exporter);
    }

    private void longaxe(ItemConvertible output, ItemConvertible material, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("/xx")
                .pattern("/ x")
                .pattern("/  ")
                .input('x', material)
                .input('/', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(material), FabricRecipeProvider.conditionsFromItem(material))
                .offerTo(exporter);
    }

}
