import java.util.regex.Pattern;

public class RomanPattern {

    // Atributos

    private String grupoSumatorio = "[MCXI]{3}|(?<!C)[DM]|(?<!X)[LC](?!D)|(?<!I)[VX](?![LC])|I(?![VX])";
    private String grupoSustractivo = "(C[DM])|(X[LC])|(I[VX])";

    public static boolean verificarString(String numero) {
        String verify = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})";
        return numero.matches(verify);
    }

    /**
     * public int encontrarLetra(String fuente) {
     *     }
     */

}
