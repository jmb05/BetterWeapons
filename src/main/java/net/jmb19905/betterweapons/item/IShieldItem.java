package net.jmb19905.betterweapons.item;

import net.minecraft.entity.EquipmentSlot;

public interface IShieldItem {
    double getBlockAngle();

    int getCoolDownTicks();

    EquipmentSlot getPreferredEquipmentSlot();
}
