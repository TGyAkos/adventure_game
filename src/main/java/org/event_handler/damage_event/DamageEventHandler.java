package org.event_handler.damage_event;

import org.event_handler.load_event.LoadEventInitiator;
import org.event_handler.save_event.SaveEventInitiator;
import org.event_handler.user_interface_event.UserInterfaceEventInitiator;

public class DamageEventHandler {
    private final DamageEventInitiator damageEventInitiator;
    private UserInterfaceEventInitiator userInterfaceEventInitiator;
    private SaveEventInitiator saveEventInitiator;
    private LoadEventInitiator loadEventInitiator;

    public DamageEventHandler() {
        DamageEventInitiator damageEventInitiator = new DamageEventInitiator();
        DamageEventResponder damageEventResponder = new DamageEventResponder();

        this.damageEventInitiator = damageEventInitiator;

        this.damageEventInitiator.addListeners(damageEventResponder);
    }

    public void startDamageEventHandler() {

    }

    public DamageEventInitiator getDamageEventInitiator() {
        return damageEventInitiator;
    }

    public void setUserInterfaceEventInitiator(UserInterfaceEventInitiator userInterfaceEventInitiator) {
        this.userInterfaceEventInitiator = userInterfaceEventInitiator;
    }

    public void setSaveEventInitiator(SaveEventInitiator saveEventInitiator) {
        this.saveEventInitiator = saveEventInitiator;
    }

    public void setLoadEventInitiator(LoadEventInitiator loadEventInitiator) {
        this.loadEventInitiator = loadEventInitiator;
    }
}
