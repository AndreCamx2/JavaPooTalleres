package TallerPoo10;

public class Correo extends Notificacion {
    private String email;

    public Correo(String mensaje, String email) {
        super(mensaje);
        this.email = email;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo a " + email + ": " + mensaje);
    }
}
