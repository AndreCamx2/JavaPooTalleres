package TallerPoo4;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}

class PruebaAcceso {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Andrew Watersson");

    }
}

// Clase sin métodos get y set
class Producto {
    private double precio;

    // Constructor
    public Producto(double precio) {
        this.precio = precio;
    }
}