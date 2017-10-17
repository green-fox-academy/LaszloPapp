import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void factorio() throws Exception {
        Factorial fact = new Factorial();
        assertEquals(10,Factorial.factorio(2));
    }

}