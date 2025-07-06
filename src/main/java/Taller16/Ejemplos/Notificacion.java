package Taller16.Ejemplos;

public class Notificacion {
    public void enviar(String canal, String mensaje) {
        if (canal.equals("Email")) {
            System.out.println("Enviando email: " + mensaje);
        } else if (canal.equals("SMS")) {
            System.out.println("Enviando SMS: " + mensaje);
        }
// Problema: Si se agrega otro canal, hay que modificar este código.
    }
}
