package TallerPoo10;

public class Push extends Notificacion {
    private String dispositivoID;

    public Push(String mensaje, String dispositivoID) {
        super(mensaje);
        this.dispositivoID = dispositivoID;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificación push al dispositivo " + dispositivoID + ": " + mensaje);
    }
}
