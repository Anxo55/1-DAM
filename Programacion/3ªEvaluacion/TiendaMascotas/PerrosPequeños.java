package TiendaMascotas;

public class PerrosPequeños extends Perros{

    enum razas{CANICHE, YORKSHIRE_TERRIER, SCHNAUZER, CHIHUAHUA}

    protected razas raza;

    public PerrosPequeños(String nombre, int edad, String color, float peso, boolean muerde, razas raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    public razas getRaza() {
        return raza;
    }

    public void setRaza(razas raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "PerrosPequeños [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", muerde=" + muerde
                + ", color=" + color + ", raza=" + raza + "]";
    }


}
