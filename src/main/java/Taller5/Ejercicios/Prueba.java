package Taller5.Ejercicios;

public class Prueba {
 public static void main(String[] args) {
     Persona persona = new Persona("Juan", 30);
        System.out.println("Nombre inicial: " + persona.getNombre());
     System.out.println("Edad: " + persona.edad);

    // Cambiar el nombre de la persona
     persona.setNombre("Kevin Gomez");

        System.out.println("Nombre cambiado: " + persona.getNombre());
        persona.edad = 23;
        System.out.println("Edad cambiada: " + persona.edad);

     /**
      * el atributo nombre es privado, por lo que no se puede acceder directamente desde aquí.
      * pero se puede acceder a través del método getNombre() y se puede modificar desde setNombre().
      * * El atributo edad es público, por lo que se puede acceder directamente desde aquí.
      * * El método setNombre() valida que el nuevo nombre no sea nulo, vacío o igual al actual.
      */
 }
}
