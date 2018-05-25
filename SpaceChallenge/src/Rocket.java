public class Rocket extends SpaceShip {

    public Rocket(int maxWeight) {
        super(maxWeight);
    }

    // Methods
    // Override launch (always true)
    public boolean launch() {
        return true;
    }

    // Override land (always true)
    public boolean land() {
        return true;
    }
}
