package MantenimientoySeguridad;

public class Mantenimiento {
    private String tarea;
    private boolean esUrgente;

    public Mantenimiento(String tarea, boolean esUrgente) {
        this.tarea = tarea;
        this.esUrgente = esUrgente;
    }

    public String getTarea() {
        return tarea;
    }
    public boolean isEsUrgente() {
        return esUrgente;
    }

    public void setEsUrgente(boolean esUrgente) {
        this.esUrgente = esUrgente;
    }
}
