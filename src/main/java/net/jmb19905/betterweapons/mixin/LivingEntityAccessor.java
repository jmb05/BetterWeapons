package net.jmb19905.betterweapons.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(LivingEntity.class)
public interface LivingEntityAccessor {

    @Invoker(value = "blockedByShield")
    boolean fabricshieldlib$invokeBlockedByShield(DamageSource source);

    @Invoker(value = "damageShield")
    void fabricshieldlib$invokeDamageShield(float amount);

    @Invoker(value = "takeShieldHit")
    void fabricshieldlib$invokeTakeShieldHit(LivingEntity attacker);
}