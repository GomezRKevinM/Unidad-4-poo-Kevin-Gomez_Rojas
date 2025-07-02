package Taller12.Ejemplos;

// Corrigiendo uso incorrecto de la interfaz Volador
public class Avion implements Volador {
    @Override
    public void volar() {
        System.out.println("El avión está volando.");
    }
}
