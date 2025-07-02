package Taller12.Ejercicios;

public class Ave implements Volador,Cantante{
    @Override
    public void volar() {
        System.out.println("El ave está volando.");
    }

    @Override
    public void cantar() {
        System.out.println("El ave está cantando.");
    }
}
