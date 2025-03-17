package TallerPoo10;

public class SMS extends Notificacion {
    private String numeroTelefono;

    public SMS(String mensaje, String numeroTelefono) {
        super(mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS a " + numeroTelefono + ": " + mensaje);
    }
}
