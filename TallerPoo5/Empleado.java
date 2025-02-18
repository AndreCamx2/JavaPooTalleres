package TallerPoo5;

public class Empleado {
    protected String nombre;
    protected double salario;

    public void mostrarInfo() {
        System.out.println("Empleado:");
        System.out.println("Andrew");
        System.out.println("8800000");
    }
}

class Gerente extends Empleado {
    String departamento;

    @Override
    public void mostrarInfo() {
        System.out.println("Gerente: ");
        System.out.println("Pipe ");
        System.out.println("9900000");
        System.out.println("Manager");
    }
}

class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        Gerente g1 = new Gerente();
        e1.mostrarInfo();
        g1.mostrarInfo();
    }
}