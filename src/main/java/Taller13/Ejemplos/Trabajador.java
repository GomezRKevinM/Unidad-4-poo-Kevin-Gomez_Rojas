package Taller13.Ejemplos;

public interface Trabajador {
    void trabajar(); // Método abstracto
    default void tomarDescanso() {
        System.out.println("Tomando un descanso.");
    }
}
