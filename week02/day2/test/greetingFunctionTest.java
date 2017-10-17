import org.junit.Test;

import static org.junit.Assert.*;

public class greetingFunctionTest {
    @Test
    public void greet() throws Exception {
        greetingFunction greet = new greetingFunction();
        assertNotEquals("Greetings dear ",greetingFunction.greet("kutya"));
    }

}