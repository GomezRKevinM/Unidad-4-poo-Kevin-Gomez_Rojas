package Taller9.Ejercicios;

public class Pez extends Animal{
    private String tipoAgua;

    public Pez(String especie, String tipoAgua) {
        super(especie);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie();
    }
}
