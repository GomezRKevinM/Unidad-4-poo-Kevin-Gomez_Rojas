package Taller12.Ejemplos;

public interface Volador {
    default void despegar() {
        System.out.println("Volador despega.");
    }
}
