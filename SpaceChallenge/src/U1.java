import java.util.Random;

public class U1 extends Rocket {
    // Fields
    private int cost;
    private int rocketWeight;

    // Constructor
    public U1() {
        super(18000);
        this.rocketWeight = 10000;
        this.cost         = 120;
    }

    // Generate random double
    private Double random() {
        Random random = new Random();
        return random.nextDouble();
    }

    // calculate chance
    private Double failureChance() {
        double chance = 0.05 * (this.currentWeight / super.totalWeight);
        return chance;
    }

    //methods override from Rocket
    public boolean launch(Double random) {
/*
        if (random) {}
        else {
            random = this.random();
        }
*/
        if (random <= this.failureChance()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean land() {
        // 0,01 * (currentWeight / totalWeight)
        return true;
    }

}
