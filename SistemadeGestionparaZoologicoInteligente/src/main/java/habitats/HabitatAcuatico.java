package habitats;
import java.util.ArrayList;

public class HabitatAcuatico extends Habitats {
    private int temperaturaAgua;
    private int nivelOxigeno;

    public HabitatAcuatico(String nombre, int capacidad, int temperaturaAgua, int nivelOxigeno) {
        super(nombre, capacidad);
        this.temperaturaAgua = temperaturaAgua;
        this.nivelOxigeno = nivelOxigeno;
    }

    // Métodos getter y setter específicos
    public int getTemperaturaAgua() {
        return temperaturaAgua;
    }

    public void setTemperaturaAgua(int temperaturaAgua) {
        this.temperaturaAgua = temperaturaAgua;
    }

    public int getNivelOxigeno() {
        return nivelOxigeno;
    }

    public void setNivelOxigeno(int nivelOxigeno) {
        this.nivelOxigeno = nivelOxigeno;
    }
}

