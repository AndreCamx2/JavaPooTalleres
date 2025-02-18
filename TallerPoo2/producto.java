package TallerPoo2;

public class producto {
    String nombre;
    int precio;

    public producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Producto: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
    }

    public static void main(String[] args) {
        producto p = new producto("Moster White", 9500);
        p.mostrarProducto();
    }
}

