package TiendaMascotas;

public class Perros extends Mascota{

    protected float peso;
    protected boolean muerde;

    
    public Perros(String nombre, int edad, String color, float peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }


    @Override
    public String toString() {
        return "Perros [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", muerde=" + muerde + ", color="
                + color + "]";
    }

    public static String sonido() {
        return "Los perros ladran.";
    }
    
}
