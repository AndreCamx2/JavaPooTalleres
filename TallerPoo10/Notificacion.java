package TallerPoo10;

public class Notificacion {
    protected String mensaje;

    public Notificacion(String mensaje) {
        this.mensaje = mensaje;
    }

    public void enviar() {
        System.out.println("Enviando notificación: " + mensaje);
    }
}

