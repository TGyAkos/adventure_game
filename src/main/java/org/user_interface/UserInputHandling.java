package org.user_interface;

import org.event_handler.user_interface_event.UserInterfaceEventListener;
import org.player_classes.Magic;
import org.player_classes.Melee;
import org.player_classes.Range;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputHandling implements UserInterfaceEventListener {
    @Override
    public void getUserInput(UserInterfaceDisplay userInterfaceDisplay) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            userInterfaceDisplay.setUserInputState(reader.readLine());
        }
        catch (IOException e) {
            //Fix IOException
            System.out.println(e);
        }
    }

    @Override
    public void getPlayerClass(UserInterfaceDisplay userInterfaceDisplay, String userInput) {
        switch (userInput) {
            case "1" -> userInterfaceDisplay.setPlayerClass(new Magic());
            case "2" -> userInterfaceDisplay.setPlayerClass(new Melee());
            case "3" -> userInterfaceDisplay.setPlayerClass(new Range());
        }
    }
}
