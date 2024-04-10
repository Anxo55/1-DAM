package TiendaMascotas;

public class GatosPeloCorto extends Gatos{

    enum tipoGato{AZUL_RUSO, BRITA_NICO, MANX, DEVON_REX}

    protected tipoGato tipogato;

    public GatosPeloCorto(String nombre, int edad, String color, float altura, float longitudDeSalto,
            tipoGato tipogato) {
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
        return "GatosPeloCorto [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", longitudDeSalto="
                + longitudDeSalto + ", color=" + color + ", tipogato=" + tipogato + "]";
    }

    
    
}
