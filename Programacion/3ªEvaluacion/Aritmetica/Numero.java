package Aritmetica;

public abstract class Numero {

    protected int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public Numero() {
        this.valor = 0;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Numero [valor=" + valor + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + valor;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Numero other = (Numero) obj;
        if (valor != other.valor)
            return false;
        return true;
    }

    // metodos propios
    public abstract Numero sumar(Numero num);

    public abstract Numero restar(Numero num);

    public abstract Numero multiplicar(Numero num);
    
    public abstract Numero dividir(Numero num);


    
}
