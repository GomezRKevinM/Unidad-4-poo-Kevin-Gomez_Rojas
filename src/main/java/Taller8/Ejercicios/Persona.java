package Taller8.Ejercicios;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        } else if (edad == this.edad) {
            throw new IllegalArgumentException("La edad no puede ser la misma que la actual.");
        }
        this.edad = edad;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

}
