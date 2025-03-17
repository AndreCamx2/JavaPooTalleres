package TallerPoo8;

public class Dispositivo {
    protected String marca;
    protected String modelo;

    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void encender() {
        System.out.println("El dispositivo está encendiéndose...");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}
