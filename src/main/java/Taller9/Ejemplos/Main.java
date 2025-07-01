package Taller9.Ejemplos;

public class Main {
    public static void main(String[] args) {
        // Error: No se puede usar `super` aquí porque Main no es una clase derivada de Planta
        super.tipo = "Orquídea"; // Error de compilación
    }
}
