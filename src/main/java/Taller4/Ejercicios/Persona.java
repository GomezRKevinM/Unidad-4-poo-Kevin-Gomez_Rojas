package Taller4.Ejercicios;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        } else if (nombre.equals(this.nombre)) {
            throw new IllegalArgumentException("El nombre no puede ser el mismo que el actual.");
        }
        this.nombre = nombre;
    }
}
