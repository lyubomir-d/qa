package lab8;


import org.junit.Test;

import static lab8.DuplicatesSymbols.removeDuplicatesSymbols;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DublicatesSymbolsTest {
    @Test
    public void testGetAbbreviation() {
        assertEquals("b", removeDuplicatesSymbols("aab"));
        assertEquals("bc", removeDuplicatesSymbols("aaaaaabc"));
        assertEquals("", removeDuplicatesSymbols("aaabb"));
        assertEquals("abc", removeDuplicatesSymbols("abc"));
        assertEquals("a", removeDuplicatesSymbols("a"));
        assertEquals("abB", removeDuplicatesSymbols("aAAbB"));

        assertNotEquals("aAAbB", removeDuplicatesSymbols("aAAbB"));
    }
}
