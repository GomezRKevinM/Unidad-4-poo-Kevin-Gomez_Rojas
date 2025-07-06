package Taller16.Ejemplos;

public class ProcesadorPago {
    public void realizarPago(String metodo, double monto) {
        if (metodo.equals("TarjetaCredito")) {
            System.out.println("Procesando pago con tarjeta de crédito: $" + monto);
        } else if (metodo.equals("PayPal")) {
            System.out.println("Procesando pago con PayPal: $" + monto);
        }
// Problema: Si se agrega otro método, hay que modificar este código.
    }
}
