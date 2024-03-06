package habitats;

public class HabitatTerrestre extends Habitats{
    private int temperatura;
    private int humedad;

    public HabitatTerrestre(String nombre, int capacidad, int temperatura, int humedad) {
        super(nombre, capacidad);
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

    // Métodos getter y setter específicos
    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }
}
