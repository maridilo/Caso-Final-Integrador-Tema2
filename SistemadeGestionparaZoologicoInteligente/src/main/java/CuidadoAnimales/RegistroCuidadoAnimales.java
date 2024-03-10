package CuidadoAnimales;

    public class RegistroCuidadoAnimales {
        public void registrarAlimentacion(Animal animal, String tipoAlimento, int cantidad) {
            System.out.println("Registrando alimentación para " + animal.getNombre() + ":");
            System.out.println("Tipo de alimento: " + tipoAlimento);
            System.out.println("Cantidad: " + cantidad);
        }
    }

