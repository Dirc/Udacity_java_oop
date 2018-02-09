import java.util.ArrayList;

public class SpaceShip {
    // Fields:
    int totalWeight;
    int currentWeight;
    ArrayList<Item> bag;

    // Constructor
    public SpaceShip(int totalWeight) {
        this.totalWeight = totalWeight;
        this.currentWeight = 0;

        bag = new ArrayList<Item>();
    }

/*    // Advice from Intelij???
    public SpaceShip() {
        bag = new ArrayList<Item>();
    }*/

    // Methods:
    public Boolean launch(Boolean true_or_false) {
        return true_or_false;
    }

    public Boolean land(Boolean true_or_false) {
        return true_or_false;
    }

    // Can this made private? Looks like just a helper function..
    public Boolean canCarry( Item item ) {
        if (item.getWeight() + currentWeight < totalWeight) {
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
            this.currentWeight =+ item.getWeight();
        } else {
            System.out.println("Can't carry item: " + item.getName());
        }
    }

    public ArrayList<Item> getBag() {
        System.out.println("Elements are: " + bag );
        return bag;
    }
}
