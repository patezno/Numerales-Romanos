import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumerosRomanosTest {

    @Test
    public void numeroBasicoTest() {
        String numRomano = "I";
        assertEquals(NumerosRomanos.transformar(numRomano), 1);
    }

}
