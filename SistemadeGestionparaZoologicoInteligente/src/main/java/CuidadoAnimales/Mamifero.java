package CuidadoAnimales;

    public class Mamifero extends Animal {
        private boolean pelaje;

        public Mamifero(String nombre, int edad, boolean pelaje) {
            super(nombre, edad);
            this.pelaje = pelaje;
        }

        // Métodos getter y setter específicos
        public boolean tienePelaje() {
            return pelaje;
        }

        public void setPelaje(boolean pelaje) {
            this.pelaje = pelaje;
        }
    }

