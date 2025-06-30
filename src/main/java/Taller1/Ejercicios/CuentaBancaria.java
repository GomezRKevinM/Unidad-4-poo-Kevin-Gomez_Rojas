package Taller1.Ejercicios;

public class CuentaBancaria {
    private String numeroCuenta;
    private Long saldo;
    private String tipoCuenta;

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

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Long getSaldo() {
        return saldo;
    }

    public void setSaldo(Long saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria \n" +
                "numeroCuenta: " + numeroCuenta + '\n' +
                "saldo: $" + (saldo!=null?saldo:0) + '\n' +
                "tipoCuenta: " + tipoCuenta;
    }
}
