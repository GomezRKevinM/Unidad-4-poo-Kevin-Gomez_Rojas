package Taller13.Ejercicios;

public class Prueba {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 10);
        Triangulo triangulo = new Triangulo(10, 15);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}
