package Taller6.Ejercicios;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }


    public String mostrarInformacion() {
        return "Gerente\n" +
                " nombre: " + nombre + '\n' +
                " salario: $ " + salario + '\n' +
                " departamento: " + departamento;
    }
}
