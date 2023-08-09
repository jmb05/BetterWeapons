package net.jmb19905.betterweapons.item;

import net.jmb19905.betterweapons.BetterWeapons;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class StunWeapon extends SwordItem {
    private final float stunChance;

    public StunWeapon(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, float stunChance, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        this.stunChance = stunChance;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker.getWorld().random.nextFloat() >= 1 - stunChance) {
            target.addStatusEffect(new StatusEffectInstance(BetterWeapons.STUN, 100));
            target.playSound(SoundEvents.BLOCK_ANVIL_LAND, 1f, 1f);
        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(Text.empty());
        tooltip.add(Text.translatable("tooltip.betterweapons.stunning").formatted(Formatting.GOLD));
        tooltip.add(Text.translatable("tooltip.betterweapons.chance").append(stunChance * 100 + "%").formatted(Formatting.GRAY));
    }
}
