package Taller8.Ejemplos;

public class Perro extends Animal{
    public Perro(String raza) {
        super("Canis lupus familiaris"); // Llama al constructor de la clase base Animal
        // super(especie); // Alternativamente, si se desea especificar una especie diferente
    // No se llama al constructor de la clase base
        System.out.println("Raza: " + raza);
    }
}
