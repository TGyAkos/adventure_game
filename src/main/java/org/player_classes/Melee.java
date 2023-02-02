package org.player_classes;

public class Melee extends DefaultAttributes {
    private int damage = 15;
    private int resistance = 40;

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
