import java.util.Scanner;
/*
    Crear un método en Java que solicite un número del mes
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month;
        do{
            System.out.println("1 - Enero");
            System.out.println("2 - Febrero");
            System.out.println("3 - Marzo");
            System.out.println("4 - Abril");
            System.out.println("5 - Mayo");
            System.out.println("6 - Junio");
            System.out.println("7 - Julio");
            System.out.println("8 - Agosto");
            System.out.println("9 - Septiembre");
            System.out.println("10 - Octubre");
            System.out.println("11 - Noviembre");
            System.out.println("12 - Diciembre");
            System.out.println("0 - Salir");

            System.out.println("Inserte el número de la opción que deseas: ");
            month = sc.nextInt();

            switch (month) {
                case 1:
                    System.out.println("El mes de Enero tiene 31 días");
                    break;

                case 2:
                    System.out.println("El mes de Febrero tiene 28 días y 29 en años bisiesto");
                    break;

                case 3:
                    System.out.println("El mes de Marzo tiene 31 días");
                    break;

                case 4:
                    System.out.println("El mes de Abril tiene 30 días");
                    break;

                case 5:
                    System.out.println("El mes de Mayo tiene 31 días");
                    break;

                case 6:
                    System.out.println("El mes de Junio tiene 30 días");
                    break;
                case 7:
                    System.out.println("El mes de Julio tiene 31 días");
                    break;
                case 8:
                    System.out.println("El mes de Agosto tiene 31 días");
                    break;
                case 9:
                    System.out.println("El mes de Septiembre tiene 30 días");
                    break;
                case 10:
                    System.out.println("El mes de Octubre tiene 31 días");
                    break;
                case 11:
                    System.out.println("El mes de Noviembre tiene 30 días");
                    break;
                case 12:
                    System.out.println("El mes de Diciembre tiene 31 días");
                    break;
                case 0:
                    System.out.println("Saliendo del menú");
                    break;
                default:
                    System.out.println("El valor introducido no corresponde a ningún dato");
            }
        } while (month != 0);
    }
}