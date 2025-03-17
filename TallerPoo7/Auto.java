public class Auto {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0;

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static void mostrarContador() {
        System.out.println("Número de coches creados: " + contadorCoches);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
