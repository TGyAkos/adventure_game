package org.player_classes;

public abstract class DefaultAttributes {
    private int health = 100;
    private int damage = 25;
    private int resistance = 20;
    private int experience = 0;
    private int weakPotion = 2;
    private int commonPotion = 1;
    private int strongPotion = 0;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getResistance() {
        return resistance;
    }

    public int getExperience() {
        return experience;
    }

    public int getWeakPotion() {
        return weakPotion;
    }

    public int getCommonPotion() {
        return commonPotion;
    }

    public int getStrongPotion() {
        return strongPotion;
    }

    public void setWeakPotion(int weakPotion) {
        this.weakPotion = weakPotion;
    }

    public void setCommonPotion(int commonPotion) {
        this.commonPotion = commonPotion;
    }

    public void setStrongPotion(int strongPotion) {
        this.strongPotion = strongPotion;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
