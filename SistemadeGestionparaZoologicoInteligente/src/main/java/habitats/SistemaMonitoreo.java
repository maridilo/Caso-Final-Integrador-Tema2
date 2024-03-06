package habitats;

    public class SistemaMonitoreo {
        public void mostrarCondiciones(Habitats habitat) {
            System.out.println("Condiciones del hábitat " + habitat.getNombre() + ":");
            System.out.println("Capacidad: " + habitat.getCapacidad());
            if (habitat instanceof HabitatAcuatico) {
                HabitatAcuatico habitatAcuatico = (HabitatAcuatico) habitat;
                System.out.println("Temperatura del agua: " + habitatAcuatico.getTemperaturaAgua());
                System.out.println("Nivel de oxígeno: " + habitatAcuatico.getNivelOxigeno());
            } else if (habitat instanceof HabitatTerrestre) {
                HabitatTerrestre habitatTerrestre = (HabitatTerrestre) habitat;
                System.out.println("Temperatura: " + habitatTerrestre.getTemperatura());
                System.out.println("Humedad: " + habitatTerrestre.getHumedad());
            } else if (habitat instanceof HabitatAviario) {
                HabitatAviario habitatAviario = (HabitatAviario) habitat;
                System.out.println("Altura máxima: " + habitatAviario.getAlturaMaxima());
            }
        }
    }

