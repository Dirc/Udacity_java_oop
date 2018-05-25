import org.junit.Test;

import static org.junit.Assert.*;

public class U2Test {
    U2 u2;

    @org.junit.Before
    public void setUp() throws Exception {
        this.u2 = new U2();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void u2() {
        assertEquals(29000, this.u2.maxWeight);
    }


    @Test
    public void random() {
        // Method should
        // - return a double
        // - between 0 and 1
        // - average around 0.5
        int numberOfTests = 1000;
        double total = 0, min = 0, max = 0;
        double expectedAverage;
        double random;
        for (int i = 0; i < numberOfTests; i++) {
            random = u2.random();
            total = total + random;
            min = Math.min(min, random);
            max = Math.max(max, random);
        }
        expectedAverage = total / numberOfTests;
        // 10 times average should be 5.
        assertEquals(5, Math.round(expectedAverage * 10));

        double minimal = 0, maximal = 1;
        assertTrue( min >= minimal);
        assertTrue( max <= maximal);
    }

    @Test
    public void determinedLaunch() {
    }

    @Test
    public void launch() {
        Double a = 0.0, b = 0.04, c = 0.99;
        assertFalse("Should be false", this.u2.determinedLaunch(a));
        assertTrue("Should be true", this.u2.determinedLaunch(b));
        assertTrue("Should be true", this.u2.determinedLaunch(c));
    }

    @Test
    public void land() {
        Double a = 0.0, b = 0.08, c = 0.99;
        assertFalse("Should be false", this.u2.determinedLand(a));
        assertTrue("Should be true", this.u2.determinedLand(b));
        assertTrue("Should be true", this.u2.determinedLand(c));
    }

}