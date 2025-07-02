package Taller13.Ejercicios;

public class Persona implements Nadador {
    private String nombre;
    private int edad;
    private String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }
}
