public class U1 extends Rocket {
    // Fields
    private int cost;
    private int rocketWeight;
    private int totalWeight;

    public U1(int totalWeight) {
        super(totalWeight);
    }


    //methods override from Rocket
    public boolean launch() {
        // calculate change
        // 0,05 * (currentWeight / totalWeight)
        return true;
    }

    public boolean land() {
        // 0,01 * (currentWeight / totalWeight)
        return true;
    }

}