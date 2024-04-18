package Aritmetica;

public abstract class Fraccion extends Numero{

    private int numerador;
    private int denominador;
    
    public Fraccion(int valor, int numerador, int denominador) {
        super(valor);
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public int getNumerador() {
        return numerador;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    public int getDenominador() {
        return denominador;
    }
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    @Override
    public String toString() {
        return "Fraccion [valor=" + valor + ", numerador=" + numerador + ", denominador=" + denominador + "]";
    }
    
}
