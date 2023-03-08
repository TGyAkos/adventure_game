package org.event_handler.load_event;

public interface LoadEventListener {
    void listPlayerClasses(LoadListenerData loadListenerData);
    void loadChosenPlayerClass(LoadListenerData loadListenerData);
    void loadHighScore(LoadListenerData loadListenerData);
}
