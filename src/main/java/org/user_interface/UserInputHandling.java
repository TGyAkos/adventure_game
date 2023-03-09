package org.user_interface;

import org.event_handler.load_event.LoadListenerData;
import org.event_handler.user_interface_event.UserInterfaceEventHandler;
import org.event_handler.user_interface_event.UserInterfaceEventListener;
import org.jetbrains.annotations.NotNull;
import org.player_classes.DefaultAttributes;
import org.player_classes.Magic;
import org.player_classes.Melee;
import org.player_classes.Range;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputHandling implements UserInterfaceEventListener {
    @Override
    public void getUserInput(UserInterfaceDisplay userInterfaceDisplay) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            userInterfaceDisplay.setUserInputState(reader.readLine());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getPlayerClass(UserInterfaceDisplay userInterfaceDisplay, String userInput) {
        switch (userInput) {
            case "1" -> userInterfaceDisplay.setPlayerClass(new Magic());
            case "2" -> userInterfaceDisplay.setPlayerClass(new Melee());
            case "3" -> userInterfaceDisplay.setPlayerClass(new Range());
        }
    }

    @Override
    public void getPlayerCombatAction(@NotNull final UserInterfaceDisplay userInterfaceDisplay, String userInput) {
        switch (userInput) {
            case "1" ->  userInterfaceDisplay.printFightResult();
            case "2" ->  {
                userInterfaceDisplay.printPotionOption();
                userInterfaceDisplay.getPotionOption();
            }
            case "3" ->  userInterfaceDisplay.printMyStats();
            case "4" ->  userInterfaceDisplay.printEnemyStats();
            case "5" -> {
                userInterfaceDisplay.printOptionsWhenGameIsRunning();
                userInterfaceDisplay.getOptionsWhenGameIsRunning();
            }
        }
    }

    @Override
    public void getOptions(UserInterfaceDisplay userInterfaceDisplay, UserInterfaceEventHandler userInterfaceEventHandler, String userInput) {
        switch (userInput) {
            case "1" -> userInterfaceEventHandler.startCharacterSelection();
            case "2" -> userInterfaceEventHandler.loadGame();
            case "3" -> {
                LoadListenerData loadListenerData = new LoadListenerData(
                        userInterfaceDisplay,
                        userInterfaceDisplay.getCurrentUserInput()
                );

                userInterfaceDisplay.getUserInterfaceEventHandler().getLoadEventInitiator().loadHighScore(loadListenerData);
                userInterfaceDisplay.printHighScore();
            }
            case "4" -> System.exit(0);
        }
    }

    @Override
    public void getOptionsWhenGameIsRunning(UserInterfaceDisplay userInterfaceDisplay, UserInterfaceEventHandler userInterfaceEventHandler, String userInput) {
        switch (userInput) {
            case "1" -> userInterfaceEventHandler.startMainGameplayLoop();
            case "2" -> userInterfaceEventHandler.saveGame();
            case "3" -> System.exit(0);
        }
    }

    @Override
    public void getChosenPlayerClass(UserInterfaceDisplay userInterfaceDisplay, String userInput) {
        LoadListenerData loadListenerData = new LoadListenerData(
                userInterfaceDisplay,
                userInput
        );

        userInterfaceDisplay.getUserInterfaceEventHandler().getLoadEventInitiator().loadChosenPlayerClass(loadListenerData);
    }

    // ITS AWFUL, extend DefaultAttributes with weak, common, strong potion health values, also CHECK IF A PLAYER HAS MAX HP
    @Override
    public void getPotionOption(UserInterfaceDisplay userInterfaceDisplay, String userInput) {
        DefaultAttributes playerClass = userInterfaceDisplay.getCurrentPlayerClass();
        switch (userInput) {
            case "1" -> playerClass.setHealth(playerClass.getHealth() + 25);
            case "2" -> playerClass.setHealth(playerClass.getHealth() + 50);
            case "3" -> playerClass.setHealth(playerClass.getHealth() + 100);
        }

    }
}
