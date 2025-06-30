package Taller6.Ejercicios;

public class Banco {
    protected double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Establecer el saldo como protected no es una buena práctica.
     * Esto permite que cualquier subclase pueda modificar el saldo directamente, sin pasar por métodos de validación o control.
     * Esto puede llevar a inconsistencias en el estado del objeto y a problemas de seguridad, ya que el saldo podría ser modificado de manera inapropiada.
     * Por lo tanto, es recomendable mantener el saldo como `private` y proporcionar métodos públicos para acceder y modificar el saldo de manera controlada.
     */
}
