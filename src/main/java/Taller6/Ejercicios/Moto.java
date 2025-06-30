package Taller6.Ejercicios;

public class Moto extends Vehiculo{
    private String cilindrada;

    public Moto(String marca,String cilindrada){
        super("Moto", marca);
        this.cilindrada = cilindrada;
    }
}
