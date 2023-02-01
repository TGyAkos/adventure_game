package org.event_handler.damage_event;

import org.player_classes.DefaultAttributes;
import org.user_interface.UserInterfaceDisplay;

import java.util.ArrayList;
import java.util.List;

public class DamageEventInitiator {
    private final List<DamageEventListener> listeners = new ArrayList<>();

    public void addListeners(DamageEventListener toAdd) {
        listeners.add(toAdd);
    }

    public void playerDoesDamage(int amountOfDamage) {
        for (DamageEventListener damageEventListener : listeners) {
            damageEventListener.damageDoneByPlayer(amountOfDamage);
        }
    }

    public void calculateAndSpawnEnemy(UserInterfaceDisplay userInterfaceDisplay, DefaultAttributes playerClass) {
        for (DamageEventListener damageEventListener : listeners) {
            damageEventListener.calculateAndSpawnEnemy(userInterfaceDisplay, playerClass);
        }
    }
}
