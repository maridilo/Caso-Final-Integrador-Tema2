package AdministracionRecursos;
import java.util.HashMap;
import java.util.Map;

    public class GestionRecursos {
        private Map<String, Recursos.Alimento> inventarioAlimentos;
        private Map<String, Recursos.Medicina> inventarioMedicinas;
        private Map<String, Recursos.Equipamiento> inventarioEquipamiento;

        public GestionRecursos() {
            this.inventarioAlimentos = new HashMap<>();
            this.inventarioMedicinas = new HashMap<>();
            this.inventarioEquipamiento = new HashMap<>();
        }

        public void agregarAlimento(Recursos.Alimento alimento) {
            inventarioAlimentos.put(alimento.getNombre(), alimento);
        }

        public void agregarMedicina(Recursos.Medicina medicina) {
            inventarioMedicinas.put(medicina.getNombre(), medicina);
        }

        public void agregarEquipamiento(Recursos.Equipamiento equipamiento) {
            inventarioEquipamiento.put(equipamiento.getNombre(), equipamiento);
        }
    }

