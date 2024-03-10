import AdministracionRecursos.GestionRecursos;
import AdministracionRecursos.Recursos;
import MantenimientoySeguridad.Mantenimiento;
import MantenimientoySeguridad.ProgramadorMantenimiento;
import MantenimientoySeguridad.SistemaSeguridad;

public class Main {
        public static void main(String[] args) {
            GestionRecursos gestionRecursos = new GestionRecursos();

            // Agregar algunos alimentos al inventario
gestionRecursos.agregarAlimento(new Recursos.Alimento("Carne", 100));
gestionRecursos.agregarAlimento(new Recursos.Alimento("Frutas", 200));

// Agregar algunas medicinas al inventario
gestionRecursos.agregarMedicina(new Recursos.Medicina("Antibiótico", 50));
gestionRecursos.agregarMedicina(new Recursos.Medicina("Vitaminas", 30));

// Agregar algún equipamiento al inventario
gestionRecursos.agregarEquipamiento(new Recursos.Equipamiento("Jaulas", 20));
gestionRecursos.agregarEquipamiento(new Recursos.Equipamiento("Juguetes", 100));

// Mostrar el inventario de alimentos
System.out.println("Inventario de alimentos:");
gestionRecursos.getInventarioAlimentos().forEach((nombre, alimento) -> {
    System.out.println(nombre + ": " + alimento.getCantidad());
});

// Mostrar el inventario de medicinas
System.out.println("\nInventario de medicinas:");
gestionRecursos.getInventarioMedicinas().forEach((nombre, medicina) -> {
    System.out.println(nombre + ": " + medicina.getCantidad());
});

// Mostrar el inventario de equipamiento
System.out.println("\nInventario de equipamiento:");
gestionRecursos.getInventarioEquipamiento().forEach((nombre, equipamiento) -> {
    System.out.println(nombre + ": " + equipamiento.getCantidad());
});

// Programar tareas de mantenimiento
            ProgramadorMantenimiento programadorMantenimiento = new ProgramadorMantenimiento();
            SistemaSeguridad sistemaSeguridad = new SistemaSeguridad();

            // Programar tareas de mantenimiento
            programadorMantenimiento.programarMantenimiento(new Mantenimiento("Revisión de vallas", true));
            programadorMantenimiento.programarMantenimiento(new Mantenimiento("Podado de áreas verdes", false));

            // Monitorear accesos y movimientos
            sistemaSeguridad.monitorearAccesos();
            sistemaSeguridad.monitorearMovimientos();
        }
    }


