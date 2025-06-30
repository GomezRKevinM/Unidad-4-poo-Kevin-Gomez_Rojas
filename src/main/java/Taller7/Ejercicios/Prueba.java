package Taller7.Ejercicios;

public class Prueba {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Kevin", 100000.00);
        System.out.println("Nombre del empleado: " + empleado.nombre);
        empleado.nombre = "Juan";
        System.out.println("Nuevo nombre del empleado: " + empleado.nombre);
        empleado.setSalario(150000.00);
        System.out.println("Nuevo salario del empleado: " + empleado.getSalario());

        /**
         * Podemos ver que el atributo nombre es público y se puede acceder directamente,
         * pero el atributo salario es privado y solo se puede acceder a través de los métodos públicos getSalario() y setSalario().
         */
    }
}
