package org.enemies;

import org.player_classes.DefaultAttributes;

import java.util.concurrent.ThreadLocalRandom;

public class Goblin {
    private final DefaultAttributes playerClass;
    private double health;
    private double damage;
    private double resistance;
    // Calculate exp given to player based on level difference ↓
    private double xpGivenToPlayer;

    public Goblin(DefaultAttributes playerClass) {
        this.playerClass = playerClass;
        calculateStats();

    }

    private void calculateStats() {
        health = ThreadLocalRandom.current().nextDouble(
                playerClass.getHealth() - (playerClass.getHealth() * 0.15),
                playerClass.getHealth() + (playerClass.getHealth() * 0.16));
        damage = ThreadLocalRandom.current().nextDouble(
                playerClass.getDamage() - (playerClass.getDamage() * 0.15),
                playerClass.getDamage() + (playerClass.getDamage() * 0.16));
        resistance = ThreadLocalRandom.current().nextDouble(
                playerClass.getResistance() - (playerClass.getResistance() * 0.15),
                playerClass.getResistance() + (playerClass.getResistance() * 0.16));
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

    public void setHealth(double health) {
        this.health = health;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }
}
