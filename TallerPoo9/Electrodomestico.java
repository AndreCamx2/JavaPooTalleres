package TallerPoo9;

public class Electrodomestico {
    protected String marca;
    protected double potencia;

    public Electrodomestico(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public void encender() {
        System.out.println("El electrodoméstico de marca " + marca + " está encendido.");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Potencia: " + potencia + "W");
    }
}

