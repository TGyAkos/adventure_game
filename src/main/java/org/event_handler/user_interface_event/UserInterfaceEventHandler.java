package org.event_handler.user_interface_event;

import org.event_handler.damage_event.DamageEventInitiator;
import org.user_interface.UserInputHandling;
import org.user_interface.UserInterfaceDisplay;

public class UserInterfaceEventHandler {
    private final UserInterfaceEventInitiator userInterfaceEventInitiator;
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

        userInterfaceDisplay.setUserInterfaceEventInitiator(this.userInterfaceEventInitiator);
        userInterfaceDisplay.setDamageEventInitiator(this.damageEventInitiator);
    }

    public void startCharacterSelection() {
        userInterfaceDisplay.printOptions();
        userInterfaceDisplay.getPlayerClass();
    }

    public void SpawnEnemy() {
        userInterfaceDisplay.getEnemyClass();
    }

    public void startMainGameplayLoop() {
        userInterfaceDisplay.printCombatOptions();
        userInterfaceDisplay.getPlayerCombatAction();
    }

    public UserInterfaceEventInitiator getUserInterfaceEventInitiator() {
        return userInterfaceEventInitiator;
    }

    public void setDamageEventInitiator(DamageEventInitiator damageEventInitiator) {
        this.damageEventInitiator = damageEventInitiator;
    }
}
