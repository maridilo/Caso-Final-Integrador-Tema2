package MantenimientoySeguridad;
import java.util.ArrayList;
import java.util.List;

public class ProgramadorMantenimiento {
    private List<Mantenimiento> tareasPendientes;

    public ProgramadorMantenimiento() {
        this.tareasPendientes = new ArrayList<>();
    }

    public void programarMantenimiento(Mantenimiento mantenimiento) {
        tareasPendientes.add(mantenimiento);
    }

    public List<Mantenimiento> getTareasPendientes() {
        return tareasPendientes;
    }

    public void setTareasPendientes(List<Mantenimiento> tareasPendientes) {
        this.tareasPendientes = tareasPendientes;
    }

    public void eliminarTarea(Mantenimiento mantenimiento) {
        tareasPendientes.remove(mantenimiento);
    }

    public void eliminarTarea(int index) {
        tareasPendientes.remove(index);
    }

    public void eliminarTareasUrgentes() {
        tareasPendientes.removeIf(Mantenimiento::isEsUrgente);
    }

    public void eliminarTareasNoUrgentes() {
        tareasPendientes.removeIf(mantenimiento -> !mantenimiento.isEsUrgente());
    }

    public void eliminarTodasTareas() {
        tareasPendientes.clear();
    }

    public void mostrarTareasPendientes() {
        tareasPendientes.forEach(mantenimiento -> {
            System.out.println("Tarea: " + mantenimiento.getTarea() + ", Urgente: " + mantenimiento.isEsUrgente());
        });
    }

    public void mostrarTareasUrgentes() {
        tareasPendientes.stream()
                .filter(Mantenimiento::isEsUrgente)
                .forEach(mantenimiento -> {
                    System.out.println("Tarea: " + mantenimiento.getTarea() + ", Urgente: " + mantenimiento.isEsUrgente());
                });
    }

    public void mostrarTareasNoUrgentes() {
        tareasPendientes.stream()
                .filter(mantenimiento -> !mantenimiento.isEsUrgente())
                .forEach(mantenimiento -> {
                    System.out.println("Tarea: " + mantenimiento.getTarea() + ", Urgente: " + mantenimiento.isEsUrgente());
                });
    }

public void mostrarTareasPorIndice(int index) {
        System.out.println("Tarea: " + tareasPendientes.get(index).getTarea() + ", Urgente: " + tareasPendientes.get(index).isEsUrgente());
    }

    public void mostrarCantidadTareas() {
        System.out.println("Cantidad de tareas pendientes: " + tareasPendientes.size());
    }

    public void mostrarTareaPorIndice(int index) {
        System.out.println("Tarea: " + tareasPendientes.get(index).getTarea() + ", Urgente: " + tareasPendientes.get(index).isEsUrgente());
    }

    public void mostrarTareasPendientesPorIndice() {
        for (int i = 0; i < tareasPendientes.size(); i++) {
            System.out.println("Tarea: " + tareasPendientes.get(i).getTarea() + ", Urgente: " + tareasPendientes.get(i).isEsUrgente());
        }
    }

    public void mostrarTareasUrgentesPorIndice() {
        for (int i = 0; i < tareasPendientes.size(); i++) {
            if (tareasPendientes.get(i).isEsUrgente()) {
                System.out.println("Tarea: " + tareasPendientes.get(i).getTarea() + ", Urgente: " + tareasPendientes.get(i).isEsUrgente());
            }
        }
    }

    public void mostrarTareasNoUrgentesPorIndice() {
        for (int i = 0; i < tareasPendientes.size(); i++) {
            if (!tareasPendientes.get(i).isEsUrgente()) {
                System.out.println("Tarea: " + tareasPendientes.get(i).getTarea() + ", Urgente: " + tareasPendientes.get(i).isEsUrgente());
            }
        }
    }
}
