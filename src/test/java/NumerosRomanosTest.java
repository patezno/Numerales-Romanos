import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumerosRomanosTest {

    @Test
    public void verificarNumerosTest() {
        assertFalse(RomanPattern.verificarNumero("IVX"));
        assertFalse(RomanPattern.verificarNumero("MIL"));
        assertFalse(RomanPattern.verificarNumero("CDD"));
        assertFalse(RomanPattern.verificarNumero("MXCD"));
        assertTrue(RomanPattern.verificarNumero("MMM"));
        assertTrue(RomanPattern.verificarNumero("MMMDCCCLXXXVIII"));
        assertFalse(RomanPattern.verificarNumero("MDCLXVIV"));
    }

}
