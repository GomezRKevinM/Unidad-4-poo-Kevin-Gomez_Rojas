package Taller1.Ejercicios;

public class Estudiante {
    String nombre;
    int edad;
    String curso;

    public Estudiante() {
        nombre = "Desconocido";
        edad = 0;
        curso = "No asignado";
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }
}
