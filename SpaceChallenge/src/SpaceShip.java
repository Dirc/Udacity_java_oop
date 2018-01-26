import java.util.ArrayList;

public class SpaceShip {
    // Fields:
    int totalWeight;
    int currentWeight;
    ArrayList bag;

    // Constructor
    public SpaceShip(int totalWeight) {
        this.totalWeight = totalWeight;
        this.currentWeight = 0;
        ArrayList bag = new ArrayList();
    }

    // Methods:
    public launch() {
        if ( true ) {
            return true;
        }
        else {
            return false;
        }
    }

    public land() {
        // Result landing
        if ( true ) {
            return true;
        }
        else {
            return false;
        }
    }

/*
    public canCarry(Item item) {
        if (item.getWeight + currentWeight < totalWeight) {
            return true;
        }
        else {
            return false;
        }
    }

    public carry(Item item) {
        bag.add(item);
        this.currentWeight =+ item.getWeight;
    }
*/

}
