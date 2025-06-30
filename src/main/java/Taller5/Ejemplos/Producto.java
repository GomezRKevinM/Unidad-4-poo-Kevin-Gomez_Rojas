package Taller5.Ejemplos;

public class Producto {
    String nombre; // Atributo de paquete (default)
    double precio; // Atributo de paquete (default)
    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Precio: " + precio);
    }
}
