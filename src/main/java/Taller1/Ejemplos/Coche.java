package Taller1.Ejemplos;

public class Coche {
    String marca;
    String modelo;
    // Constructor por defecto
    public Coche() {
        this.marca = "Desconocida";
    }
    // Constructor parametrizado
    public Coche(String marca) {
        this.marca = marca;
    }
    // Constructor sobrecargado con dos parámetros
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}
