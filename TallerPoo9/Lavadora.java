package TallerPoo9;

public class Lavadora extends Electrodomestico {
    private int capacidad;

    public Lavadora(String marca, double potencia, int capacidad) {
        super(marca, potencia);
        this.capacidad = capacidad;
    }

    @Override
    public void encender() {
        super.encender();
        System.out.println("La lavadora con capacidad de " + capacidad + "kg está lista para lavar.");
    }

    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Capacidad: " + capacidad + "kg");
    }
}

