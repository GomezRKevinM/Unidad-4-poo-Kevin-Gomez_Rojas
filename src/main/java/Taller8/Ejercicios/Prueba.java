package Taller8.Ejercicios;

public class Prueba {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", 20, "123456");
        estudiante.mostrarDetalles();
        estudiante.setNombre("Pedro");
        System.out.println("\n----------------------------\n");
        System.out.println("Nuevos datos del estudiante:");
        System.out.println("\n----------------------------\n");
        estudiante.setEdad(21);
        estudiante.mostrarDetalles();
    }
}
