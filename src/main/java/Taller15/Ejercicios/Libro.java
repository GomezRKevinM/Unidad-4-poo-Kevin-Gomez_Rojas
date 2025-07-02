package Taller15.Ejercicios;

import java.sql.SQLException;
import java.sql.Timestamp;

import static java.lang.System.currentTimeMillis;

public class Libro {
    private String titulo;
    private String autor;
    private Timestamp anioPublicacion;
    private int numeroPaginas;
    private String genero;
    private String isbn;

    public Libro(){
        this.titulo = "No definido";
        this.autor = "No definido";
        this.anioPublicacion = new Timestamp(currentTimeMillis());
        this.numeroPaginas = 0;
        this.genero = "No definido";
        this.isbn = "No definido";
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = new Timestamp(currentTimeMillis());
        numeroPaginas = 0;
        genero = "No definido";
        isbn = "No definido";
    }
    public Libro(String titulo, String autor, Timestamp anioPublicacion, int numeroPaginas, String genero, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("El título no puede ser nulo o vacío");
        } else if (titulo.equals(this.titulo)) {
            throw new IllegalArgumentException("El título no puede ser igual al título actual");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor == null || autor.isEmpty()) {
            throw new IllegalArgumentException("El autor no puede ser nulo o vacío");
        } else if (autor.equals(this.autor)) {
            throw new IllegalArgumentException("El autor no puede ser igual al autor actual");
        }
        this.autor = autor;
    }

    public Timestamp getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Timestamp anioPublicacion) {
        if(anioPublicacion == null) {
            throw new IllegalArgumentException("El año de publicación no puede ser nulo");
        } else if (anioPublicacion == this.anioPublicacion) {
            throw new IllegalArgumentException("El año de publicación no puede ser igual al año actual");
        }
        this.anioPublicacion = anioPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if(numeroPaginas < 0) {
            throw new IllegalArgumentException("El número de páginas no puede ser negativo");
        } else if (numeroPaginas == this.numeroPaginas) {
            throw new IllegalArgumentException("El número de páginas no puede ser igual al número actual");
        } else if (numeroPaginas < 20) {
            throw new IllegalArgumentException("El número de páginas debe ser al menos de 20 paginas");
        }
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if(genero == null || genero.isEmpty()) {
            throw new IllegalArgumentException("El género no puede ser nulo o vacío");
        } else if (genero.equals(this.genero)) {
            throw new IllegalArgumentException("El género no puede ser igual al género actual");
        }
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if(isbn == null || isbn.isEmpty()) {
            throw new IllegalArgumentException("El ISBN no puede ser nulo o vacío");
        } else if (isbn.equals(this.isbn)) {
            throw new IllegalArgumentException("El ISBN no puede ser igual al ISBN actual");
        }
        this.isbn = isbn;
    }

    @Override
    public String toString() {

        return  " titulo: " + titulo + '\n' +
                " autor: " + autor + '\n' +
                " anioPublicacion: " + anioPublicacion + '\n' +
                " numeroPaginas: " + numeroPaginas + '\n' +
                " genero: " + genero + '\n' +
                " isbn: " + isbn ;
    }
}
