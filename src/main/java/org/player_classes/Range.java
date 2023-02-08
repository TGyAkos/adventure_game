package org.player_classes;

public class Range extends DefaultAttributes {
    private double health = 20;
    private double damage = 100;

    @Override
    public double getHealth() {
        return health;
    }

    @Override
    public double getDamage() {
        return damage;
    }

    @Override
    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public void setDamage(double damage) {
        this.damage = damage;
    }
}
