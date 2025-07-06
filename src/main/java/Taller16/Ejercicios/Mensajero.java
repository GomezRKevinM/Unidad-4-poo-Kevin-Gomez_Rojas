package Taller16.Ejercicios;

public class Mensajero {
    String emailDestinatario;
    String emailRemitente;
    public String enviarMensaje(String mensaje, String destinatario) {
        System.out.println(emailRemitente +" Enviando mensaje a: " + destinatario);
        return mensaje;
    }
}
