package org.adventure_game;

import org.event_handler.damage_event.DamageEventInitiator;
import org.event_handler.damage_event.DamageEventResponder;
import org.event_handler.game_utility_event.GameUtilityEventInitiator;
import org.event_handler.game_utility_event.GameUtilityEventResponder;
import org.player_classes.Magic;

public class Main {
    public static void main(String[] args) {
        // Complete mess used for testing
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

        gameUtilityEventInitiator.gameStart();


    }
}