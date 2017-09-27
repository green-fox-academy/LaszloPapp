import static org.junit.Assert.*;

public class AppleTest {


    @org.junit.Test
    public void getApple() throws Exception {

        Apple apple = new Apple("apple");
        assertEquals("apple", apple.getApple());

    }

    @org.junit.Test
    public void getApple1() throws Exception {

        Apple apple = new Apple("apple");
        assertEquals("peach", apple.getApple());

    }

}