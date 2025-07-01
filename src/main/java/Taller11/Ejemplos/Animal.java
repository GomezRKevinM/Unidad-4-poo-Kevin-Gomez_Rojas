package Taller11.Ejemplos;

public class Animal {
    protected String nombre;
    // Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    // Método abstracto (sin cuerpo)
    public abstract void hacerSonido();
    // Método concreto
    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}
