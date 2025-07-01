package Taller15.Ejercicios;

public class Producto {
    private String nombre;
    private double precio;
    private double descuento;
    private double precioCompra;
    private int cantidad;

    public Producto() {
        this.nombre = "No definido";
        this.precio = 0.0;
        this.cantidad = 0;
    }

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        } else if (nombre.equals(this.nombre)) {
            throw new IllegalArgumentException("El nombre no puede ser igual al anterior");
        }
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        } else if(precio == this.precio) {
            throw new IllegalArgumentException("El precio no puede ser igual al anterior");

        }
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        } else if (cantidad == this.cantidad) {
            throw new IllegalArgumentException("La cantidad no puede ser igual a la anterior");
        }
        this.cantidad = cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        if(descuento < 0 || descuento > 1){
            throw new IllegalArgumentException("El descuento debe estar entre 0 y 1");
        } else if (descuento == this.descuento) {
            throw new IllegalArgumentException("El descuento no puede ser igual al anterior");
        }
        this.descuento = descuento;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        if (precioCompra < 0) {
            throw new IllegalArgumentException("El precio de compra no puede ser negativo");
        } else if (precioCompra == this.precioCompra) {
            throw new IllegalArgumentException("El precio de compra no puede ser igual al anterior");
        }
        this.precioCompra = precioCompra;
    }

    @Override
    public String toString() {
        return
                "nombre: " + nombre + '\n' +
                " precio: " + precio + '\n' +
                " cantidad: " + cantidad;
    }

    public double calcularPrecioFinal() {
        return precio - (precio * descuento);
    }

    public void calcularPrecioVenta(){
        precio = precioCompra + (precioCompra * 0.4);
    }

    public void calcularDescuento() {
        if (descuento < 0 || descuento > 1) {
            throw new IllegalArgumentException("El descuento debe estar entre 0 y 1");
        }
        precio = precio - (precio * descuento);
    }

    public String generarEtiqueta() {
        return "Producto: " + nombre + "\n" +
               "Precio: " + precio + "\n" +
               "Cantidad: " + cantidad + "\n" +
               "Descuento: " + descuento * 100 + "%\n" +
               "Precio Final: " + calcularPrecioFinal();
    }
}
