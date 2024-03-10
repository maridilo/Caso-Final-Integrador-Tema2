package AdministracionRecursos;

public class Recursos {
    public static class Alimento {
        private String nombre;
        private int cantidad;

        public Alimento(String nombre, int cantidad) {
            this.nombre = nombre;
            this.cantidad = cantidad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getCantidad() {
            return cantidad;
        }
    }

    public static class Medicina {
        private String nombre;
        private int cantidad;

        public Medicina(String nombre, int cantidad) {
            this.nombre = nombre;
            this.cantidad = cantidad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getCantidad() {
            return cantidad;
        }
    }

    public static class Equipamiento {
        private String nombre;
        private int cantidad;

        public Equipamiento(String nombre, int cantidad) {
            this.nombre = nombre;
            this.cantidad = cantidad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getCantidad() {
            return cantidad;
        }
    }
}
