package org.event_handler.damage_event;

public class DamageEventHandler {
    private final DamageEventInitiator damageEventInitiator;

    public DamageEventHandler() {
        DamageEventInitiator damageEventInitiator = new DamageEventInitiator();
        DamageEventResponder damageEventResponder = new DamageEventResponder();

        damageEventInitiator.addListeners(damageEventResponder);

        this.damageEventInitiator = damageEventInitiator;
    }

    public DamageEventInitiator getDamageEventInitiator() {
        return damageEventInitiator;
    }
}
