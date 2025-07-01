package Taller11.Ejercicios;

public abstract class Figura {
    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.println("El área de la figura es: " + calcularArea());
    }
}
