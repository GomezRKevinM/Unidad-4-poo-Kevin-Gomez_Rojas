package Taller5.Ejercicios;

public class Persona {
    private String nombre;
    int edad;

    public String getNombre() {
        return nombre;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        } else if (nombre.equals(this.nombre)) {
            throw new IllegalArgumentException("El nombre no puede ser igual al actual");
        }
        this.nombre = nombre;
    }
}
