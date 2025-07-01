package Taller14.Ejemplos;

public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        miAnimal.correr(); // Error de compilación: El método correr() no existe en Animal
    }
}
