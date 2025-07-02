package Taller4.Ejercicios;

public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        velocidadMaxima = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("La marca no puede ser nula o vacía.");
        } else if(marca.equals(this.marca)) {
            throw new IllegalArgumentException("La marca no puede ser la misma que la actual.");
        }

        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("El modelo no puede ser nulo o vacío.");
        }else if (modelo.equals(this.modelo)) {
            throw new IllegalArgumentException("El modelo no puede ser el mismo que el actual.");
        }
        this.modelo = modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        if(velocidadMaxima < 0) {
            throw new IllegalArgumentException("La velocidad máxima debe ser mayor a 0");
        } else if (velocidadMaxima == this.velocidadMaxima) {
            throw new IllegalArgumentException("El velocidad maxima no puede ser la misma que la actual.");
        }
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(double aceleracion) {
       if(aceleracion < 1) {
           throw new IllegalArgumentException("La aceleración debe ser mayor a 0");
       }
       velocidadMaxima += aceleracion;
    }
}
