package Taller16.Ejemplos;

public class GestorNotificacion {
    public void notificar(Notificacion notificacion, String mensaje) {
        notificacion.enviar(mensaje);
    }
}
