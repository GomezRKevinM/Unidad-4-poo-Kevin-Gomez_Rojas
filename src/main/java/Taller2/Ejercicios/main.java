package Taller2.Ejercicios;

public class main {
    public static void main(String[] args) {
        // Crear un objeto Estudiante
        Estudiante estudiante = new Estudiante("Kevin Gómez", 20);
        estudiante.mostrarInformacion();
        estudiante.cambiarEdad( 21); // Cambiar la edad del estudiante

        // Crear un objeto Producto
        Producto producto = new Producto("Laptop", 1500000.00);
        producto.mostrarProducto();
        producto.cambiarPrecio( 1400000.00); // Cambiar el precio del producto
    }
}
