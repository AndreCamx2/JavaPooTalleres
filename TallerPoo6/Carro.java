package TallerPoo6;

public class Carro {
    String marca;
    String modelo;
    static int contadorCarros = 0;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCarros++;
    }

    public static int getContadorCarros() {
        return contadorCarros;
    }
}

class Prueba {
    public static void main(String[] args) {
        Carro c1 = new Carro("Chevrolet", "Cruze");
        Carro c2 = new Carro("Nissan", "Sentra");
        Carro c3 = new Carro("Volkswagen", "Jetta");
        Carro c4 = new Carro("Hyundai", "Elantra");
        Carro c5 = new Carro("Mazda", "Mazda3");


        System.out.println("Número total de carros   creados: " + Carro.getContadorCarros());
    }
}