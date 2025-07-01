package Taller9.Ejercicios;

public class Empleado extends Persona{
    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }

    public void mostrarEdad(){
        System.out.println("Edad del empleado: " + super.edad);
    }

    /**
     * El metodo mostrarEdad() no funciona correctamente porque la variable edad está definida como privada en la clase Persona.
     * Esto provoca que no se pueda acceder directamente a ella desde la clase Empleado.
     */
}
