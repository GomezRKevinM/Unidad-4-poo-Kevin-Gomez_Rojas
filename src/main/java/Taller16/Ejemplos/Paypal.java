package Taller16.Ejemplos;

public class Paypal extends Pago{
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal: $" + monto);
    }
}
