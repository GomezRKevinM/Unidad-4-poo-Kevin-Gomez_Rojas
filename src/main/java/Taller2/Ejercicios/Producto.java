package Taller2.Ejercicios;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + this.nombre);
        System.out.println("Precio del producto: " + this.precio);
    }
    public static void cambiarPrecio(Producto producto, double nuevoPrecio) {
        producto.precio = nuevoPrecio; // Cambia el precio del producto
    }

}
