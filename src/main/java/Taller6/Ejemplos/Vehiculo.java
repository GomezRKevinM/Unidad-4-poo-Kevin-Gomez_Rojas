package Taller6.Ejemplos;

public class Vehiculo {
    protected String marca;
    protected double velocidad;
    public Vehiculo(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }
    protected void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Velocidad: " + velocidad + " km/h");
    }
}
