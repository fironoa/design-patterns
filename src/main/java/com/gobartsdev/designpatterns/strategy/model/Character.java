package com.gobartsdev.designpatterns.strategy.model;

import com.gobartsdev.designpatterns.strategy.services.WeaponBehavior;

public class Character {
    String name;
    Integer kills;
    WeaponBehavior weaponBehaviour;

    public void fight(){
        System.out.println( weaponBehaviour.useWeapon());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public WeaponBehavior getWeaponBehaviour() {
        return weaponBehaviour;
    }

    public void setWeaponBehaviour(WeaponBehavior weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
