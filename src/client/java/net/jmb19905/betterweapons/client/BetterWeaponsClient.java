package net.jmb19905.betterweapons.client;

import net.fabricmc.api.ClientModInitializer;
import net.jmb19905.betterweapons.BetterWeapons;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class BetterWeaponsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModelPredicateProviderRegistry.register(BetterWeapons.WOODEN_BATTLESTAFF, new Identifier("blocking"), (stack, world, living, i) -> isUsingShield(living, stack));
        ModelPredicateProviderRegistry.register(BetterWeapons.IRON_BATTLESTAFF, new Identifier("blocking"), (stack, world, living, i) -> isUsingShield(living, stack));
        ModelPredicateProviderRegistry.register(BetterWeapons.GOLD_BATTLESTAFF, new Identifier("blocking"), (stack, world, living, i) -> isUsingShield(living, stack));
        ModelPredicateProviderRegistry.register(BetterWeapons.DIAMOND_BATTLESTAFF, new Identifier("blocking"), (stack, world, living, i) -> isUsingShield(living, stack));
        ModelPredicateProviderRegistry.register(BetterWeapons.NETHERITE_BATTLESTAFF, new Identifier("blocking"), (stack, world, living, i) -> isUsingShield(living, stack));
    }

    public static float isUsingShield(LivingEntity living, ItemStack stack) {
        return living != null && living.isUsingItem() && living.getActiveItem() == stack ? 1.0f : 0.0f;
    }

}
