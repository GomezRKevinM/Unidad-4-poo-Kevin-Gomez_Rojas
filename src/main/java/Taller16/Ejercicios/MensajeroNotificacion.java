package Taller16.Ejercicios;

public class MensajeroNotificacion extends Mensajero {
    private String appName;
    private String appId;
    private String userId;
    private String userToken;
    private String notificationMessage;

    @Override
    public String enviarMensaje(String mensaje) {
        System.out.println("Enviando notificación desde la app " + appName );
        System.out.println("App ID: " + appId + ", User ID: " + userId + ", User Token: " + userToken);
        System.out.println("Enviado: " + mensaje);
        return mensaje;
    }
}
