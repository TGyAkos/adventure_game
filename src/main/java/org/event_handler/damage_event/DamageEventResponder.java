package org.event_handler.damage_event;

import org.enemies.Goblin;
import org.player_classes.DefaultAttributes;
import org.user_interface.UserInterfaceDisplay;

public class DamageEventResponder implements DamageEventListener {
    // Dead code below
    @Override
    public void damageDoneByPlayer(int amountOfDamage) {
        System.out.printf("%d amount of damage", amountOfDamage);
    }

    @Override
    public void calculateAndSpawnEnemy(UserInterfaceDisplay userInterfaceDisplay, DefaultAttributes playerClass){
        Goblin goblin = new Goblin(playerClass);
        userInterfaceDisplay.setEnemy(goblin);

    }
}
