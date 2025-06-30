package Taller8.Ejercicios;

public class Estudiante extends Persona{
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Matrícula: " + matricula);
    }
}
