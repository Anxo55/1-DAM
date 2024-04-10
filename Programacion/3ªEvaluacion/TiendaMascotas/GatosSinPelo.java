package TiendaMascotas;

public class GatosSinPelo extends Gatos{

    enum tipoGato{ESFINGE, ELFO, DONSKOY}

    protected tipoGato tipogato;

    public GatosSinPelo(String nombre, int edad, String color, float altura, float longitudDeSalto, tipoGato tipogato) {
        super(nombre, edad, color, altura, longitudDeSalto);
        this.tipogato = tipogato;
    }

    public tipoGato getTipogato() {
        return tipogato;
    }

    public void setTipogato(tipoGato tipogato) {
        this.tipogato = tipogato;
    }

    @Override
    public String toString() {
        return "GatosSinPelo [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", longitudDeSalto="
                + longitudDeSalto + ", color=" + color + ", tipogato=" + tipogato + "]";
    }

    
    
}
