package Taller11.Ejercicios;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        mostrarArea();
        return Math.PI * radio * radio;
    }

    @Override
    public void mostrarArea() {
        System.out.println("El área del círculo es: " + calcularArea());
    }

}
