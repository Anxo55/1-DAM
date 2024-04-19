package CarreraCiclista;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private static double totalTiempo;
    private String pais;

    ArrayList<CIclista> listaCiclistas;
    
    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0;
        listaCiclistas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static double getTotalTiempo() {
        return totalTiempo;
    }

    public static void setTotatTiempo(double totalTiempo) {
        Equipo.totalTiempo = totalTiempo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    
    
}
