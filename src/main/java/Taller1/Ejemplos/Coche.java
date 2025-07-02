package Taller1.Ejemplos;

public class Coche extends Vehiculo {
    String marca;
    // Llama al constructor de la clase base usando `super()`
    public Coche(String tipo, String marca) {
        super(tipo);
        this.marca = marca;
    }
}
