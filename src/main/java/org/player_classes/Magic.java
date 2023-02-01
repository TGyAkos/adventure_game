package org.player_classes;

public class Magic extends DefaultAttributes {
    private int damage = 50;
    private int resistance = 10;

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public int getResistance() {
        return resistance;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void setResistance(int resistance) {
        this.resistance = resistance;
    }
}
