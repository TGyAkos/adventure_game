package org.event_handler.save_event;

public interface SaveEventListener {
    void saveCurrentPlayerClass(SaveListenerData saveListenerData);
    void saveHighScore(SaveListenerData saveListenerData);
}
