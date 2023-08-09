package net.jmb19905.betterweapons.mixin;

import net.jmb19905.betterweapons.BetterWeapons;
import net.jmb19905.betterweapons.item.IShieldItem;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {

    @Inject(method = "damageShield", at = @At("HEAD"), locals = LocalCapture.CAPTURE_FAILHARD)
    private void damageShield(float amount, CallbackInfo callbackInfo) {
        PlayerEntity player = (PlayerEntity) (Object) this;
        ItemStack activeItem = player.getActiveItem();

        if (activeItem.getItem() instanceof IShieldItem) {
            if (amount >= 3.0F) {
                int i = 1 + MathHelper.floor(amount);
                Hand hand = player.getActiveHand();

                activeItem.damage(i, (LivingEntity) player, ((playerEntity) -> player.sendToolBreakStatus(hand)));

                if (activeItem.isEmpty()) {
                    if (hand == Hand.MAIN_HAND) {
                        player.equipStack(EquipmentSlot.MAINHAND, ItemStack.EMPTY);
                    } else {
                        player.equipStack(EquipmentSlot.OFFHAND, ItemStack.EMPTY);
                    }

                    activeItem = ItemStack.EMPTY;
                    player.playSound(SoundEvents.ITEM_SHIELD_BREAK, 0.8f, 0.8f + player.getWorld().random.nextFloat() * 0.4f);
                }
            }
        }
    }

    @Inject(at = @At(value = "HEAD"), method = "disableShield", locals = LocalCapture.CAPTURE_FAILHARD, cancellable = true)
    private void disableShieldHead(boolean sprinting, CallbackInfo callbackInfo) {
        PlayerEntity player = (PlayerEntity) (Object) this;
        ItemStack activeItemStack = player.getActiveItem();
        Item activeItem = activeItemStack.getItem();

        //ShieldDisabledCallback.EVENT.invoker().disable(player, player.getActiveHand(), activeItemStack);

        if (activeItem instanceof IShieldItem shield) {

            float f = 0.25F + (float) EnchantmentHelper.getEfficiency(player) * 0.05F;
            if (sprinting) {
                f += 0.75F;
            }

            if (player.getRandom().nextFloat() < f) {
                player.getItemCooldownManager().set((Item) shield, shield.getCoolDownTicks());
                player.clearActiveItem();
                player.getWorld().sendEntityStatus(player, (byte) 30);
                callbackInfo.cancel();
            }
        }
    }

    @Inject(method = "attack", at = @At("HEAD"), cancellable = true)
    private void attack(Entity target, CallbackInfo ci) {
        PlayerEntity player = (PlayerEntity) (Object) this;
        if (player.hasStatusEffect(BetterWeapons.STUN)) {
            ci.cancel();
        }
    }

}
