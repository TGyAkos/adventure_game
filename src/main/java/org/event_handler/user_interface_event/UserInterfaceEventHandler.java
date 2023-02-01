package org.event_handler.user_interface_event;

import org.event_handler.damage_event.DamageEventInitiator;
import org.user_interface.UserInputHandling;
import org.user_interface.UserInterfaceDisplay;

public class UserInterfaceEventHandler {
    private final UserInterfaceEventInitiator userInterfaceEventInitiator;
    private final DamageEventInitiator damageEventInitiator;

    // Refactor ↓
    public UserInterfaceEventHandler(DamageEventInitiator damageEventInitiator) {
        this.damageEventInitiator = damageEventInitiator;

        UserInterfaceEventInitiator userInterfaceEventInitiator = new UserInterfaceEventInitiator();
        UserInterfaceDisplay userInterfaceDisplay = new UserInterfaceDisplay(userInterfaceEventInitiator, damageEventInitiator);
        UserInputHandling userInputHandling = new UserInputHandling();

        userInterfaceEventInitiator.addListeners(userInputHandling);

        this.userInterfaceEventInitiator = userInterfaceEventInitiator;

        userInterfaceDisplay.printOptions();
        userInterfaceDisplay.getPlayerClass();
    }

    // Refactor ↓
    public UserInterfaceEventInitiator getUserInterfaceEventInitiator() {
        return userInterfaceEventInitiator;
    }
}
