package Taller3.Ejemplos;

public class main {
    public static void main(String[] args) {
        int resultado = Calculadora.sumar(5, 7); // Llama al método estático sin crear una instancia
        System.out.println("Resultado: " + resultado); // Muestra: Resultado: 12
    }
}
