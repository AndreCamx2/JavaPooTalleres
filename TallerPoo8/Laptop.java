package TallerPoo8;

public class Laptop {
    private String marca;
    private String modelo;
    private String sistemaOperativo;

    public Laptop(String marca, String modelo, String sistemaOperativo) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
    }

    public void encender() {
        System.out.println("La laptop está encendiéndose con " + sistemaOperativo + "...");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}
