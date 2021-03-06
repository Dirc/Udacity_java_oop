import org.junit.Test;

import static org.junit.Assert.*;

public class U1Test {
    U1 u1;

    @org.junit.Before
    public void setUp() throws Exception {
        this.u1 = new U1();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void u1() {
        assertEquals(18000, this.u1.maxWeight);
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
            random = u1.random();
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
        Double a = 0.0, b = 0.05, c = 0.99;
        assertFalse("Should be false", this.u1.determinedLaunch(a));
        assertTrue("Should be true", this.u1.determinedLaunch(b));
        assertTrue("Should be true", this.u1.determinedLaunch(c));
    }

    @Test
    public void land() {
        Double a = 0.0, b = 0.01, c = 0.99;
        assertFalse("Should be false", this.u1.determinedLand(a));
        assertTrue("Should be true", this.u1.determinedLand(b));
        assertTrue("Should be true", this.u1.determinedLand(c));
    }

}