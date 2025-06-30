package Taller6.Ejemplos.paquete2;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
        System.out.println(p.nombre); // Error de compilación: nombre tiene acceso protegido
    }
}
