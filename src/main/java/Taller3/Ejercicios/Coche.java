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

    public  void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
