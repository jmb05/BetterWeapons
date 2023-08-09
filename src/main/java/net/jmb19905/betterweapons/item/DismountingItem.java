package net.jmb19905.betterweapons.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DismountingItem extends SwordItem {
    private final float dismountChance;

    public DismountingItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, float dismountChance, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        this.dismountChance = dismountChance;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (target.getVehicle() != null && target.getWorld().random.nextFloat() >= 1 - dismountChance) {
            target.dismountVehicle();
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 15, 1));
        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(Text.empty());
        tooltip.add(Text.translatable("tooltip.betterweapons.dismounting").formatted(Formatting.GOLD));
        tooltip.add(Text.translatable("tooltip.betterweapons.chance").append(dismountChance * 100 + "%").formatted(Formatting.GRAY));
    }
}
