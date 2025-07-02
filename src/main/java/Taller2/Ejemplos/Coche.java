package Taller2.Ejemplos;

public class Coche {
    private String marca;
    private int velocidadMaxima;
    public Coche() {
        this("Desconocida", 0); // Llama al constructor de dos parámetros
    }
    public Coche(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }
    public void mostrarInformacion() {
        System.out.println("Marca: " + this.marca + ", Velocidad máxima: " + this.velocidadMaxima);
    }
}