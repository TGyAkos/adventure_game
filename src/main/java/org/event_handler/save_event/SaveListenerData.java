package org.event_handler.save_event;

import org.player_classes.DefaultAttributes;

public record SaveListenerData(DefaultAttributes playerClass, String userInput) {
}
