package Taller12.Ejemplos;

public interface Saludador {
    void saludar(); // Método abstracto
    default void decirAdios() {
        System.out.println("Adiós.");
    }
    static void mostrarMensaje() {
        System.out.println("Este es un mensaje estático de la interfaz.");
    }
}
