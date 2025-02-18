package TallerPoo4;

public class Carro {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Carro(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }
    /*
     * public double getVelocidadMaxima(){
     * return velocidadMaxima;
     * }
     */

    public void Acelerar(double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
        }
    }
}

class prueba6 {
    public static void main(String[] args) {
        Carro coche1 = new Carro("Toyota", "Supra", 220);

        // coche1.marca = "Kawasaki";
        // coche1.modelo = "Z100Rr";
        // coche1.velocidadMaxima = 200;

        // Intento de acelerar correctamente
        coche1.Acelerar(20);
    }
}