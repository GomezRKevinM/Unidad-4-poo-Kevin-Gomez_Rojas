package Taller16.Ejercicios;

public class DocumentoExcel extends Documento{
    // Esta clase representa el documento que se exporta en formato Excel.
    @Override
    public Documento exportarDocumento() {
        System.out.println("Exportando documento Excel");
        return new DocumentoExcel();
    }
}
