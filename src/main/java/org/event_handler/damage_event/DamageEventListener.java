package org.event_handler.damage_event;

import org.player_classes.DefaultAttributes;
import org.user_interface.UserInterfaceDisplay;

interface DamageEventListener {
    void damageDoneByPlayer(int amountOfDamage);
    // DefaultAttributes are working, but they're wrong for the job find a better replacement
    void calculateAndSpawnEnemy(UserInterfaceDisplay userInterfaceDisplay, DefaultAttributes playerClass);

}
