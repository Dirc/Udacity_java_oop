import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    String name;
    int weight;
    Item item;

    @org.junit.Before
    public void setUp() throws Exception {
        this.name = "apple";
        this.weight = 1;
        this.item = new Item(name, weight);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getWeight() {
        assertEquals(this.weight, this.item.getWeight());
    }

    @org.junit.Test
    public void getName() {
        assertEquals(this.name, this.item.getName());
    }

/*
    @org.junit.Test
    public void setName() {
    }
*/
}