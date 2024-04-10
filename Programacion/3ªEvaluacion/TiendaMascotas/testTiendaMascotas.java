package TiendaMascotas;

import java.util.ArrayList;

import TiendaMascotas.PerrosGrandes.razas;

public class testTiendaMascotas {

    public static void main(String[] args) {

        ArrayList<Mascota> tiendaMascotas = new ArrayList<Mascota>();

        Mascota mascota = new Mascota("Pepe", 10, "marron");
        Perros perros = new Perros("Milo", 5, "negro", 20, true);
        Gatos gatos = new Gatos("Melon", 3, "blanco", 10, 40);
        PerrosGrandes perrosGrandes = new PerrosGrandes("Covi", 4, "gris", 50, true, razas.PASTORALEMAN);
        PerrosMedianos perrosMedianos = new PerrosMedianos("Leo", 01, "marron", 25, false, null);
        PerrosPequeños perrosPequeños = new PerrosPequeños(null, 0, null, 0, false, null);
        GatosPeloCorto gatosPeloCorto = new GatosPeloCorto(null, 0, null, 0, 0, null);
        GatosPeloLargo gatosPeloLargo = new GatosPeloLargo(null, 0, null, 0, 0, null);
        GatosSinPelo gatosSinPelo = new GatosSinPelo(null, 0, null, 0, 0, null);

        tiendaMascotas.add(mascota);
        tiendaMascotas.add(perros);
        tiendaMascotas.add(gatos);
        tiendaMascotas.add(perrosGrandes);
        tiendaMascotas.add(perrosMedianos);
        tiendaMascotas.add(perrosPequeños);
        tiendaMascotas.add(gatosPeloCorto);
        tiendaMascotas.add(gatosPeloLargo);
        tiendaMascotas.add(gatosSinPelo);

        for (Mascota mascota2 : tiendaMascotas) {
            System.out.println(mascota2);
        }
        


        
    }
    
}
