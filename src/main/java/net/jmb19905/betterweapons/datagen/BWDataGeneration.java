package net.jmb19905.betterweapons.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BWDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var pack = fabricDataGenerator.createPack();
        pack.addProvider(BWRecipeGenerator::new);
        pack.addProvider(BWEnglishLangProvider::new);
        pack.addProvider(BWModelGenerator::new);
    }
}
