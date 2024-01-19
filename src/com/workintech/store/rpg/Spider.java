package com.workintech.store.rpg;

public class Spider extends Monster implements Poisonable{

    public Spider(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + (getDamage() * posion());
    }


}
