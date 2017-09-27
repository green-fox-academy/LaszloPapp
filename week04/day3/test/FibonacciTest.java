import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {


    @Test
    public void fibonaPos() throws Exception {

        Fibonacci fibonacci = new Fibonacci(9);

        assertEquals( 15, fibonacci.fibonaPos());

    }


    @Test
    public void fibonaPos0() throws Exception {

        Fibonacci fibonacci = new Fibonacci(0);

        assertEquals( 0, fibonacci.fibonaPos());

    }

    @Test
    public void fibonaPos1() throws Exception {

        Fibonacci fibonacci = new Fibonacci(1);

        assertEquals( 1, fibonacci.fibonaPos());

    }

}