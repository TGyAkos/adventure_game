package org.event_handler.game_utility_event;

import org.event_handler.damage_event.DamageEventHandler;
import org.event_handler.user_interface_event.UserInterfaceEventHandler;

public class GameUtilityEventHandler {
    private final UserInterfaceEventHandler userInterfaceEventHandler;

    public GameUtilityEventHandler() {
        GameUtilityEventInitiator gameUtilityEventInitiator = new GameUtilityEventInitiator();
        GameUtilityEventResponder gameUtilityEventResponder = new GameUtilityEventResponder();

        gameUtilityEventInitiator.addListeners(gameUtilityEventResponder);

        UserInterfaceEventHandler userInterfaceEventHandler = new UserInterfaceEventHandler();
        DamageEventHandler damageEventHandler = new DamageEventHandler();

        userInterfaceEventHandler.setDamageEventInitiator(damageEventHandler.getDamageEventInitiator());
        damageEventHandler.setUserInterfaceEventInitiator(userInterfaceEventHandler.getUserInterfaceEventInitiator());

        this.userInterfaceEventHandler = userInterfaceEventHandler;
    }

    public UserInterfaceEventHandler getUserInterfaceEventHandler() {
        return userInterfaceEventHandler;
    }
}
