package TallerPoo3;

class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    void mostrarInfo() {
        System.out.println("Articulo ");
        System.out.println("Nombre "+ nombre);
        System.out.println("Precio "+ precio);
        System.out.println("Stock: " + stock + " unidades");
    }
}
class PruebaProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto("iPhone z100", 999.99, 9);
        producto1.mostrarInfo();
    }
}