package Taller16.Ejercicios;

public class DocumentoWord extends Documento {
    // Esta clase representa el documento que se exporta en formato Word.
    @Override
    public Documento exportarDocumento() {
        System.out.println("Exportando documento Word");
        return new DocumentoWord();
    }

}
