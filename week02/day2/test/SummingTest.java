import org.junit.Test;

import static org.junit.Assert.*;

public class SummingTest {
    @Test
    public void sum() throws Exception {
        Summing sum = new Summing();

        assertEquals(210,Summing.sum(21));
    }

    @Test
    public void sum1() throws Exception {
        Summing sum = new Summing();

        assertEquals(190,Summing.sum(20));
    }

}