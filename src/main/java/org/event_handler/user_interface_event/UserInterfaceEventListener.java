package org.event_handler.user_interface_event;

import org.user_interface.UserInterfaceDisplay;

public interface UserInterfaceEventListener {
    void getUserInput(UserInterfaceDisplay userInterfaceDisplay);
    void getPlayerClass(UserInterfaceDisplay userInterfaceDisplay, String userInput);
    void getPlayerCombatAction(UserInterfaceDisplay userInterfaceDisplay, String userInput);
    void getOptions(UserInterfaceDisplay userInterfaceDisplay, UserInterfaceEventHandler userInterfaceEventHandler, String userInput);
    void getOptionsWhenGameIsRunning(UserInterfaceDisplay userInterfaceDisplay, UserInterfaceEventHandler userInterfaceEventHandler, String userInput);
    void getChosenPlayerClass(UserInterfaceDisplay userInterfaceDisplay, String userInput);

    // ITS AWFUL, extend DefaultAttributes with weak, common, strong potion health values, also CHECK IF A PLAYER HAS MAX HP
    void getPotionOption(UserInterfaceDisplay userInterfaceDisplay, String userInput);
}
