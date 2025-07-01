package Taller15.Ejercicios;

import java.util.ArrayList;

public class LibroService implements Services {
    @Override
    public void agregar(Libro libro) {
        InsertarDatos.insertarLibro(libro);
    }

    @Override
    public void eliminar(String id) {
       EliminarDatos.eliminarLibro(id);
    }

    @Override
    public void actualizar(Libro libro) {
        UpdateDatos.updateLibro(libro);
    }

    @Override
    public Libro consultar(String isbn) {
        return ConsultarDatos.libro(isbn);
    }

    @Override
    public ArrayList<Libro> consultarTodos() {
        return ConsultarDatos.libros();
    }
}
