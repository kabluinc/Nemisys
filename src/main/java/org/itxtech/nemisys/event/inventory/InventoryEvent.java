package org.itxtech.nemisys.event.inventory;

import org.itxtech.nemisys.Player;
import org.itxtech.nemisys.event.Event;
import org.itxtech.nemisys.inventory.Inventory;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public abstract class InventoryEvent extends Event {

    protected Inventory inventory;

    public InventoryEvent(Inventory inventory) {
        this.inventory = inventory;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Player[] getViewers() {
        return this.inventory.getViewers().stream().toArray(Player[]::new);
    }

}
