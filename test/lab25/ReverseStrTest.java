package lab25;

import org.junit.Test;

import static lab25.ReverseStr.getReverseStr1;
import static lab25.ReverseStr.getReverseStr2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ReverseStrTest {
    @Test
    public void testGetReverseStr1() {
        assertEquals("тсет", getReverseStr1("тест"));
        assertEquals("", getReverseStr1(""));
        assertEquals("a", getReverseStr1("a"));
        assertEquals("1a", getReverseStr1("a1"));
        assertEquals("1a!", getReverseStr1("!a1"));

        assertNotEquals("тест", getReverseStr1("тест"));
    }
    @Test
    public void testGetReverseStr2() {
        assertEquals("тсет", getReverseStr2("тест"));
        assertEquals("", getReverseStr2(""));
        assertEquals("a", getReverseStr2("a"));
        assertEquals("1a", getReverseStr2("a1"));
        assertEquals("1a!", getReverseStr1("!a1"));

        assertNotEquals("тест", getReverseStr2("тест"));
    }
}
