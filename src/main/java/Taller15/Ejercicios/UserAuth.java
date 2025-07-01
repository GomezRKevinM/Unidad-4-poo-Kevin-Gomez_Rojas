package Taller15.Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class UserAuth {

    public static boolean isAdmin(String username, String password) { // este método verifica si el usuario es administrador
        if (username == null || password == null) {
            throw new IllegalArgumentException("El nombre de usuario y la contraseña no pueden ser nulos");
        }

        // Aquí se puede implementar la lógica para verificar si el usuario es administrador
        // Por ejemplo, comparando con un usuario administrador predefinido
        String[][] adminCredentials = {
            {"admin", "admin123"},
            {"superuser", "superpass"}
        };

        return Arrays.stream(adminCredentials).findAny().map(cred -> cred[0].equals(username) && cred[1].equals(password)).orElse(false);
    }

    public static Long authUser(String username, String password) { // este método autentica al usuario y devuelve su ID si es válido
        if (username == null || password == null) {
            throw new IllegalArgumentException("El nombre de usuario y la contraseña no pueden ser nulos");
        }

        boolean usernameSuccess = authUsername(username);
        boolean passwordValid = authPassword(password);

        if(!usernameSuccess){
            throw new IllegalArgumentException("Usuario incorrecto");
        }

        if(!passwordValid){
            throw new IllegalArgumentException("Contraseña incorrecta");
        }

        ArrayList<Usuario> usuarios = new ArrayList<>();
        boolean userSuccess = usuarios.stream().anyMatch(user -> user.getUsuario().equals(username) && user.getContrasena().equals(password));

        if( userSuccess ) {
            return usuarios.stream()
                    .filter(user -> user.getUsuario().equals(username) && user.getContrasena().equals(password))
                    .findFirst()
                    .map(Usuario::getId)
                    .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado"));
        } else {
            throw new IllegalArgumentException("Usuario o contraseña incorrectos");
        }
    }

    public static boolean starSession(String username, String password) { // este metodo inicia sesión y marca al usuario como en línea
        Long userId = authUser(username, password);
        if (userId != null) {

            Usuario user = new Usuario(username, "", username, password); // Simulación de la obtención del usuario por ID
            user.setIsOnline(true); // Simulación de marcar al usuario como en línea
            return true;
        }else{
            throw new IllegalArgumentException("No se pudo iniciar sesión, usuario no encontrado");
        }
    }

    public static boolean authUsername(String username) {
        boolean usernameValid = UserValidation.validateUsername(username);
        if (!usernameValid) {
            throw new IllegalArgumentException("El nombre de usuario no es válido");
        }else{
            ArrayList<Usuario> usuarios = new ArrayList<>(); // Simulación de una lista de usuarios para validar que el nombre de usuario existe
            return usuarios.stream().anyMatch(user -> user.getUsuario().equals(username));
        }
    }

    public static boolean authEmail(String email) {
        boolean emailValid = UserValidation.validateEmail(email);
        if (!emailValid) {
            throw new IllegalArgumentException("El correo electrónico no es válido");
        } else {
            ArrayList<Usuario> usuarios = new ArrayList<>(); // Simulación de una lista de usuarios para validar que el correo electrónico existe
            return usuarios.stream().anyMatch(user -> user.getEmail().equals(email));
        }
    }

    public static boolean authName(String name) {
        boolean nameValid = UserValidation.validateName(name);
        if (!nameValid) {
            throw new IllegalArgumentException("El nombre no es válido");
        } else {
            ArrayList<Usuario> usuarios = new ArrayList<>(); // Simulación de una lista de usuarios para validar que el nombre existe
            return usuarios.stream().anyMatch(user -> user.getNombre().equals(name));
        }
    }

    public static boolean authPassword(String password) {
        boolean passwordValid = UserValidation.validatePassword(password);
        if (!passwordValid) {
            throw new IllegalArgumentException("La contraseña no es válida");
        } else {
            ArrayList<Usuario> usuarios = new ArrayList<>(); // Simulación de una lista de usuarios para validar que la contraseña existe
            return usuarios.stream().anyMatch(user -> user.getContrasena().equals(password));
        }
    }


}
