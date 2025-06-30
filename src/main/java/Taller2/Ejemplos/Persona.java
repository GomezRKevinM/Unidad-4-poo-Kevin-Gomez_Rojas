package Taller2.Ejemplos;

public class Persona {
    private String nombre;
    public static void mostrarNombre() {
        System.out.println(this.nombre); // Error de compilación: No se puede usar `this` en un contexto estático
    }
}
