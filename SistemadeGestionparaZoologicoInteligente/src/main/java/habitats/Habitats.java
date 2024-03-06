package habitats;

public class Habitats {
        private String nombre;
        private int capacidad;

        public Habitats(String nombre, int capacidad) {
            this.nombre = nombre;
            this.capacidad = capacidad;
        }

        // Métodos getter y setter
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getCapacidad() {
            return capacidad;
        }

        public void setCapacidad(int capacidad) {
            this.capacidad = capacidad;
        }
    }

