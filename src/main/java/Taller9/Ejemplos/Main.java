package Taller9.Ejemplos;

public class Main {
    public static void main(String[] args) {
        // Error: No se puede usar `super` aquí porque Main no es una clase derivada de ninguna otra clase.
        super.tipo = "Orquídea"; // Error de compilación
        /**
         * Error: java: non-static variable super cannot be referenced from a static context
         */
    }
}
