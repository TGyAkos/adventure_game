package org.event_handler.game_utility_event;

import java.util.ArrayList;
import java.util.List;

public class GameUtilityEventInitiator {
    private final List<GameUtilityEventListener> listeners = new ArrayList<>();

    public void addListeners(GameUtilityEventListener toAdd) {
        listeners.add(toAdd);
    }

    public void runMainGameplayLoop(GameUtilityEventHandler gameUtilityEventHandler) {
        for (GameUtilityEventListener gameUtilityEventListener : listeners) {
            gameUtilityEventListener.runMainGameplayLoop(gameUtilityEventHandler);
        }
    }


}
