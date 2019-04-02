import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanPattern {

    // Atributos

    private static String grupoSumatorio = "[MCXI]{3}|(?<!C)[DM]|(?<!X)[LC](?!D)|(?<!I)[VX](?![LC])|I(?![VX])";
    private static String grupoSustractivo = "(C[DM])|(X[LC])|(I[VX])";
    private static String[] listaGrupos = {grupoSustractivo, grupoSumatorio};

    // Getters

    public static String[] getListaGrupos() {
        return listaGrupos;
    }

    // Metodos

    public static boolean verificarNumero(String numero) {
        String verify = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})";
        return numero.matches(verify);
    }

    public int encontrarLetra(String fuente) {

        int resultado = 0;

        for (String regex : getListaGrupos()) {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(fuente);
            while (m.find()) {
                for (NumerosRomanos letra : NumerosRomanos.values()) {
                    if (m.group().equals(letra.name())) {
                        resultado += letra.getValor();
                    }
                }
            }
        }
        return resultado;
    }

    /**
     *
     */

}
