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
        assertEquals(18000, this.u1.totalWeight);
    }
}