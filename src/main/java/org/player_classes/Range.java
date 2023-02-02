package org.player_classes;

public class Range extends DefaultAttributes {
    private int health = 20;
    private int damage = 100;

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }
}
