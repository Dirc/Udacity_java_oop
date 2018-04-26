public class U2 extends Rocket {
    // Fields
    private int cost;
    private int rocketWeight;
    private int totalWeight;

    public U2() {
        super(29000);
        this.rocketWeight = 18000;
        this.cost         = 100;
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
