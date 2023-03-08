package org.event_handler.game_utility_event;

import org.event_handler.damage_event.DamageEventHandler;
import org.event_handler.load_event.LoadEventInitiator;
import org.event_handler.save_event.SaveEventInitiator;
import org.event_handler.user_interface_event.UserInterfaceEventHandler;
import org.load.LoadHighScore;
import org.load.LoadPlayerClass;
import org.save.SaveHighScore;
import org.save.SavePlayerClass;

public class GameUtilityEventHandler {
    private final UserInterfaceEventHandler userInterfaceEventHandler;
    private final SaveEventInitiator saveEventInitiator;

    public GameUtilityEventHandler() {
        GameUtilityEventInitiator gameUtilityEventInitiator = new GameUtilityEventInitiator();
        GameUtilityEventResponder gameUtilityEventResponder = new GameUtilityEventResponder();

        gameUtilityEventInitiator.addListeners(gameUtilityEventResponder);



        SaveEventInitiator saveEventInitiator = new SaveEventInitiator();
        SaveHighScore saveHighScore = new SaveHighScore();
        SavePlayerClass savePlayerClass = new SavePlayerClass();

        saveEventInitiator.addListeners(saveHighScore);
        saveEventInitiator.addListeners(savePlayerClass);



        LoadEventInitiator loadEventInitiator = new LoadEventInitiator();
        LoadHighScore loadHighScore = new LoadHighScore();
        LoadPlayerClass loadPlayerClass = new LoadPlayerClass();

        loadEventInitiator.addListeners(loadHighScore);
        loadEventInitiator.addListeners(loadPlayerClass);



        UserInterfaceEventHandler userInterfaceEventHandler = new UserInterfaceEventHandler();
        DamageEventHandler damageEventHandler = new DamageEventHandler();

        userInterfaceEventHandler.setDamageEventInitiator(damageEventHandler.getDamageEventInitiator());
        damageEventHandler.setUserInterfaceEventInitiator(userInterfaceEventHandler.getUserInterfaceEventInitiator());

        userInterfaceEventHandler.setSaveEventInitiator(saveEventInitiator);
        damageEventHandler.setSaveEventInitiator(saveEventInitiator);

        userInterfaceEventHandler.setLoadEventInitiator(loadEventInitiator);
        damageEventHandler.setLoadEventInitiator(loadEventInitiator);

        this.userInterfaceEventHandler = userInterfaceEventHandler;
        this.saveEventInitiator = saveEventInitiator;
    }

    public UserInterfaceEventHandler getUserInterfaceEventHandler() {
        return userInterfaceEventHandler;
    }

    public SaveEventInitiator getSaveEventInitiator() {
        return saveEventInitiator;
    }
}
