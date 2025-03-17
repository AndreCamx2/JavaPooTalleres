package TallerPoo8;

public class Telefono extends Dispositivo {
    private String sistemaOperativo;

    public Telefono(String marca, String modelo, String sistemaOperativo) {
        super(marca, modelo);
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void encender() {
        System.out.println("El teléfono está encendiéndose con " + sistemaOperativo + "...");
    }

    public void hacerLlamada(String numero) {
        System.out.println("Llamando al número " + numero + " desde un " + marca + " " + modelo);
    }
}
