package TallerPoo2;

public class errores {
    private String nombre;


    public void setNombre(String nombre) {
        this.nombre = nombre;

        this.mostrarNombre();
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}