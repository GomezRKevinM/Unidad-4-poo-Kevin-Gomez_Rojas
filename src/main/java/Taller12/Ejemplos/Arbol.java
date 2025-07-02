package Taller12.Ejemplos;

// Clase incorrecta que implementa la interfaz pero no tiene lógica relacionada
public class Arbol implements Corredor {
    @Override
    public void correr() {
        // El árbol no tiene una lógica para correr, lo cual no tiene sentido
        System.out.println("Los árboles no pueden correr.");
    }
}