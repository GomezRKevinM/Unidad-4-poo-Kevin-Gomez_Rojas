package Taller10.Ejercicios;

public class Bicicleta extends Vehiculo{

    public void moverse() {
        System.out.println("La bicicleta se está moviendo de forma .");
    }

    /**
     * Este metodo sobrescribe el método moverse de la clase Vehiculo, pero es una mala practica
     * porque no se está proporcionando una implementación más específica o útil que la de la clase base.
     * al no usar @Override, se puede confundir con un nuevo método en lugar de una sobrescritura.
     */
}
