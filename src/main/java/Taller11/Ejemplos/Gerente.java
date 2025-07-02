package Taller11.Ejemplos;

public class Gerente extends Empleado {
    private double bono;
    public Gerente(String nombre, double bono) {
        super(nombre);
        this.bono = bono;
    }
    @Override
    public void calcularSalario() {
        System.out.println("El salario del gerente incluye un bono de: " + bono);
    }
}
