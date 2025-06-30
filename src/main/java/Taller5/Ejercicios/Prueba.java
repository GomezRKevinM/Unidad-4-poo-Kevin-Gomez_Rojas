package Taller5.Ejercicios;

public class Prueba {
    public static void main(String[] args) {
        // Crear un objeto Producto
        Producto producto = new Producto("Laptop", 1500000.00, 10);
        producto.mostrarInfo();
        /**
         * * Aquí se crea un objeto Producto con nombre "Laptop", precio 1500.00 y stock 10.
         * * * Luego se llama al método mostrarInfo() para imprimir la información del producto.
         * * *
         */

        producto.nombre = "Laptop Gaming ASUS ROG";
        producto.precio = 2400000.00;
        producto.stock = 5;
        producto.mostrarInfo();
        /**
         * * Aquí se actualizan los atributos del objeto Producto.
         * * * Se cambia el nombre a "Laptop Gaming ASUS ROG", el precio a 2400000.00 y el stock a 5.
         * * * y se verifica que los miembros(atributos) del objeto son accesibles y modificables directamente,
         */
    }
}
