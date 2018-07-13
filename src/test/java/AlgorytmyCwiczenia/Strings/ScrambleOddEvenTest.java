package AlgorytmyCwiczenia.Strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScrambleOddEvenTest {

    @Test
    public void testSomething() {
        assertEquals("Wleclgltihuebredrf ofsheesenasnegrof", ScrambleOddEven.sortMyString("Wolfeschlegelsteinhausenbergerdorff"));
        assertEquals("MTINLHENLHENGUAIYAGNL EHOYTROYTROYLTMNLRIY", ScrambleOddEven.sortMyString("METHIONYLTHREONYLTHREONYGLUTAMINYLARGINYL"));
        assertEquals("PEMNUTAIRSOISLCVLAOOISS NUOOLRMCOCPCIIOOCNCNOI", ScrambleOddEven.sortMyString("PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS"));
        assertEquals("PEDPEDHPPRTYODS SUOSUOYOAAHRIIM", ScrambleOddEven.sortMyString("PSEUDOPSEUDOHYPOPARATHYROIDISM"));
        assertEquals("FOCNUIIIIIIIAIN LCIACNHLPLFCTO", ScrambleOddEven.sortMyString("FLOCCINAUCINIHILIPILIFICATION"));
        assertEquals("SBEMTGYHC UDRAOLPI", ScrambleOddEven.sortMyString("SUBDERMATOGLYPHIC"));
    }

}