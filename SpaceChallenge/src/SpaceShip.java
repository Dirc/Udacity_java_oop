import java.util.ArrayList;

public class SpaceShip {
    // Fields:
    public int maxWeight;
    public int currentWeight;
    public ArrayList<Item> bag;

    // Constructor
    public SpaceShip(int maxWeight) {
        this.maxWeight   = maxWeight;
        this.currentWeight = 0;

        bag = new ArrayList<Item>();
    }

    // Methods:
    public Boolean launch(Boolean true_or_false) {
        return true_or_false;
    }

    public Boolean land(Boolean true_or_false) {
        return true_or_false;
    }

    // Can this made private? Looks like just a helper function..
    public Boolean canCarry( Item item ) {
        if (item.getWeight() + currentWeight < maxWeight) {
            return true;
        }
        else {
            return false;
        }
    }

    public void carry(Item item) {
        if (this.canCarry( item )) {
            bag.add(item);
            // update weight
            this.currentWeight += item.getWeight();
        } else {
            System.out.println("Can't carry item: " + item.getName());
        }
    }

    public ArrayList<Item> getBag() {
        return bag;
    }
}
