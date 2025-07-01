package Taller9.Ejemplos;

public class Bicicleta extends Vehiculo{
    @Override
    public void mostrarTipo() {
        super.mostrarTipo(); // Uso innecesario si el método no está sobrescrito o modificado
        System.out.println("Este es un tipo de bicicleta.");
    }
}
