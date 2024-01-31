import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //OBJETOS EJERCICIO 1.
        GestorNumeros gN1 = new GestorNumeros (0);
        //OBJETOS EJERCICIO 2.
        GestorPersonas gP1 = new GestorPersonas("Maria", 26);
        GestorPersonas gP2 = new GestorPersonas("Marta", 23);
        GestorPersonas gP3 = new GestorPersonas("Carlos", 24);
        GestorPersonas gP4 = new GestorPersonas(" ", 0);
        GestorPersonas gP5 = new GestorPersonas(" ", 0);

        //CREACIÓN DEL MENÚ
        System.out.println("Bienvenido al menú. Estas son las opciones: ");
        System.out.println("1. Ejercicio 1 - GestorNumeros -> Manejo de LIST en Java.");
        System.out.println("2. Ejercicio 2 - GestorPersonas -> Manejo de MAP (HasMap) en Java.");
        System.out.println("3. Ejercicio 3 - GestorColores -> Manejo de SET (HasSet) en Java.");
        System.out.println("4. Ejercicio 4 - GestorEstudiantes -> Manejo de SET (HasSet) en Java con Objetos Personalizados.");
        System.out.println("5. Ejercicio 5 - GestorEmpleados -> Manejo de SET (HasSet) en Java con Objetos Personalizados.");


        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la opcion a la que quieres acceder: ");
        int option = sc.nextInt();

        if(option == 1){
            gN1.create_list();

        }
        else if (option == 2) {


        }
        else if (option == 3) {


        }
        else if (option == 4) {


        } else if (option == 5) {

        }
        else {
            System.out.println("Número introducido erróneo.");
        }
    }
}