package TallerPoo9;

public class Computadora extends Electrodomestico {
    private String procesador;

    public Computadora(String marca, double potencia, String procesador) {
        super(marca, potencia);
        this.procesador = procesador;
    }

    @Override
    public void encender() {
        super.encender(); 
        System.out.println("La computadora con procesador " + procesador + " está arrancando...");
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Procesador: " + procesador);
    }
}

