package Taller8.Ejercicios;

public class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        } else if (nombre.equals(this.nombre)) {
            throw new IllegalArgumentException("El nombre no puede ser el mismo que el actual.");
        }
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        } else if (salario == this.salario) {
            throw new IllegalArgumentException("El salario no puede ser el mismo que el actual.");
        }
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}
