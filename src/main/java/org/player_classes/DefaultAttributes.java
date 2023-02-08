package org.player_classes;

public abstract class DefaultAttributes {
    private int numberOfEnemyKilled = 0;
    private double health = 100;
    private double damage = 25;
    private double resistance = 20;
    private double experience = 0;
    private double weakPotion = 2;
    private double commonPotion = 1;
    private double strongPotion = 0;

    public int getNumberOfEnemyKilled() {
        return numberOfEnemyKilled;
    }

    public double getHealth() {
        return health;
    }

    public double getDamage() {
        return damage;
    }

    public double getResistance() {
        return resistance;
    }

    public double getExperience() {
        return experience;
    }

    public double getWeakPotion() {
        return weakPotion;
    }

    public double getCommonPotion() {
        return commonPotion;
    }

    public double getStrongPotion() {
        return strongPotion;
    }

    public void setNumberOfEnemyKilled(int numberOfEnemyKilled) {
        this.numberOfEnemyKilled = numberOfEnemyKilled;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
    public void setWeakPotion(double weakPotion) {
        this.weakPotion = weakPotion;
    }

    public void setCommonPotion(double commonPotion) {
        this.commonPotion = commonPotion;
    }

    public void setStrongPotion(double strongPotion) {
        this.strongPotion = strongPotion;
    }
}
