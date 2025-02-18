package TallerPoo3;

public class P_Persona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Apelapato77", 21);

        System.out.println("Edad: " + persona1.edad);

        System.out.println("Nombre: " + persona1.getNombre());
        persona1.setNombre("Alaveirnho");
        System.out.println("Nuevo nombre: " + persona1.getNombre());

        persona1.mostrarInfo();
    }

}