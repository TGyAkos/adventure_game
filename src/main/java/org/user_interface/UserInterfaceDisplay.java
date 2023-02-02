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

    // Hasn't been tested, get a better method of acquiring user input ↓
    public void printCombatOptions() {
        System.out.println("Choose your action:");
        System.out.println("1. - Fight");
        System.out.println("2. - Drink Potion");
        System.out.println("3. - My stats");
        System.out.println("4. - Enemy stats");
        getUserInput();
    }

    public void getUserInput() {
        System.out.println("Enter the number:");
        userInterfaceEventInitiator.getUserInput(this);
    }

    public void getPlayerClass() {
        userInterfaceEventInitiator.getPlayerClass(this, currentUserInput);
    }

    public void setUserInputState(String userInput) {
        currentUserInput = userInput;
    }

    public void setPlayerClass(DefaultAttributes playerClass) {
        this.playerClass = playerClass;
        damageEventInitiator.calculateAndSpawnEnemy(this, playerClass);
    }

    public void setEnemy(UserInterfaceDisplay this, Goblin enemyClass) {
        this.enemyClass = enemyClass;
    }

    public void setUserInterfaceEventInitiator(UserInterfaceEventInitiator userInterfaceEventInitiator) {
        this.userInterfaceEventInitiator = userInterfaceEventInitiator;
    }

    public void setDamageEventInitiator(DamageEventInitiator damageEventInitiator) {
        this.damageEventInitiator = damageEventInitiator;
    }
}