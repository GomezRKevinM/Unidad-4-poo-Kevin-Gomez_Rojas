package Taller16.Ejercicios;

public class MensajeroSMS extends Mensajero{
    private String numeroTelefono;
    private String proveedor;
    private String numeroDestino;

    @Override
    public String enviarMensaje(String mensaje) {
        System.out.println(numeroTelefono + " a través del proveedor " + proveedor);
        System.out.println("Enviando mensaje SMS a : " + numeroDestino);
        return mensaje;
    }
}
