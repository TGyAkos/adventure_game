package org.event_handler.save_event;

import org.jetbrains.annotations.NotNull;
import org.player_classes.DefaultAttributes;

public record SaveListenerData(@NotNull DefaultAttributes playerClass, String userInput) {
}
