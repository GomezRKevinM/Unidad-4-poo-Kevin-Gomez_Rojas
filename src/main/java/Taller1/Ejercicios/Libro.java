package Taller1.Ejercicios;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(){
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro \n" +
                "titulo: " + titulo + '\n' +
                "autor: " + autor + '\n' +
                "numeroPaginas: " + numeroPaginas;
    }
}
