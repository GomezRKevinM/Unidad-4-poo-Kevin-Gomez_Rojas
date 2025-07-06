package Taller16.Ejemplos;

public class ProcesadorPago {
    // volviendo al uso correcto de OCP
    public void realizarPago(Pago metodoPago, double monto) {
        metodoPago.procesarPago(monto);
    }
}
