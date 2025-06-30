package Taller7.Ejercicios;

public class Prueba {
    public static void main(String[] args) {
        Utilidades utilidades = new Utilidades();

        int suma = utilidades.sumar(5, 3);
        int resta = utilidades.restar(5, 3);
        int multiplicacion = utilidades.multiplicar(5, 3);
        int division = utilidades.dividir(6, 3);

        System.out.println("Suma: " + suma); // 8
        System.out.println("Resta: " + resta); // 2
        System.out.println("Multiplicación: " + multiplicacion); // 15
        System.out.println("División: " + division); // 2
    }
}
