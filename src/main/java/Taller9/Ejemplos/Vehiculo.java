package Taller9.Ejemplos;

public class Vehiculo {
    protected String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
}
