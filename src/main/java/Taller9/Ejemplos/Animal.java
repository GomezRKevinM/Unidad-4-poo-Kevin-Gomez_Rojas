package Taller9.Ejemplos;

public class Animal {
    protected String especie;
    public Animal(String especie) {
        this.especie = especie;
    }
    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}
