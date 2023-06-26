package org.fasttrackit;

public class Fanta {
    int totalCapacity;
    int availableLiquid;
    boolean open;

    public Fanta(int totalCapacity, int availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;

    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public boolean getOpen() {
        return open;
    }

    public boolean maxAvailability() {
        if (this.availableLiquid >= 200)
            return true;
        else
            return false;

    }

    public int theAvailableLiquid() {
        return availableLiquid;
    }

    public int emptyCapacity() {
        return (totalCapacity - availableLiquid);
    }

    public boolean openBottle() {
        if (this.open == false)
            this.open = true;
        System.out.println("Bottle is opened");
        return this.open;

    }

    public boolean closedBottle() {
        if (this.open == true)
            this.open = false;
        System.out.println("Bottle is closed");
        return this.open;

    }
    public int drink(int quantity) {
        if (quantity >= this.availableLiquid)
            System.out.println("Ati baut tot!");
        else
            System.out.println("Ati baut " + quantity);
        return (availableLiquid - quantity);
    }
}
