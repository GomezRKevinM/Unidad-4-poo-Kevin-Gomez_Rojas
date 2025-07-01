package Taller12.Ejemplos;

public interface Nadador {
    default void despegar() {
        System.out.println("Nadador despega.");
    }
}
