package Taller11.Ejercicios;

public class Vendedor extends Empleado{
    double comision;

    @Override
    public double calcularSalario() {
        mostrarDetalles();
        return (super.getSalarioBase() + comision) - super.getPrestaciones();
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Comisión: " + comision);
    }
}
