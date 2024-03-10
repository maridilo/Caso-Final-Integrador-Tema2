package AdministracionRecursos;
import java.util.Collections;
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

        public Map<String, Recursos.Alimento> getInventarioAlimentos() {
            return Collections.unmodifiableMap(inventarioAlimentos);
        }

        public Map<String, Recursos.Medicina> getInventarioMedicinas() {
            return Collections.unmodifiableMap(inventarioMedicinas);
        }

        public Map<String, Recursos.Equipamiento> getInventarioEquipamiento() {
            return Collections.unmodifiableMap(inventarioEquipamiento);
        }
    }

