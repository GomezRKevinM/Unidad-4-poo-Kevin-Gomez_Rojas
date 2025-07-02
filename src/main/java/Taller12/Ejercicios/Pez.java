package Taller12.Ejercicios;

public class Pez implements Respirador, Nadador {
    @Override
    public void respirar() {
        System.out.println("el pez está respirando.");
    }

    @Override
    public void nadar() {
        System.out.println("el pez está nadando.");
    }
}
