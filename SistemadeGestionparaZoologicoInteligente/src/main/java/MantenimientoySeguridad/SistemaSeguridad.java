package MantenimientoySeguridad;

public class SistemaSeguridad {
    public void monitorearAccesos() {
        System.out.println("Monitoreando accesos...");

        // Simulación de monitoreo de accesos
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Monitoreo de accesos completado.");
    }

    public void monitorearCamaras() {
        System.out.println("Monitoreando cámaras...");

        // Simulación de monitoreo de cámaras
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Monitoreo de cámaras completado.");
    }

    public void monitorearSensores() {
        System.out.println("Monitoreando sensores...");

        // Simulación de monitoreo de sensores
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Monitoreo de sensores completado.");
    }

    public void monitorearMovimientos() {
        System.out.println("Monitoreando movimientos...");

        // Simulación de monitoreo de movimientos
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Monitoreo de movimientos completado.");
    }
}
