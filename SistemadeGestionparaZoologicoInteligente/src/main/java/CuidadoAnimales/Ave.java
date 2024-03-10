package CuidadoAnimales;

    public class Ave extends Animal {
        private int envergaduraAlas;

        public Ave(String nombre, int edad, int envergaduraAlas) {
            super(nombre, edad);
            this.envergaduraAlas = envergaduraAlas;
        }

        // Métodos getter y setter específicos
        public int getEnvergaduraAlas() {
            return envergaduraAlas;
        }

        public void setEnvergaduraAlas(int envergaduraAlas) {
            this.envergaduraAlas = envergaduraAlas;
        }
    }

