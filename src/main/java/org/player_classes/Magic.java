package org.player_classes;

public class Magic extends DefaultAttributes {
    private double damage = 50;
    private double resistance = 10;

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
