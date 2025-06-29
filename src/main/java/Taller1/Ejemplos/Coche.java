package Taller1.Ejemplos;

public class Coche {
    String marca;
    String modelo;

    // Constructor con un parámetro
    public Coche(String marca) {
        this.marca = marca;
    }
    // Llamada al constructor anterior usando this()
    public Coche(String marca, String modelo) {
        this(marca); // Llama al constructor de un solo parámetro
        this.modelo = modelo;
    }

}
