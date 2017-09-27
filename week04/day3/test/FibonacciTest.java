import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {


    @Test
    public void fibonaPos() throws Exception {

        Fibonacci fibonacci = new Fibonacci();

        assertEquals(9, fibonacci.getPos());

    }

}