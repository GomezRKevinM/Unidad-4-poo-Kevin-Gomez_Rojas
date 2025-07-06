package Taller16.Ejemplos;

public class NotificacionEmail extends Notificacion{
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
    }
}
