package Taller11.Ejercicios;

public abstract class Empleado {
    protected String nombre;
    private String dni;
    protected int edad;
    private double salarioBase;
    private double prestaciones;

    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Prestaciones: " + prestaciones);
        System.out.println("Salario Total: " + calcularSalario());
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            throw new IllegalArgumentException("El salario base no puede ser negativo.");
        } else if (salarioBase == this.salarioBase) {
            throw new IllegalArgumentException("El salario base no puede ser igual al anterior.");
        }
        this.salarioBase = salarioBase;
    }

    public double getPrestaciones() {
        return prestaciones;
    }

    public void setPrestaciones(double prestaciones) {
        if (prestaciones < 0) {
            throw new IllegalArgumentException("Las prestaciones no pueden ser negativas.");
        } else if (prestaciones == this.prestaciones) {
            throw new IllegalArgumentException("Las prestaciones no pueden ser iguales a las anteriores.");
        }
        this.prestaciones = prestaciones;
    }
}
