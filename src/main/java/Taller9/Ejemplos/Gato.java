package Taller9.Ejemplos;

public class Gato extends Animal{
    private String color;
    public Gato(String especie, String color) {
        super(especie); // Llama al constructor de la clase base
        this.color = color;
    }
    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); // Llama al método de la clase base
        System.out.println("Color: " + color);
    }
}
