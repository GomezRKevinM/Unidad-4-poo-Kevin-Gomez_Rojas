package Taller4.Ejercicios;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }
        if(nombre.equals(this.nombre)) {
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
        }
        if(edad == this.edad) {
            throw new IllegalArgumentException("La edad no puede ser la misma que la actual.");
        }
        this.edad = edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if(notaPromedio < 0 ) {
            throw new IllegalArgumentException("La nota promedio debe ser mayor a 0");
        }
        if (notaPromedio == this.notaPromedio) {
            throw new IllegalArgumentException("La nota promedio no puede ser la misma que la actual.");
        }
        this.notaPromedio = notaPromedio;
    }

    @Override
    public String toString() {
        return "Estudiante \n" +
                " nombre: " + nombre + "\n" +
                " edad: " + edad + "\n" +
                " notaPromedio:" + notaPromedio;
    }
}
