package org.user_interface;

import org.enemies.Goblin;
import org.event_handler.damage_event.DamageEventInitiator;
import org.event_handler.save_event.SaveEventInitiator;
import org.event_handler.user_interface_event.UserInterfaceEventHandler;
import org.event_handler.user_interface_event.UserInterfaceEventInitiator;
import org.player_classes.DefaultAttributes;

import java.io.File;

public class UserInterfaceDisplay {
    private UserInterfaceEventHandler userInterfaceEventHandler;
    private UserInterfaceEventInitiator userInterfaceEventInitiator;
    private DamageEventInitiator damageEventInitiator;
    private SaveEventInitiator saveEventInitiator;
    private File[] filesList;
    private String highScore;
    private String currentUserInput;
    private DefaultAttributes playerClass;
    private Goblin enemyClass;

    public void printOptions() {
        System.out.println("Choose action:");
        System.out.println("1. - Start game");
        System.out.println("2. - Load save");
        System.out.println("3. - View high score");
        System.out.println("4. - Exit");
        getUserInput();
    }

    public void printPlayerClassOptions() {
        System.out.println("Choose your class:");
        System.out.println("1. - Magic");
        System.out.println("2. - Melee");
        System.out.println("3. - Range");
        getUserInput();
    }

    public void printOptionsWhenGameIsRunning() {
        System.out.println("Choose action:");
        System.out.println("1. - Continue game");
        System.out.println("2. - Save game");
        System.out.println("3. - Exit");
        getUserInput();
    }

    public void printCombatOptions() {
        System.out.println("Choose your action:");
        System.out.println("1. - Fight");
        System.out.println("2. - Drink Potion");
        System.out.println("3. - My stats");
        System.out.println("4. - Enemy stats");
        System.out.println("5. - Back");
        getUserInput();
    }

    public void printFightResult() {
        System.out.printf("Your health: %f%n", playerClass.getHealth());
        System.out.printf("Enemy Health: %f%n", enemyClass.getHealth());
    }

    public void printPotionOption() {
        System.out.println("Choose potion to drink");
        System.out.printf("1. - Weak Potions: %f%n", playerClass.getWeakPotion());
        System.out.printf("2. - Common Potions: %f%n", playerClass.getCommonPotion());
        System.out.printf("3. - Strong Potions: %f%n", playerClass.getStrongPotion());
        getUserInput();
    }

    public void printMyStats() {
        System.out.printf("Level: %d%n", playerClass.getLevel());
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

    public void printHighScore() {
        System.out.printf("The current High Score: %s%n", highScore);
    }

    // Currently show highScores.txt as a valid input, create a subfolder for all save files
    public void printSavedPlayerClasses() {
        for (int i = 0; i <= filesList.length ; i++) {
            System.out.printf("%d.- %s%n", i, filesList[i].getName());
            i++;
        }

        getUserInput();
    }

    public void getChosenPlayerClass() {
        userInterfaceEventInitiator.getChosenPlayerClass(this, currentUserInput);
    }

    public void printSavePrompt() {
        System.out.println("Type the number to be saved as");
        getUserInput();
    }

    public void printYouDiedScreen() {
        System.out.println("You Died!");
    }

    public void getYouDiedScreen() {
        System.out.println("i forgror");
    }

    public void getUserInput() {
        System.out.println("Enter the number:");
        userInterfaceEventInitiator.getUserInput(this);
    }

    public void getOptions() {
        userInterfaceEventInitiator.getOptions(this, userInterfaceEventHandler, currentUserInput);
    }

    public void getOptionsWhenGameIsRunning() {
        userInterfaceEventInitiator.getOptionsWhenGameIsRunning(this, userInterfaceEventHandler, currentUserInput);
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

    public String getCurrentUserInput() {
        return currentUserInput;
    }

    public void calculateEnemyClass() {
        damageEventInitiator.calculateAndSpawnEnemy(this, playerClass);
    }

    public Goblin getEnemyClass() {
        return enemyClass;
    }

    public DefaultAttributes getCurrentPlayerClass() {
        return this.playerClass;
    }

    public File[] getFilesList() {
        return filesList;
    }

    public UserInterfaceEventHandler getUserInterfaceEventHandler() {
        return userInterfaceEventHandler;
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

    public void setUserInterfaceEventHandler(UserInterfaceEventHandler userInterfaceEventHandler) {
        this.userInterfaceEventHandler = userInterfaceEventHandler;
    }

    public void setSaveEventInitiator(SaveEventInitiator saveEventInitiator) {
        this.saveEventInitiator = saveEventInitiator;
    }

    public void setHighScore(String highScore) {
        this.highScore = highScore;
    }

    public void setFilesList(File[] filesList) {
        this.filesList = filesList;
    }
}