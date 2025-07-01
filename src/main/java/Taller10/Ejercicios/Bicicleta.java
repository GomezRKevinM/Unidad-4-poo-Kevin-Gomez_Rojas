package Taller10.Ejercicios;

public class Bicicleta extends Vehiculo{
    @Override
    public void moverse(String tipoMovimiento) {
        System.out.println("La bicicleta se está moviendo de forma " + tipoMovimiento + ".");
    }

    /**
     * Este metodo sobrescribe el método moverse de la clase Vehiculo, pero no funciona porque la firma del método es diferente.
     */
}
