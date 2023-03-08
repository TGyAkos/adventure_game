package org.event_handler.user_interface_event;

import org.event_handler.damage_event.DamageEventInitiator;
import org.event_handler.load_event.LoadEventInitiator;
import org.event_handler.load_event.LoadListenerData;
import org.event_handler.save_event.SaveEventInitiator;
import org.event_handler.save_event.SaveListenerData;
import org.player_classes.DefaultAttributes;
import org.user_interface.UserInputHandling;
import org.user_interface.UserInterfaceDisplay;


public class UserInterfaceEventHandler {
    private final UserInterfaceEventInitiator userInterfaceEventInitiator;
    private SaveEventInitiator saveEventInitiator;
    private LoadEventInitiator loadEventInitiator;
    private DamageEventInitiator damageEventInitiator;
    private UserInterfaceDisplay userInterfaceDisplay;


    public UserInterfaceEventHandler() {
        UserInterfaceEventInitiator userInterfaceEventInitiator = new UserInterfaceEventInitiator();
        UserInputHandling userInputHandling = new UserInputHandling();

        this.userInterfaceEventInitiator = userInterfaceEventInitiator;

        this.userInterfaceEventInitiator.addListeners(userInputHandling);
    }

    public void startUserInterfaceEventHandler() {
        this.userInterfaceDisplay = new UserInterfaceDisplay();

        userInterfaceDisplay.setUserInterfaceEventHandler(this);
        userInterfaceDisplay.setUserInterfaceEventInitiator(this.userInterfaceEventInitiator);
        userInterfaceDisplay.setDamageEventInitiator(this.damageEventInitiator);
        userInterfaceDisplay.setSaveEventInitiator(this.saveEventInitiator);

    }

    public void startActionSelection() {
        while (true) {
            userInterfaceDisplay.printOptions();
            userInterfaceDisplay.getOptions();

            if (!userInterfaceDisplay.getCurrentUserInput().equals("3")) {
                break;
            }
        }
    }

    public void startCharacterSelection() {
        userInterfaceDisplay.printPlayerClassOptions();
        userInterfaceDisplay.getPlayerClass();
    }

    public void SpawnEnemy() {
        userInterfaceDisplay.calculateEnemyClass();
    }

    public void startMainGameplayLoop() {
        DefaultAttributes playerClass = userInterfaceDisplay.getCurrentPlayerClass();

        while (true) {
            userInterfaceDisplay.printCombatOptions();
            userInterfaceDisplay.getPlayerCombatAction();

            if (userInterfaceDisplay.getEnemyClass().getHealth() <= 0.0){
                playerClass.addToNumberOfEnemyKilled(1);
                playerClass.setExperience(userInterfaceDisplay.getEnemyClass().getXpGivenToPlayer());
                break;
            }
        }
    }

    public void saveGame() {
        userInterfaceDisplay.printSavePrompt();

        SaveListenerData saveListenerData = new SaveListenerData(
                userInterfaceDisplay.getCurrentPlayerClass(),
                userInterfaceDisplay.getCurrentUserInput()
        );

        saveEventInitiator.saveCurrentPlayerClass(saveListenerData);
        saveEventInitiator.saveHighScore(saveListenerData);
    }

    public void loadGame() {
        LoadListenerData loadListenerData = new LoadListenerData(
                this.userInterfaceDisplay,
                userInterfaceDisplay.getCurrentUserInput()
        );
        loadEventInitiator.listPlayerClasses(loadListenerData);
        userInterfaceDisplay.printSavedPlayerClasses();

        loadListenerData = new LoadListenerData(
                this.userInterfaceDisplay,
                userInterfaceDisplay.getCurrentUserInput()
        );
        loadEventInitiator.loadChosenPlayerClass(loadListenerData);
    }

    public void gameEnd() {
        SaveListenerData saveListenerData = new SaveListenerData(
                userInterfaceDisplay.getCurrentPlayerClass(),
                userInterfaceDisplay.getCurrentUserInput());

        saveEventInitiator.saveHighScore(saveListenerData);

        userInterfaceDisplay.printYouDiedScreen();
        userInterfaceDisplay.getYouDiedScreen();
    }

    public UserInterfaceEventInitiator getUserInterfaceEventInitiator() {
        return userInterfaceEventInitiator;
    }

    public UserInterfaceDisplay getUserInterfaceDisplay() {
        return userInterfaceDisplay;
    }

    public LoadEventInitiator getLoadEventInitiator() {
        return loadEventInitiator;
    }

    public void setDamageEventInitiator(DamageEventInitiator damageEventInitiator) {
        this.damageEventInitiator = damageEventInitiator;
    }

    public void setSaveEventInitiator(SaveEventInitiator saveEventInitiator) {
        this.saveEventInitiator = saveEventInitiator;
    }

    public void setLoadEventInitiator(LoadEventInitiator loadEventInitiator) {
        this.loadEventInitiator = loadEventInitiator;
    }


}
