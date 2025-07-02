package Taller8.Ejercicios;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if(departamento == null || departamento.isEmpty()) {
            throw new IllegalArgumentException("El departamento no puede ser nulo o vacío.");
        } else if (departamento.equals(this.departamento)) {
            throw new IllegalArgumentException("El departamento no puede ser el mismo que el actual.");
        }
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}
