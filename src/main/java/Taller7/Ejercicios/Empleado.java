package Taller7.Ejercicios;

public class Empleado {
    public String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo");
        } else if (salario == this.salario) {
            throw new IllegalArgumentException("El salario no puede ser igual al actual");
        }
        this.salario = salario;
    }
}
