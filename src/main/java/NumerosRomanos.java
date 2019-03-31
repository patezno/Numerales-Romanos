public enum NumerosRomanos {

    // Constantes

    I(1),
    IV(4),
    V(5),
    IX(9),
    X(10),
    XL(40),
    L(50),
    XC(90),
    C(100),
    CD(400),
    D(500),
    CM(900),
    M(1000);

    // Atributos

    private int valor = 0;

    // Constructor

    NumerosRomanos(int valor) {
        this.valor = valor;
    }

    // Getters

    public int getValor() {
        return valor;
    }

}
