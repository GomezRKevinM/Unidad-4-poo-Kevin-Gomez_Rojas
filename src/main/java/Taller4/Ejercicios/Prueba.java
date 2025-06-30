package Taller4.Ejercicios;

public class Prueba {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla");
        System.out.println("Coche creado: " + coche.getMarca() + " " + coche.getModelo());
        // No se puede acceder a los valores del coche directamente por lo que necesitamos usar los métodos de acceso
    }
}
