package org.user_interface;

import org.enemies.Goblin;
import org.event_handler.damage_event.DamageEventInitiator;
import org.event_handler.user_interface_event.UserInterfaceEventInitiator;
import org.player_classes.DefaultAttributes;

public class UserInterfaceDisplay {
    private UserInterfaceEventInitiator userInterfaceEventInitiator;
    private DamageEventInitiator damageEventInitiator;
    private String currentUserInput;
    private DefaultAttributes playerClass;
    private Goblin enemyClass;

    public void printOptions() {
        System.out.println("Choose your class:");
        System.out.println("1. - Magic");
        System.out.println("2. - Melee");
        System.out.println("3. - Range");
        getUserInput();
    }

    public void printCombatOptions() {
        System.out.println("Choose your action:");
        System.out.println("1. - Fight");
        System.out.println("2. - Drink Potion");
        System.out.println("3. - My stats");
        System.out.println("4. - Enemy stats");
        getUserInput();
    }

    public void printFightResult() {
        System.out.printf("Your health: %f%n", playerClass.getHealth());
        System.out.printf("Enemy Health: %f%n", enemyClass.getHealth());
    }

    public void printPotionOption() {

    }

    public void printMyStats() {
        System.out.printf("Health: %f%n", playerClass.getHealth());
        System.out.printf("Damage: %f%n", playerClass.getDamage());
        System.out.printf("Resistance: %f%n", playerClass.getResistance());
        System.out.printf("Weak Potion: %f%n", playerClass.getWeakPotion());
        System.out.printf("Common Potion: %f%n", playerClass.getCommonPotion());
        System.out.printf("Strong Potion: %f%n", playerClass.getStrongPotion());
    }

    public void printEnemyStats() {
        System.out.printf("Enemy Health: %f%n", enemyClass.getHealth());
        System.out.printf("Enemy Damage: %f%n", enemyClass.getDamage());
        System.out.printf("Enemy Resistance: %f%n", enemyClass.getResistance());
    }

    public void getUserInput() {
        System.out.println("Enter the number:");
        userInterfaceEventInitiator.getUserInput(this);
    }

    public void getPlayerCombatAction() {
        if ("1".equals(currentUserInput)) {
            damageEventInitiator.getFightResultData(this, playerClass, enemyClass);
        }
        userInterfaceEventInitiator.getPlayerCombatAction(this, currentUserInput);
    }

    public void getPlayerClass() {
        userInterfaceEventInitiator.getPlayerClass(this, currentUserInput);
    }

    public void getEnemyClass() {
        damageEventInitiator.calculateAndSpawnEnemy(this, playerClass);
    }

    public void setPlayerCombatAction(String userInput) {
        switch (userInput) {
            case "1" -> printFightResult();
            case "2" -> printPotionOption();
            case "3" -> printMyStats();
            case "4" -> printEnemyStats();
        }
    }

    public void setUserInputState(String userInput) {
        currentUserInput = userInput;
    }

    public void setPlayerClass(DefaultAttributes playerClass) {
        this.playerClass = playerClass;
    }

    public void setEnemyClass(UserInterfaceDisplay this, Goblin enemyClass) {
        this.enemyClass = enemyClass;
    }

    public void setUserInterfaceEventInitiator(UserInterfaceEventInitiator userInterfaceEventInitiator) {
        this.userInterfaceEventInitiator = userInterfaceEventInitiator;
    }

    public void setDamageEventInitiator(DamageEventInitiator damageEventInitiator) {
        this.damageEventInitiator = damageEventInitiator;
    }

}