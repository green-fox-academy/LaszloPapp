import org.junit.Test;

import static org.junit.Assert.*;

public class DoublingTest {
    @Test
    public void doubling() throws Exception {
        Doubling doub = new Doubling();
        assertEquals(4, Doubling.doubling(2));
    }

}
