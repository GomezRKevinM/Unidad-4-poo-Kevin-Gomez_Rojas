package Taller8.Ejercicios;

public class Coche extends Vehiculo{
    private int numeroPuertas;

    public Coche(String marca, double velocidadMaxima, int numeroPuertas) {
        super(marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}
