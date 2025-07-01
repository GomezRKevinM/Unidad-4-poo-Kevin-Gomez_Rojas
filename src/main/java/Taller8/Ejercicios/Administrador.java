package Taller8.Ejercicios;

public class Administrador extends Gerente{
    private String codigoAdministrador;

    public Administrador(String nombre, double salario, String departamento, String codigoAdministrador) {
        super(nombre,salario,departamento);
        this.codigoAdministrador = codigoAdministrador;
    }

    public double getSalario() {
        return this.salario;
    }
    /**
     * No se puede acceder al salario desde la clase Administrador porque salario es un atributo privado de la clase Empleado.
     */
}
