package org.event_handler.save_event;

import java.util.ArrayList;
import java.util.List;

public class SaveEventInitiator {
    private final List<SaveEventListener> listeners = new ArrayList<>();

    public void addListeners(SaveEventListener toAdd) {
        listeners.add(toAdd);
    }

    public void saveCurrentPlayerClass(SaveListenerData saveListenerData) {
        for (SaveEventListener saveEventListener : listeners) {
            saveEventListener.saveCurrentPlayerClass(saveListenerData);
        }
    }

    public void saveHighScore(SaveListenerData saveListenerData) {
        for (SaveEventListener saveEventListener : listeners) {
            saveEventListener.saveHighScore(saveListenerData);
        }
    }
}
