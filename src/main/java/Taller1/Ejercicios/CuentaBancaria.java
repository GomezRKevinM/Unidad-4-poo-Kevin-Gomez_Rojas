package Taller1.Ejercicios;

public class CuentaBancaria {
    String numeroCuenta;
    Long saldo;
    String tipoCuenta;

    public CuentaBancaria(){
        numeroCuenta = "00000000";
        saldo = 0L;
        tipoCuenta = "Ahorros";
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria (String numeroCuenta, Long saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

}
