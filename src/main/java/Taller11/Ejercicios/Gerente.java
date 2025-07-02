package Taller11.Ejercicios;

public class Gerente extends Empleado{
    double bono;

    @Override
    public double calcularSalario() {
        mostrarDetalles();
        return (super.getSalarioBase() + bono) - super.getPrestaciones();
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Bono: " + bono);
    }
}
