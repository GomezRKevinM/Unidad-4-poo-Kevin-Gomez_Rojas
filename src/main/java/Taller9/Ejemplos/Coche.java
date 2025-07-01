package Taller9.Ejemplos;

public class Coche extends Vehiculo{
    private int numeroPuertas;

    public Coche(String marca, int numeroPuertas) {
        super(marca); // Llama al constructor de la clase base
        this.numeroPuertas = numeroPuertas;
    }
}
