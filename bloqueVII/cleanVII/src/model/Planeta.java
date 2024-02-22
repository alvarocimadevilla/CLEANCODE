package es.daw.poo2.astros.model;

import java.util.ArrayList;

public class Planeta extends Astro {

    // Constantes públicas
    public static final double DIAMETRO_SOL = 1392684; // Diámetro del Sol en kilómetros

    // Variables privadas
    private double distSol;
    private ArrayList<Satelite> satelites;

    // Constructor
    public Planeta(String nombre, double radio, double rotEje, double masa, double tempMedia, double gravedad, double distSol) {
        super(nombre, radio, rotEje, masa, tempMedia, gravedad);
        this.distSol = distSol;
        this.satelites = new ArrayList<>();
    }

    // Funciones públicas

    // Añadimos un satélite
    public void addSatelite(Satelite s) {
        if (s != null) {
            satelites.add(s);
        }
    }

    // GETTERS Y SETTERS

    // Getters
    public double getDistSol() {
        return distSol;
    }

    // Setters
    public void setDistSol(double distSol) {
        this.distSol = distSol;
    }

    // Setters
    public void setSatelites(ArrayList<Satelite> satelites) {
        this.satelites = satelites;
    }

    // Funciones públicas

    // Sobrescribe el método toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n*** " + getClass().getSimpleName() + " " + super.getNombre() + " ***");
        sb.append(super.toString());
        sb.append("\ndistSol=").append(distSol);
        if (!satelites.isEmpty()) {
            sb.append("\n\tLista de satélites:");
            for (int i = 0; i < satelites.size(); i++) {
                if (satelites.get(i) != null) {
                    sb.append("\n\t- Satélite ").append(i + 1).append(": ").append(satelites.get(i).getNombre());
                }
            }
        } else {
            sb.append("\n\tNo tiene satélites");
        }
        return sb.toString();
    }

    // Funciones privadas

    // Método privado para calcular el número de distancia al Sol
    private double calcularNumeroDistanciaSoles() {
        return distSol / DIAMETRO_SOL;
    }
}
