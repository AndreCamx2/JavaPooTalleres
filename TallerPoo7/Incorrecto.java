public class Incorrecto {
    private int valor = 10;

    public static void metodoIncorrecto() {
        // ERROR: No se puede acceder a un atributo no estático desde un método estático.
        // System.out.println(valor); // Descomentar esto causará un error de compilación.
    }
}
