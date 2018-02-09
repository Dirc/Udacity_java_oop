public class U2 extends Rocket {
    // Fields
    private int cost;
    private int rocketWeight;
    private int totalWeight;

    public U2(int totalWeight) {
        super(totalWeight);
    }


    //methods override from Rocket
    public boolean launch() {
        // calculate change
        // 0,04 * (currentWeight / totalWeight)
        return true;
    }

    public boolean land() {
        // 0,08 * (currentWeight / totalWeight)
        return true;
    }
}
