import AdministracionRecursos.GestionRecursos;
import AdministracionRecursos.Recursos;

public class Main {
        public static void main(String[] args) {
            GestionRecursos gestionRecursos = new GestionRecursos();
            gestionRecursos.agregarAlimento(new Recursos.Alimento("Carne", 100));
            gestionRecursos.agregarMedicina(new Recursos.Medicina("Vacuna", 50));
            gestionRecursos.agregarEquipamiento(new Recursos.Equipamiento("Jaula", 10));

        }
    }

