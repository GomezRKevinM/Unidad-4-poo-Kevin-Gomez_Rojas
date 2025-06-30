package Taller2.Ejercicios;

public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante(){
        this("Desconocido", 0);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del estudiante: " + this.nombre);
        System.out.println("Edad del estudiante: " + this.edad);
    }
}
