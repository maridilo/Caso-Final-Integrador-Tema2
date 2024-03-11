import AdministracionRecursos.GestionRecursos;
import AdministracionRecursos.Recursos;
import CuidadoAnimales.Animal;
import CuidadoAnimales.Ave;
import CuidadoAnimales.Mamifero;
import CuidadoAnimales.RegistroCuidadoAnimales;
import InteraccionVisitantes.QuioscoInteractivo;
import MantenimientoySeguridad.Mantenimiento;
import MantenimientoySeguridad.ProgramadorMantenimiento;
import MantenimientoySeguridad.SistemaSeguridad;

public class Main {
        public static void main(String[] args) {

            // Agregar algunos alimentos al inventario
            GestionRecursos gestionRecursos = new GestionRecursos();
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

            // Crear instancias de los diferentes módulos
            gestionRecursos = new GestionRecursos();
            RegistroCuidadoAnimales registroCuidadoAnimales = new RegistroCuidadoAnimales();
            QuioscoInteractivo quioscoInteractivo = new QuioscoInteractivo();

            // Agregar recursos al inventario
            gestionRecursos.agregarAlimento(new Recursos.Alimento("Carne", 100));
            gestionRecursos.agregarAlimento(new Recursos.Alimento("Frutas", 200));
            gestionRecursos.agregarMedicina(new Recursos.Medicina("Antibiótico", 50));
            gestionRecursos.agregarMedicina(new Recursos.Medicina("Vitaminas", 30));
            gestionRecursos.agregarEquipamiento(new Recursos.Equipamiento("Jaulas", 20));
            gestionRecursos.agregarEquipamiento(new Recursos.Equipamiento("Redes", 10));

            // Programar tareas de mantenimiento
            programadorMantenimiento.programarMantenimiento(new Mantenimiento("Revisión de vallas", true));
            programadorMantenimiento.programarMantenimiento(new Mantenimiento("Podado de áreas verdes", false));

            // Monitorear accesos y movimientos
            sistemaSeguridad.monitorearAccesos();
            sistemaSeguridad.monitorearMovimientos();

            // Registrar alimentación de animales
            Animal leon = new Mamifero("León", 5, true);
            registroCuidadoAnimales.registrarAlimentacion(leon, "Carne", 5);
            Animal aguila = new Ave("Águila", 3, 2);
            registroCuidadoAnimales.registrarAlimentacion(aguila, "Pescado", 3);

            // Mostrar información en el quiosco interactivo
            quioscoInteractivo.mostrarInformacionAnimal(leon);
            quioscoInteractivo.mostrarInformacionAnimal(aguila);

            System.out.println("\nRegistro de cuidado de animales:");
            registroCuidadoAnimales.mostrarRegistro();

            System.out.println("\nTareas de mantenimiento programadas:");
            programadorMantenimiento.mostrarTareasProgramadas();

            System.out.println("\nEventos de seguridad:");
            sistemaSeguridad.mostrarEventos();

            System.out.println("\nEstadísticas del zoológico:");
            mostrarEstadisticasZoo();
        }

    private static void mostrarEstadisticasZoo() {
        System.out.println("Número de animales: 10");
        System.out.println("Número de especies: 5");
        System.out.println("Número de cuidadores: 8");
        System.out.println("Número de visitantes: 100");
    }
}



