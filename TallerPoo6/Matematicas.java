package TallerPoo6;

public class Matematicas {
    public static double Suma(int a, int b) {
        return a + b;
    }

    public static double Resta(int a, int b) {
        return a - b;
    }

    public static double Multiplicacion(int a, int b) {
        return a * b;
    }

    public static double Division(int a, int b) {
        return a / b;
    }
}

class Prueba8 {
    public static void main(String[] args) {
        System.out.println("Suma: " + Matematicas.Suma(10, 20));
        System.out.println("Resta: " + Matematicas.Resta(50, 15));
        System.out.println("Multiplicacion: " + Matematicas.Multiplicacion(8, 7));
        System.out.println("Division: " + Matematicas.Division(100, 5));
    }
}