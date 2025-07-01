package Taller12.Ejercicios;

public class Incorrecto implements Respirador{
    @Override
    public void respirar() {
        System.out.println("El pez está respirando.");
    }

    /**
     * No tiene sentido implementar el metodo respirar en la clase Incorrecto,
     * ya que esta clase no representa ninguna clase que necesite respirar o usar los metodos de la interfaz Respirador.
     * Esto puede llevar a confusiones y errores en el diseño del programa.
     */
}
