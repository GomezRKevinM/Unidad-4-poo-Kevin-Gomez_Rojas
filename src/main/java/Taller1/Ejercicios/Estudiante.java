package Taller1.Ejercicios;

public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante() {
        nombre = "Desconocido";
        edad = 0;
        curso = "No asignado";
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante \n" +
                "nombre: " + nombre + '\n' +
                "edad: " + edad + '\n' +
                "curso: " + curso;
    }
}
