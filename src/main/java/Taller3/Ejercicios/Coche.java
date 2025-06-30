package Taller3.Ejercicios;

public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static void mostrarContadorCoches() {
        System.out.println("Número total de coches creados: " + contadorCoches);
    }

    public static void setModelo(String modelo) {
        // Este método no tiene sentido en el contexto de la clase Coche,
        // ya que no se puede establecer un modelo estático para todos los coches.
        // Cada coche debería tener su propio modelo.
        System.out.println("No se puede establecer un modelo estático para todos los coches.");
        this.modelo = modelo; // Error de compilación: 'this' no se puede usar en un contexto estático porq this hace referencia a una instancia específica de la clase y static es un metodo global.
    }
}
