package net.jmb19905.betterweapons.mixin;

import net.jmb19905.betterweapons.BetterWeapons;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MobEntity.class)
public class MobEntityMixin {

    @Inject(method = "tryAttack", at = @At("HEAD"), cancellable = true)
    private void tryAttack(Entity target, CallbackInfoReturnable<Boolean> cir) {
        LivingEntity entity = (LivingEntity) (Object) this;
        if (entity.hasStatusEffect(BetterWeapons.STUN)) {
            cir.setReturnValue(false);
        }
    }

}
