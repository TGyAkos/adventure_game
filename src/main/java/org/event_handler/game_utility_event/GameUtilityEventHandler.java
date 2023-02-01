package org.event_handler.game_utility_event;

import org.event_handler.damage_event.DamageEventHandler;
import org.event_handler.user_interface_event.UserInterfaceEventHandler;

public class GameUtilityEventHandler {
    // No need for this package, Main() would suffice
    public GameUtilityEventHandler() {
        GameUtilityEventInitiator gameUtilityEventInitiator = new GameUtilityEventInitiator();
        GameUtilityEventResponder gameUtilityEventResponder = new GameUtilityEventResponder();

        gameUtilityEventInitiator.addListeners(gameUtilityEventResponder);

        // Refactor ↓
        DamageEventHandler damageEventHandler = new DamageEventHandler();

        UserInterfaceEventHandler userInterfaceEventHandler = new UserInterfaceEventHandler(damageEventHandler.getDamageEventInitiator());


    }
}
