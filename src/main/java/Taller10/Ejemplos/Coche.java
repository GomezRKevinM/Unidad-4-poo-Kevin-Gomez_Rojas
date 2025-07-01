package Taller10.Ejemplos;

public class Coche extends Vehiculo{
    // Error de compilación: Diferente firma del método
    @Override
    public void acelerar(int velocidad) {
        System.out.println("El coche acelera a " + velocidad + " km/h.");
    }
}
