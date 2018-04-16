import java.util.Random;

public class U1 extends Rocket {
    // Fields
    private int cost;
    private int rocketWeight;
    private int totalWeight;

    public U1(int totalWeight) {
        super(totalWeight);
        //super.totalWeight = 18000;
        //this.totalWeight = 18000;
        //this.cost = 100;
        this.rocketWeight = 10000;
    }

    // Generate random double
    private Double random() {
        Random random = new Random();
        return random.nextDouble();
    }

    // calculate chance
    private Double failureChance() {
        double chance = 0.05 * (this.currentWeight / this.totalWeight);
        return chance;
    }

    //methods override from Rocket
    public boolean launch(Double random) {
        if (random) {}
        else {
            random = this.random();
        }
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
