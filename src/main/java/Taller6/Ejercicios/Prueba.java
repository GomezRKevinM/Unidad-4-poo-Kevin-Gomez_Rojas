package Taller6.Ejercicios;

public class Prueba {
    public static void main(String[] args) {
        Moto moto = new Moto( "Yamaha", "600cc");
        System.out.println("Tipo: " + moto.tipo);
        moto.tipo = "Deportiva";
        moto.marca = "BMW";
        System.out.println(moto.toString());

        /**
         * Se puede acceder a los atributos de la clase Moto porque son protegidos,
         * lo que permite que las clases hijas y las clases del mismo paquete puedan acceder a ellos.
         */
    }
}
