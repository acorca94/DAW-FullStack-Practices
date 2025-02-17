import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio_1 ej1objeto = new Ejercicio_1();

        int number;
        do{

            System.out.println("Bienvenido al menú. Escoge la opción a la que quieres acceder: ");
            System.out.println("1. Crear Base de Datos.");
            System.out.println("2. Crear tabla Vehículo.");
            System.out.println("3. Crear tabla Motocicleta.");
            System.out.println("4. Crear tabla Coche.");
            System.out.println("5. Obtener todos los datos de las Vivienda o Chalet. " +
                    "Por ejemplo, si es un chalet me tiene que dar información de la vivienda");
            System.out.println("6. Actualizar datos de las tablas");
            System.out.println("7. Salir.");

            System.out.println("Escribe aqui el número de la opción a la que quieres acceder: ");
            number = sc.nextInt();

            switch (number){
                case 1:
                    ej1objeto.CreateBBDD();
                    break;
                case 2:
                    ej1objeto.CreateTable();
                    break;
                case 3:
                    ej1objeto.InsertValueV();
                    break;
                case 4:
                    ej1objeto.InsertValueC();
                    break;
                case 5:
                    ej1objeto.ObtainingData();
                    break;
                case 6:
                    ej1objeto.UpdateData();
                    break;
                case 7:
                    System.out.println("Salida con éxito.");
                    break;
                default:
                    System.out.println("El valor introducido no corresponde a ningún dato");
            }
        }while (number != 6);
    }
}