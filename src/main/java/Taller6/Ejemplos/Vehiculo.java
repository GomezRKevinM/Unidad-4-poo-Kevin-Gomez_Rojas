package Taller6.Ejemplos;

public class Vehiculo {
    protected String tipo;
    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }
    protected void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
}
