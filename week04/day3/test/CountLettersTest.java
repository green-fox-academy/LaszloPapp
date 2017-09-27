import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

    @Test
    public void letterNum() throws Exception {

        CountLetters countLetters = new CountLetters("kuttya");

        assertEquals("{a=1, t=2, u=1, y=1, k=1}", countLetters.letterNum().toString());

    }

}