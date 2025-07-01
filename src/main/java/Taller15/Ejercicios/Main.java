package Taller15.Ejercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LibroService libroService = new LibroService();
        ArrayList<Libro> libros = libroService.consultarTodos();

        for(Libro libro : libros) {
            System.out.println("----------------------");
            System.out.println(libro.toString());
            System.out.println("----------------------\n");
        }

    }
}
