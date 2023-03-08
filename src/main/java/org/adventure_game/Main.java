package org.adventure_game;

import org.event_handler.damage_event.DamageEventInitiator;
import org.event_handler.damage_event.DamageEventResponder;
import org.event_handler.game_utility_event.GameUtilityEventHandler;
import org.event_handler.game_utility_event.GameUtilityEventInitiator;
import org.event_handler.game_utility_event.GameUtilityEventResponder;
import org.player_classes.Magic;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Complete mess used for testing

        try (PrintWriter writer = new PrintWriter("./src/main/resources/foo.txt")) {
            writer.write("asddasdddddddddddddddddddddddddddddddd");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("foo.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Hello world!");

        DamageEventInitiator damageEventInitiator = new DamageEventInitiator();
        DamageEventResponder damageEventResponder = new DamageEventResponder();

        damageEventInitiator.addListeners(damageEventResponder);

        damageEventInitiator.playerDoesDamage(22);

        Magic magic = new Magic();

        System.out.println(magic.getDamage());

        magic.setDamage(12);

        System.out.println(magic.getDamage());

        GameUtilityEventInitiator gameUtilityEventInitiator = new GameUtilityEventInitiator();
        GameUtilityEventResponder gameUtilityEventResponder = new GameUtilityEventResponder();

        gameUtilityEventInitiator.addListeners(gameUtilityEventResponder);

        GameUtilityEventHandler gameUtilityEventHandler = new GameUtilityEventHandler();

        gameUtilityEventInitiator.runMainGameplayLoop(gameUtilityEventHandler);


    }
}