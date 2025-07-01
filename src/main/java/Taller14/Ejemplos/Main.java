package Taller14.Ejemplos;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Gerente();
        Empleado empleado2 = new Ingeniero();
        empleado1.trabajar(); // Muestra: El gerente está gestionando el equipo.
        empleado2.trabajar(); // Muestra: El ingeniero está diseñando.
    }
}
