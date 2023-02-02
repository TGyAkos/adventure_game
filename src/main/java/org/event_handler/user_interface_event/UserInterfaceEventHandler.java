package org.event_handler.user_interface_event;

import org.event_handler.damage_event.DamageEventInitiator;
import org.user_interface.UserInputHandling;
import org.user_interface.UserInterfaceDisplay;

public class UserInterfaceEventHandler {
    private final UserInterfaceEventInitiator userInterfaceEventInitiator;
    private DamageEventInitiator damageEventInitiator;

    public UserInterfaceEventHandler() {
        UserInterfaceEventInitiator userInterfaceEventInitiator = new UserInterfaceEventInitiator();
        UserInputHandling userInputHandling = new UserInputHandling();

        this.userInterfaceEventInitiator = userInterfaceEventInitiator;

        this.userInterfaceEventInitiator.addListeners(userInputHandling);
    }

    public void startUserInterfaceEventHandler() {
        UserInterfaceDisplay userInterfaceDisplay = new UserInterfaceDisplay();

        userInterfaceDisplay.setUserInterfaceEventInitiator(this.userInterfaceEventInitiator);
        userInterfaceDisplay.setDamageEventInitiator(this.damageEventInitiator);

        userInterfaceDisplay.printOptions();
        userInterfaceDisplay.getPlayerClass();
        // Untested code ↓
        userInterfaceDisplay.printCombatOptions();
    }

    public UserInterfaceEventInitiator getUserInterfaceEventInitiator() {
        return userInterfaceEventInitiator;
    }

    public void setDamageEventInitiator(DamageEventInitiator damageEventInitiator) {
        this.damageEventInitiator = damageEventInitiator;
    }
}
