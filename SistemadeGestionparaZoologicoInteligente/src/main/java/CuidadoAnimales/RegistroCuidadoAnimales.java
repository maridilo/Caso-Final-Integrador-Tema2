package CuidadoAnimales;

    public class RegistroCuidadoAnimales {
        public void registrarAlimentacion(Animal animal, String tipoAlimento, int cantidad) {
            System.out.println("Registrando alimentación para " + animal.getNombre() + ":");
            System.out.println("Tipo de alimento: " + tipoAlimento);
            System.out.println("Cantidad: " + cantidad);
        }

        public void mostrarRegistro() {
            System.out.println("Registro de alimentación:");
            System.out.println("Fecha: 01/01/2021");
            System.out.println("Hora: 08:00");
            System.out.println("Animal: León");
            System.out.println("Tipo de alimento: Carne");
            System.out.println("Cantidad: 2kg");
        }
    }

