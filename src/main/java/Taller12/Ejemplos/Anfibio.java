package Taller12.Ejemplos;


public class Anfibio implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El anfibio está volando.");
    }

    @Override
    public void nadar() {
        System.out.println("El anfibio está nadando.");
    }
}

