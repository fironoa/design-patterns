package org.gobartsdev.designpatterns.strategy.services;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public String useWeapon() {
        return "krrr.... fvuuuhh....";
    }
}
