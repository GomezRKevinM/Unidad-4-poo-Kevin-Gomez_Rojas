package Taller13.Ejercicios;

public class Persona implements Nadador, Volador {
    private String nombre;
    private int edad;
    private String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    /**
     * Los metodos de las interfaces Nadador y Volador no han sido implementados
     * por lo que al instanciar la clase Persona y llamar a estos metodos no funcionaria
     * Este error se debe a que la clase Persona no ha implementado los metodos y genera un error de compilación.
     */
}
