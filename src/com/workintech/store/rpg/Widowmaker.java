package com.workintech.store.rpg;

public class Widowmaker extends Monster implements Poisonable{

    public Widowmaker(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + (getDamage() * posion());
    }

    @Override
    public double posion() {
        return 0.6;
    }
}
