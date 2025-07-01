package Taller13.Ejemplos;

public class Persona implements Trabajador, Hablador {
    @Override
    public void trabajar() {
        System.out.println("Persona trabajando.");
    }
    @Override
    public void hablar() {
        System.out.println("Persona hablando.");
    }
}
