package Taller4.Ejemplos;

public class Vehiculo {
    private String marca;
    private double velocidad;
    public Vehiculo(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }
    public String getMarca() {
        return marca;
    }
    public double getVelocidad() {
        return velocidad;
    }
    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidad += incremento;
        }
    }
}
