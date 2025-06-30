package Taller3.Ejercicios;

public class Prueba {
    public static void main(String[] args) {
        int suma = Matematicas.sumar( 5, 7);
        int resta = Matematicas.restar(10, 3);
        int multiplicacion = Matematicas.multiplicar(4, 6);
        double division = Matematicas.dividir(20, 4);

        System.out.println("Suma: " + suma); // Muestra: Suma: 12
        System.out.println("Resta: " + resta); // Muestra: Resta: 7
        System.out.println("Multiplicación: " + multiplicacion); // Muestra: Multiplicación: 24
        System.out.println("División: " + division); // Muestra: División: 5.0
    }
}
