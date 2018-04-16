import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SpaceShipTest {
    Item item_light1, item_light2, item_heavy;
    SpaceShip testship;

    @Before
    public void setUp() throws Exception {
        this.item_light1 = new Item("fuel1", 10);
        this.item_light2 = new Item("fuel2", 10);
        this.item_heavy = new Item("apples", 101);
        this.testship = new SpaceShip(100);
    }

    @Test
    public void launch() {
    }

    @Test
    public void land() {
    }

    @Test
    public void canCarry() {
        assertTrue(this.testship.canCarry(item_light1));
        assertFalse(this.testship.canCarry(item_heavy));
    }

    @Test
    public void carry() {
        // Set Up
        int old_weight, new_weight;

        // Can carry:
        // - in bag
        // - update weight 2x
        old_weight = this.testship.currentWeight;
        this.testship.carry(this.item_light1);
        new_weight = this.testship.currentWeight;
        assertNotEquals(old_weight,new_weight);

        old_weight = this.testship.currentWeight;
        this.testship.carry(this.item_light2);
        new_weight = this.testship.currentWeight;
        assertNotEquals(old_weight,new_weight);
        assertEquals(old_weight+10,new_weight);


        // To heavy:
        // - bag unchanged
        // - weight unchanged
        old_weight = this.testship.currentWeight;
        this.testship.carry(this.item_heavy);
        new_weight = this.testship.currentWeight;
        assertEquals(old_weight,new_weight);

    }

    @Test
    public void getBag() {
        // Verify if bag is returned as expected (with two item objects)
        // Set Up
        SpaceShip testbag = new SpaceShip(100);
        this.testship.carry(this.item_light1);
        this.testship.carry(this.item_light2);
        // Set Up expected
        ArrayList<Item> expected = new ArrayList<Item>();
        expected.add(this.item_light1);
        expected.add(this.item_light2);

        // Test
        assertEquals("Bag not as expected", expected, this.testship.getBag());
    }
}