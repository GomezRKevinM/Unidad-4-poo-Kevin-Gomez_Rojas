package Taller14.Ejemplos;

public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        miAnimal.hacerSonido(); // Muestra: El perro ladra.
        miAnimal = new Gato();
        miAnimal.hacerSonido(); // Muestra: El gato maúlla.
    }
}
