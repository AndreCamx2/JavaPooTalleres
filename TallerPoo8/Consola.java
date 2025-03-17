package TallerPoo8;

public class Consola extends Dispositivo {
    private boolean esPortatil;

    public Consola(String marca, String modelo, boolean esPortatil) {
        super(marca, modelo);
        this.esPortatil = esPortatil;
    }

    @Override
    public void encender() {
        System.out.println("La consola " + modelo + " está encendiéndose...");
    }

    public void jugar(String juego) {
        System.out.println("Jugando a " + juego + " en la consola " + modelo);
    }
}

