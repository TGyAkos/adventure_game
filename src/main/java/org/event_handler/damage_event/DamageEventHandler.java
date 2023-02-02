package org.event_handler.damage_event;

import org.event_handler.user_interface_event.UserInterfaceEventInitiator;

public class DamageEventHandler {
    private final DamageEventInitiator damageEventInitiator;
    private UserInterfaceEventInitiator userInterfaceEventInitiator;

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
}
