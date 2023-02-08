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
        userInterfaceDisplay.setEnemyClass(goblin);

    }

    @Override
    public void getFightResultData(UserInterfaceDisplay userInterfaceDisplay, DefaultAttributes playerClass, Goblin enemyClass) {
        double enemyHealth = enemyClass.getHealth();
        double enemyDamage = enemyClass.getDamage();
        double enemyResistance = enemyClass.getResistance();

        double playerHealth = playerClass.getHealth();
        double playerDamage = playerClass.getDamage();
        double playerResistance = playerClass.getResistance();

        enemyHealth -= playerDamage - (playerDamage * (enemyResistance * 0.01));
        playerHealth -= enemyDamage - (enemyDamage * (playerResistance * 0.01));

        enemyClass.setHealth(enemyHealth);
        playerClass.setHealth(playerHealth);

        userInterfaceDisplay.setEnemyClass(enemyClass);
        userInterfaceDisplay.setPlayerClass(playerClass);
    }
}
