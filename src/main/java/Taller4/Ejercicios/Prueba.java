package Taller4.Ejercicios;

public class Prueba {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Kevin Gómez", 20,4.5);
        System.out.println("Nombre del estudiante: " + estudiante.getNombre());

        estudiante.setEdad(23);
        System.out.println("Edad del estudiante: " + estudiante.getEdad());

        System.out.println("Datos del estudiante:");
        System.out.println(estudiante.toString());

    }
}
