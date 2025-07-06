package Taller16.Ejercicios;

public class DescuentoFijo extends Descuento {
    private double descuentoFijo = 10;
    public String nombreDescuento = "Descuento 10%";

    // En este caso el descuento es un porcentaje fijo del 10%
    @Override
    public double calcularDescuento(double monto) {
        double descuento = descuentoFijo / 100;
        return monto * descuentoFijo ;
    }
}
