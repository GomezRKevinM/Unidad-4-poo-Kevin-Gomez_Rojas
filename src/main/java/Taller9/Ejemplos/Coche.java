package Taller9.Ejemplos;

public class Coche extends Vehiculo{
    private int numeroPuertas;
    private String marca;

    public Coche(String marca, int numeroPuertas) {
        super("Coche");
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
    }
}
