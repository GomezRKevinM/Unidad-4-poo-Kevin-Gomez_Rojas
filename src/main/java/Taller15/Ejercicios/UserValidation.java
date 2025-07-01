package Taller15.Ejercicios;

public class UserValidation {

    public static boolean validateUsername(String username) { // validar que el nombre de usuario tenga al menos 8 caracteres, y solo letras, números, guiones bajos y puntos
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("El nombre de usuario no puede ser nulo o vacío");
        }
        String usernameRegex = "^[a-zA-Z0-9._-]{8,}$"; // Al menos 8 caracteres alfanuméricos, guiones bajos o puntos
        if (!username.matches(usernameRegex)) {
            throw new IllegalArgumentException("El nombre de usuario no es válido");
        } else {
            return true;
        }
    }

    public static boolean validatePassword(String password) { // validar que la contraseña tenga al menos 8 caracteres, una mayúscula, una minúscula y un dígito
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede ser nula o vacía");
        }
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$"; // Al menos 8 caracteres, una mayúscula, una minúscula y un dígito
        if (!password.matches(passwordRegex)) {
            throw new IllegalArgumentException("La contraseña no es válida");
        } else {
            return true;
        }
    }

    public static boolean validateEmail(String email) { // validar que el correo electrónico tenga un formato válido
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("El correo electrónico no puede ser nulo o vacío");
        }
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (!email.matches(emailRegex)) {
            throw new IllegalArgumentException("El correo electrónico no es válido");
        }else{
            return true;
        }

    }

    public static boolean validateName(String name) { // validar que nombre contegan solo letras y espacios, y tenga al menos 6 caracteres
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        String nameRegex = "^[a-zA-Z\\s]{10,}$"; // Al menos 10 caracteres alfabéticos
        if (!name.matches(nameRegex)) {
            throw new IllegalArgumentException("El nombre no es válido");
        } else {
            return true;
        }
    }
}
