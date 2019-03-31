import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumerosRomanosTest {

    @Test
    public void verificarNumerosTest() {
        assertFalse(RomanPattern.verificarString("IVX"));
        assertFalse(RomanPattern.verificarString("MIL"));
        assertFalse(RomanPattern.verificarString("CDD"));
        assertFalse(RomanPattern.verificarString("MXCD"));
        assertTrue(RomanPattern.verificarString("MMM"));
        assertTrue(RomanPattern.verificarString("MMMDCCCLXXXVIII"));
        assertFalse(RomanPattern.verificarString("MDCLXVIV"));
    }

}
