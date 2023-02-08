package org.player_classes;

public class Melee extends DefaultAttributes {
    private double damage = 15;
    private double resistance = 40;

    @Override
    public double getDamage() {
        return damage;
    }

    @Override
    public double getResistance() {
        return resistance;
    }

    @Override
    public void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public void setResistance(double resistance) {
        this.resistance = resistance;
    }
}
