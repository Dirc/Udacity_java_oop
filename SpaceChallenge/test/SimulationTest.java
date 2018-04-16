import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SimulationTest {
    Item item_light1, item_light2, item_heavy;
    SpaceShip testship;
    Simulation sim;
    String filePath;

    @Before
    public void setUp() throws Exception {
        this.filePath = "/home/cornet/code/prive/Udacity_java_oop/SpaceChallenge/test/item_list.txt";
        this.item_light1 = new Item("fuel1", 10);
        this.item_light2 = new Item("fuel2", 10);
        this.item_heavy = new Item("apples", 101);
        this.testship = new SpaceShip(100);
        this.sim = new Simulation(this.testship);
    }

    @Test
    public void loadItems() throws Exception {
        // Verify it is an ArrayList?
        // Set Up expected
        ArrayList<Item> expected = new ArrayList<Item>();
        expected.add(this.item_light1);
        expected.add(this.item_light2);
        //assertEquals("ArrayList not as expected", expected, this.sim.loadItems(this.filePath));
    }
}

