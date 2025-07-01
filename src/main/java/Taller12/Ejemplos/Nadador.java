package Taller12.Ejemplos;

public interface Nadador {
    void nadar(); // Método abstracto

    default void descansar() {
        System.out.println("El nadador está descansando.");
    }
}
