package org.event_handler.user_interface_event;

import org.user_interface.UserInterfaceDisplay;

public interface UserInterfaceEventListener {
    void getUserInput(UserInterfaceDisplay userInterfaceDisplay);
    void getPlayerClass(UserInterfaceDisplay userInterfaceDisplay, String userInput);
    void getPlayerCombatAction(UserInterfaceDisplay userInterfaceDisplay, String userInput);
}
