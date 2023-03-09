package org.event_handler.load_event;

import org.jetbrains.annotations.NotNull;
import org.user_interface.UserInterfaceDisplay;

public record LoadListenerData(@NotNull UserInterfaceDisplay userInterfaceDisplay, String userInput) {
}
