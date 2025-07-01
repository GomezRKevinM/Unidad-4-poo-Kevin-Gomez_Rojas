package Taller14.Ejercicios;

public class Estudiante extends Persona{
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante.");
    }

    public void estudiar() {
        System.out.println("El estudiante está estudiando.");
    }
}
