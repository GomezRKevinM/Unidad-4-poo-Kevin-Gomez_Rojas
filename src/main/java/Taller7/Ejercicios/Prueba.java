package Taller7.Ejercicios;

public class Prueba {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000.0, "Ahorros");
        cuenta.mostrarDetalles();
        System.out.println("Saldo actual: " + cuenta.getSaldo());
        cuenta.setSaldo(1500.0);
        System.out.println("Nuevo saldo: " + cuenta.getSaldo());

        cuenta.numeroCuenta = "987654321"; // Esto es posible porque numeroCuenta es privado
        /**
         * Si se intenta acceder directamente a numeroCuenta desde fuera de la clase,
         * se producirá un error de compilación, ya que es un campo privado.
         * output: java: numeroCuenta has private access in Taller7.Ejercicios.CuentaBancaria
         */
    }
}
