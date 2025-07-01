package Taller8.Ejercicios;

public class Prueba {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 3000);
        Gerente gerente = new Gerente("Ana", 5000, "Recursos Humanos");

        // Mostrar detalles del empleado
        System.out.println("Detalles del Empleado:");
        empleado.mostrarDetalles();
        System.out.println("\n-------------------------\n");
        // Mostrar detalles del gerente
        System.out.println("Detalles del Gerente:");
        gerente.mostrarDetalles();
        System.out.println("\n-------------------------\n");
        System.out.println("Nombre del gerente: " + gerente.getNombre());
    }
}
