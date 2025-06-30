package Taller4.Ejemplos;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
        System.out.println(p.nombre); // Error de compilación: nombre tiene acceso privado
    }
}
