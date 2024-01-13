package com.gobartsdev.designpatterns.strategy.services;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public String useWeapon() {
        return "Swing , Swing, slash...., swing";
    }
}
