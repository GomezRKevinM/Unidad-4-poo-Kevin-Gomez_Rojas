package Taller11.Ejercicios;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        mostrarArea();
        return (base * altura) / 2;
    }

    @Override
    public void mostrarArea() {
        System.out.println("El área del triángulo es: " + calcularArea());
    }
}
