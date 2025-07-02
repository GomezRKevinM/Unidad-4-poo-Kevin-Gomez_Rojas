package Taller15.Ejemplos;

public class Empleado {
    private String nombre;
    private double salario;
    public double calcularSalarioMensual() {
        return salario * 12;
    }
    public void generarInforme() {
        System.out.println("Generando informe para: " + nombre);
    }
    public void guardarEnBaseDeDatos() {
        System.out.println("Guardando empleado en la base de datos...");
    }
}
