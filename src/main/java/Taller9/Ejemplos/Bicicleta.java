package Taller9.Ejemplos;

public class Bicicleta extends Vehiculo{
    public Bicicleta(String tipo) {
        super(tipo);
    }

    @Override
    public void mostrarTipo() {
        super.mostrarTipo(); // Uso innecesario si el método no está sobrescrito o modificado
        System.out.println("Este es un tipo de bicicleta.");
    }

}
