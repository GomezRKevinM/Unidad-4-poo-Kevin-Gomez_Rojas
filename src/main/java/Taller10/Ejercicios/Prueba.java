package Taller10.Ejercicios;

public class Prueba {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Estudiante estudiante = new Estudiante();
        Profesor profesor = new Profesor();

        persona.presentarse(); // Salida: Hola, soy una persona.
        estudiante.presentarse(); // Salida: Hola, soy un estudiante.
        profesor.presentarse(); // Salida: Hola, soy un profesor.
    }
}
