import java.util.Random;

public class U1 extends Rocket {
    // Fields
    private int    cost;
    private int    rocketWeight;
    private double chanceOfLaunchExplosion;
    private double chanceOfLandingCrash;

    // Constructor
    public U1() {
        super(18000);
        this.rocketWeight            = 10000;
        this.cost                    = 120;
        this.chanceOfLaunchExplosion = 0.05 * (this.currentWeight / super.totalWeight);
        this.chanceOfLandingCrash    = 0.01 * (this.currentWeight / super.totalWeight);
    }

    // Generate random double
    private Double random() {
        Random random = new Random();
        return random.nextDouble();
    }

    private boolean determinedLaunch(Double random) {
        if (random <= this.chanceOfLaunchExplosion) {
            return false;
        } else {
            return true;
        }
    }

    private boolean determinedLand(Double random) {
        if (random <= this.chanceOfLandingCrash) {
            return false;
        } else {
            return true;
        }
    }

    //methods override from Rocket
    public boolean launch() {
        this.determinedLaunch(this.random());
    }

    public boolean land() {
        this.determinedLaunch(this.random());
    }
}
