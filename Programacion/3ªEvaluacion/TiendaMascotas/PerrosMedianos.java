package TiendaMascotas;

public class PerrosMedianos extends Perros{

   enum razas{COLLIE, DALMATA, BULLDOG, GALGO, SABUESO}

   protected razas raza;

public PerrosMedianos(String nombre, int edad, String color, float peso, boolean muerde, razas raza) {
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
    return "PerrosMedianos [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", muerde=" + muerde + ", color="
            + color + ", raza=" + raza + "]";
}


}
