package Taller5.Ejercicios.A;

import Taller5.Ejercicios.Vehiculos.Moto;
import Taller5.Ejercicios.Vehiculos.Vehiculo;

public class Prueba {

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        v1.tipo = "Vehículo genérico";

        Moto moto1 = new Moto();
        moto1.tipo = "Moto deportiva";

        /**
         * No se puede acceder directamente a los atributos de la clase Vehiculo ni de la clase Moto
         * porque son privados.
         * al ser clases de diferentes paquetes, el acceso por default es privado
         * Por lo tanto, se debe utilizar métodos públicos para acceder a los atributos.
         * por ende esta clase no compila
         * output: java: tipo is not public in Taller5.Ejercicios.Vehiculos.Vehiculo; cannot be accessed from outside package
         */
    }
}
