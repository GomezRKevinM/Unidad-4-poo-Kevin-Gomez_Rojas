package Taller1.Ejercicios;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Libro libro = new Libro();
        CuentaBancaria cuentaBancaria = new CuentaBancaria("12345678", "Ahorros");
        Estudiante estudiante = new Estudiante("Kevin", 23, "Ingeniería de Software");

        Scanner scanner = new Scanner(System.in);
        // Crear instancias de las clases
        System.out.println("Bienvenido al programa de gestión de Estudiante, Libro y Cuenta Bancaria");
        System.out.println("Instancia de Estudiante creada: " + estudiante.toString());
        System.out.println("Creando instancia de Libro...");
        System.out.println("\n ------------------------------------ \n");
        System.out.print("Ingresar titulo del libro:");
        String titulo = scanner.nextLine();
        limpiarPantalla();
        System.out.print("Ingresar autor del libro:");
        String autorLibro = scanner.nextLine();
        limpiarPantalla();
        System.out.print("Ingresar número de páginas del libro:");
        int numeroPaginasLibro = Integer.parseInt(scanner.nextLine());
        limpiarPantalla();
        if(!titulo.isEmpty()){
            libro.setTitulo(titulo);
        }else{
            System.out.println("No se ingresó un título válido, se mantendrá el título por defecto.");
        }

        if(!autorLibro.isEmpty()){
            libro.setAutor(autorLibro);
        }else{
            System.out.println("No se ingresó un autor válido, se mantendrá el autor por defecto.");
        }

        if(numeroPaginasLibro > 0){
            libro.setNumeroPaginas(numeroPaginasLibro);
        }else{
            System.out.println("Número de páginas no válido, se mantendrá el número de páginas por defecto.");
        }
        System.out.println("\n ------------------------------------ \n");

        System.out.println("Instancia de Libro creada: " + libro.toString()+ "\n");
        System.out.println("\n ------------------------------------ \n");

        System.out.println("Creando instancia de Cuenta Bancaria...");
        System.out.print("Ingresar número de cuenta:");
        String numeroCuenta = scanner.nextLine();
        limpiarPantalla();
        System.out.print("Ingresar tipo de cuenta (Ahorros, Corriente, etc.):");
        String tipoCuenta = scanner.nextLine();
        limpiarPantalla();
        System.out.println("Ingresar Saldo de la cuenta (opcional, se mantendrá 0 si no se ingresa):");
        Long saldoCuenta = Long.parseLong(scanner.nextLine());
        limpiarPantalla();

        if(!numeroCuenta.isEmpty()){
            cuentaBancaria.setNumeroCuenta(numeroCuenta);
        }else{
            System.out.println("No se ingresó un número de cuenta válido, se mantendrá el número de cuenta por defecto.");
        }

        if(!tipoCuenta.isEmpty()){
            cuentaBancaria.setTipoCuenta(tipoCuenta);
        }else{
            System.out.println("No se ingresó un tipo de cuenta válido, se mantendrá el tipo de cuenta por defecto.");
        }

        if(saldoCuenta >= 0){
            cuentaBancaria.setSaldo(saldoCuenta);
        }else{
            System.out.println("Saldo no válido, se mantendrá el saldo por defecto.");
        }
        System.out.println("\n ------------------------------------ \n");
        System.out.println("Instancia de Cuenta Bancaria creada: " + cuentaBancaria.toString());
        System.out.println("\n ------------------------------------ \n");


        while (true) {
            int opcion = menu();

            switch (opcion) {
                case 1:
                    System.out.println(estudiante.toString());
                    System.out.println("Enter para volver");
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println(libro.toString());
                    System.out.println("Enter para volver");
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println(cuentaBancaria.toString());
                    System.out.println("Enter para volver");
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción " + opcion + " no válida.");
                    System.out.println("Por favor, elija una opción válida del menú.");
                    System.out.println("Enter para volver al menú");
                    scanner.nextLine(); // Esperar a que el usuario presione Enter
                    break;
            }
        }
    }

    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENÚ");
        System.out.println("1. Mostrar Estudiante");
        System.out.println("2. Mostrar Libro");
        System.out.println("3. Mostrar Cuenta Bancaria");
        System.out.println("4. Salir");

        int opcion = Integer.parseInt(scanner.nextLine());
        return opcion;
    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
