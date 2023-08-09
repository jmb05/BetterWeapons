package net.jmb19905.betterweapons.mixin;

import net.jmb19905.betterweapons.BetterWeapons;
import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.mob.RavagerEntity;
import net.minecraft.sound.SoundEvents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;

@Mixin(RavagerEntity.class)
public abstract class RavagerEntityMixin {

    @Accessor
    protected abstract void setStunTick(int i);

    @Inject(method = "tickMovement", at = @At("TAIL"))
    private void tick(CallbackInfo ci) {
        RavagerEntity ravagerEntity = (RavagerEntity) (Object) this;
        if (ravagerEntity.hasStatusEffect(BetterWeapons.STUN) && ravagerEntity.getStunTick() > 0) {
            setStunTick(Objects.requireNonNull(ravagerEntity.getStatusEffect(BetterWeapons.STUN)).getDuration() + 1);
            ravagerEntity.playSound(SoundEvents.ENTITY_RAVAGER_STUNNED, 1.0f, 1.0f);
            ravagerEntity.getWorld().sendEntityStatus(ravagerEntity, EntityStatuses.STUN_RAVAGER);
        }
    }

}
