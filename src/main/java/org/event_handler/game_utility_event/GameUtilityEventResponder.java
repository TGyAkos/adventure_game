package org.event_handler.game_utility_event;

import org.event_handler.user_interface_event.UserInterfaceEventHandler;

public class GameUtilityEventResponder implements GameUtilityEventListener {
    @Override
    public void runMainGameplayLoop(GameUtilityEventHandler gameUtilityEventHandler) {
        UserInterfaceEventHandler userInterfaceEventHandler = gameUtilityEventHandler.getUserInterfaceEventHandler();

        // Figure out how to do main gameplay loop, how to restart the main gameplay loop and spawn new enemy after defeating one
        userInterfaceEventHandler.startUserInterfaceEventHandler();

        userInterfaceEventHandler.startActionSelection();

        while (true) {
            userInterfaceEventHandler.SpawnEnemy();
            userInterfaceEventHandler.startMainGameplayLoop();

            if (userInterfaceEventHandler.getUserInterfaceDisplay().getCurrentPlayerClass().getHealth() <= 0.0) {
                userInterfaceEventHandler.gameEnd();
                break;
            }
        }
    }
}
