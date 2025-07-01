package Taller12.Ejemplos;

public class Robot implements Caminador,Hablador{
    @Override
    public void caminar() {
        System.out.println("El robot está caminando.");
    }
    @Override
    public void hablar() {
        System.out.println("El robot está hablando.");
    }
}
