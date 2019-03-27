public enum NumerosRomanos {

    // Constantes

    I(1),
    II(2),
    III(3),
    IV(4),
    V(5),
    VI(6),
    VII(7),
    VIII(8),
    IX(9),
    X(10),
    L(50),
    C(100),
    D(500),
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
