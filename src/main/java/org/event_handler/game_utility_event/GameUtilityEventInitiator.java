package org.event_handler.game_utility_event;

import java.util.ArrayList;
import java.util.List;

public class GameUtilityEventInitiator {
    // Useless code ↓
    private final List<GameUtilityEventListener> listeners = new ArrayList<>();

    public void addListeners(GameUtilityEventListener toAdd) {
        listeners.add(toAdd);
    }

    public void gameStart() {
        for (GameUtilityEventListener gameUtilityEventListener : listeners) {
            gameUtilityEventListener.gameStart();
        }
    }



}
