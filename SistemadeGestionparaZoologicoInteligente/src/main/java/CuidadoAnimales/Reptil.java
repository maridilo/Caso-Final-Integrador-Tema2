package CuidadoAnimales;

    public class Reptil extends Animal {
        private boolean venenoso;

        public Reptil(String nombre, int edad, boolean venenoso) {
            super(nombre, edad);
            this.venenoso = venenoso;
        }

        // Métodos getter y setter específicos
        public boolean esVenenoso() {
            return venenoso;
        }

        public void setVenenoso(boolean venenoso) {
            this.venenoso = venenoso;
        }
    }

