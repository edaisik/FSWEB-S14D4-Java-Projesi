package com.workintech.store.rpg;

public class Troll extends Monster implements Bleedable, Poisonable{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    @Override
    public double bleed(int level) {
        return getDamage() * level * 0.25;
    }

    @Override
    public double attack() {
        return getDamage() + bleed() + (getDamage() * posion());
    }
}
