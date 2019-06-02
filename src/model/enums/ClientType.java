package model.enums;

public enum ClientType {

    TRADICIONAL(1), PREMIUM(0);


    private final int tipo;

    ClientType(int tipo){
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
}
