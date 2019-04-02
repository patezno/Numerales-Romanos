import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void encontrarLetraTest() {
        String sencillo = "XXVI";
        String normal = "CXLV";
        String semiNormal = "CD";
        String complejo = "CCCXLII";
        String dificil = "DLXXXIX";
        String leyenda = "MMMCMLI";
        String dios = "MCMXLVII";
        String diosDos = "MMMCMXCIX";
        String cuatroCientosCatorce = "CDXIV";
        String cuatroCientosTreintaNueve  = "CDXXXIX";
        String numeroFallo = "XCD";

        assertEquals(26, RomanPattern.encontrarLetra(sencillo), 0);
        assertEquals(145, RomanPattern.encontrarLetra(normal), 0);
        assertEquals(400, RomanPattern.encontrarLetra(semiNormal), 0);
        assertEquals(342, RomanPattern.encontrarLetra(complejo), 0);
        assertEquals(589, RomanPattern.encontrarLetra(dificil), 0);
        assertEquals(3951, RomanPattern.encontrarLetra(leyenda), 0);
        assertEquals(1947, RomanPattern.encontrarLetra(dios), 0);
        assertEquals(3999, RomanPattern.encontrarLetra(diosDos), 0);
        assertEquals(414, RomanPattern.encontrarLetra(cuatroCientosCatorce), 0);
        assertEquals(439, RomanPattern.encontrarLetra(cuatroCientosTreintaNueve), 0);
        assertEquals(0, RomanPattern.encontrarLetra(numeroFallo), 0);
    }

}
