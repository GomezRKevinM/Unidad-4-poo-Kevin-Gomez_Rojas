package Taller6.Ejemplos;

public class Vehiculo {
<<<<<<< HEAD
    protected String marca;
    protected double velocidad;
    public Vehiculo(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }
    protected void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Velocidad: " + velocidad + " km/h");
=======
    protected String tipo;
    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }
    protected void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
>>>>>>> 67152bc (feat: kevin manuel gomez rojas - Ejemplo 1 Taller 6)
    }
}
