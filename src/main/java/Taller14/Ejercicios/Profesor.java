package Taller14.Ejercicios;

public class Profesor extends Persona{
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un profesor.");
    }

    @Override
    public void dormir() {
        super.dormir();
    }

    /**
     * El metodo dormir() realmente no es necesario sobreescribirlo aquí,
     * ya que esta usando exactamente la implementación de la clase Persona.
     * esto esta mal porque no se esta aprovechando el polimorfismo.
     * Por lo tanto, se puede eliminar este método
     */
}
