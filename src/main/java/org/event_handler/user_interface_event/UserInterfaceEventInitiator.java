package org.event_handler.user_interface_event;

import org.user_interface.UserInterfaceDisplay;

import java.util.ArrayList;
import java.util.List;

public class UserInterfaceEventInitiator {
    private final List<UserInterfaceEventListener> listeners = new ArrayList<>();

    public void addListeners(UserInterfaceEventListener toAdd) {
        listeners.add(toAdd);
    }

    public void getUserInput(UserInterfaceDisplay userInterfaceDisplay) {
        for (UserInterfaceEventListener userInterfaceEventListener : listeners) {
            userInterfaceEventListener.getUserInput(userInterfaceDisplay);
        }
    }

    public void getPlayerClass(UserInterfaceDisplay userInterfaceDisplay, String userInput) {
        for (UserInterfaceEventListener userInterfaceEventListener : listeners) {
            userInterfaceEventListener.getPlayerClass(userInterfaceDisplay, userInput);
        }
    }

    public void getPlayerCombatAction(UserInterfaceDisplay userInterfaceDisplay, String userInput) {
        for (UserInterfaceEventListener userInterfaceEventListener : listeners) {
            userInterfaceEventListener.getPlayerCombatAction(userInterfaceDisplay, userInput);
        }
    }

    public void getOptions(UserInterfaceDisplay userInterfaceDisplay, UserInterfaceEventHandler userInterfaceEventHandler, String userInput) {
        for (UserInterfaceEventListener userInterfaceEventListener : listeners) {
            userInterfaceEventListener.getOptions(userInterfaceDisplay, userInterfaceEventHandler, userInput);
        }
    }

    public void getOptionsWhenGameIsRunning(UserInterfaceDisplay userInterfaceDisplay, UserInterfaceEventHandler userInterfaceEventHandler, String userInput) {
        for (UserInterfaceEventListener userInterfaceEventListener : listeners) {
            userInterfaceEventListener.getOptionsWhenGameIsRunning(userInterfaceDisplay, userInterfaceEventHandler, userInput);
        }
    }

    public void getChosenPlayerClass(UserInterfaceDisplay userInterfaceDisplay, String userInput) {
        for (UserInterfaceEventListener userInterfaceEventListener : listeners) {
            userInterfaceEventListener.getChosenPlayerClass(userInterfaceDisplay, userInput);
        }
    }

}
