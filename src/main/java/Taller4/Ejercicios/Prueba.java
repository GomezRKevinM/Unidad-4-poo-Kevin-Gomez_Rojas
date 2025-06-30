package Taller4.Ejercicios;

public class Prueba {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        System.out.println(persona.nombre); // java: nombre has private access in Taller4.Ejercicios.Persona
        /*
            * Esto no compilará porque 'nombre' es privado en la clase Persona.
            * Para acceder a 'nombre', se debe usar un método público, como un getter.
            * Al no implementar un getter en la clase Persona, no se puede acceder directamente al atributo 'nombre'.
            * Al no implementar un setter en la clase Persona, no se puede modificar directamente el atributo 'nombre'.
            * Si se desea acceder o modificar el atributo 'nombre', se debe implementar un método público en la clase Persona
            * o hacer publicos los atributos, lo cual no es una buena práctica de encapsulamiento.
         */
        /*
    }
}
