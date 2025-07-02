package Taller11.Ejercicios;

public abstract class Abstracta {
    private String informacion;

    public Abstracta(String informacion) {
        if (informacion == null || informacion.isEmpty()) {
            throw new IllegalArgumentException("La información no puede ser nula o vacía.");
        }
        this.informacion = informacion;
    }
}
