package org.event_handler.load_event;

import java.util.ArrayList;
import java.util.List;

public class LoadEventInitiator {
    private final List<LoadEventListener> listeners = new ArrayList<>();

    public void addListeners(LoadEventListener loadEventListener) {
        listeners.add(loadEventListener);
    }

    public void listPlayerClasses(LoadListenerData loadListenerData) {
        for (LoadEventListener loadEventListener :listeners) {
            loadEventListener.listPlayerClasses(loadListenerData);
        }
    }

    public void loadChosenPlayerClass(LoadListenerData loadListenerData) {
        for (LoadEventListener loadEventListener : listeners) {
            loadEventListener.loadChosenPlayerClass(loadListenerData);
        }
    }

    public void loadHighScore(LoadListenerData loadListenerData) {
        for (LoadEventListener loadEventListener :listeners) {
            loadEventListener.loadHighScore(loadListenerData);
        }
    }
}
