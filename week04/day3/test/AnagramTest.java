import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void anagramCheckfalse() throws Exception {

        Anagram anag = new Anagram();

        assertFalse(anag.anagramCheck("alma","korte"));

    }

    @Test
    public void anagramCheckTrue() throws Exception {

        Anagram anag = new Anagram();

        assertTrue(anag.anagramCheck("alma","alma"));

    }

}