package Taller15.Ejercicios;

public class ticketProducto {
    private Producto producto;
    private int cantidad;
    private double total;

    public ticketProducto(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = calcularTotal();
    }

    private double calcularTotal() {
        return producto.getPrecio() * cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo");
        }else if (producto.equals(this.producto)) {
            throw new IllegalArgumentException("El producto no puede ser igual al anterior");
        }
        this.producto = producto;
        this.total = calcularTotal();
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
        this.total = calcularTotal();
    }

    public double getTotal() {
        return total;
    }

    public double calcularPrecioFinal() {
        return producto.getPrecio() - producto.getDescuento();
    }

    @Override
    public String toString() {
        return "TicketProducto " + producto.getNombre() +
                " cantidad: " + cantidad +
                " precio unitario: " + producto.getPrecio() +
                " descuento: " + producto.getDescuento() +
                " precio final: " + calcularPrecioFinal() +
                " total: " + total ;
    }
}
