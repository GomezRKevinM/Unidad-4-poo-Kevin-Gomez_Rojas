package Taller4.Ejemplos;

public class CuentaBancaria {
    private double saldo; // Atributo privado para proteger el saldo
    public CuentaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto){
        if (monto > 0) {
            saldo += monto;
        }
    }
}
