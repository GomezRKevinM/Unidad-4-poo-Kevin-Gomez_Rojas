package Taller8.Ejercicios;

public class Administrador extends Empleado,Gerente{
    private String codigoAdministrador;

    public Administrador(String nombre, double salario, String departamento, String codigoAdministrador) {
        super(nombre, salario);
        setDepartamento(departamento);
        this.codigoAdministrador = codigoAdministrador;
    }

    /*
      Error: Class cannot extend multiple classes in Java.
      Este error ocurre porque Java no permite que una clase extienda de más de una clase.
     */
}
