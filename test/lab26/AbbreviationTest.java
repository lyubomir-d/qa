package lab26;

import org.junit.Test;

import static lab26.Abbreviation.getAbbreviation;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AbbreviationTest {
    @Test
    public void testGetAbbreviation() {
        assertEquals("ОЧТ", getAbbreviation("Общество Чистых Тарелок"));
        assertEquals("ОЧТ", getAbbreviation("Общество-Чистых-Тарелок"));
        assertEquals("ОЧТ", getAbbreviation("Общество-чистых Тарелок"));
        assertEquals("ОЧТ", getAbbreviation("общество чистых тарелок"));

        assertNotEquals("ОЧТ", getAbbreviation("обществоЧистыхТарелок"));
    }
}




