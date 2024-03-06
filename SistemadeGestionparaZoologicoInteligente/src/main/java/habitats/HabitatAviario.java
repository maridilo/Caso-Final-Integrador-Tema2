package habitats;

public class HabitatAviario extends Habitats {
    private int alturaMaxima;

    public HabitatAviario(String nombre, int capacidad, int alturaMaxima) {
        super(nombre, capacidad);
        this.alturaMaxima = alturaMaxima;
    }

    // Métodos getter y setter específicos
    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }
}
