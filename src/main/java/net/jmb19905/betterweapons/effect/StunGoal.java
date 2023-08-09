package net.jmb19905.betterweapons.effect;

import net.jmb19905.betterweapons.BetterWeapons;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.mob.MobEntity;

import java.util.EnumSet;

public class StunGoal extends Goal {

    private final MobEntity entity;

    public StunGoal(MobEntity entity) {
        this.entity = entity;
        setControls(EnumSet.of(Control.MOVE, Control.LOOK));
    }

    @Override
    public boolean canStart() {
        return entity.hasStatusEffect(BetterWeapons.STUN);
    }
}
