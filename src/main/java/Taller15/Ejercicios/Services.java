package Taller15.Ejercicios;

import java.util.ArrayList;

public interface Services {
    void agregar(Libro libro);
    void eliminar(String id);
    void actualizar(Libro libro);
    Object consultar(String id);
    ArrayList<Libro> consultarTodos();
}
