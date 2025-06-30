package Taller3.Ejemplos;

public class Persona {
    private String nombre;
    public static void mostrarNombre() {
        System.out.println("Nombre: " + nombre); // Error de compilación: No se puede acceder a 'nombre' desde un contexto estático
    }
}
