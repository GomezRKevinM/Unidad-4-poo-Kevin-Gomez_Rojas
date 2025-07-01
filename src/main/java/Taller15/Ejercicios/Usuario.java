package Taller15.Ejercicios;

public class Usuario {
    private String nombre;
    private String email;
    private String usuario;
    private String contrasena;
    private String token;

    public Usuario(String nombre, String email, String usuario, String contrasena) {
        this.nombre = nombre;
        this.email = email;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Boolean validarCredenciales(String usuario, String contrasena) {
        return this.usuario.equals(usuario) && this.contrasena.equals(contrasena);
    }

    public Boolean validarEmail(String email) {
        return this.email.equals(email);
    }

    public Boolean tokenAutenticacion(String token) {
        if(!this.usuario.equals(token)) {
            throw new IllegalArgumentException("Token de autenticación inválido");
        }
        return true;
    }
}
