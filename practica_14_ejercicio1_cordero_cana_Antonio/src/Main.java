import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Ejercicio_1 ej1objeto = new Ejercicio_1();

        int number;
        String name;
        String password;
        do {
            System.out.println("Hola! Bievenido al menú. Introduce los datos de tu BASE DE DATOS:");
            System.out.println("Nombre de la BBDD: ");
            name = sc.nextLine();
            System.out.println("Contraseña: ");
            password = sc.nextLine();
            if (name.equals("root") && password.equals("1234")){
                System.out.println("¡Entrada con éxito!");
            } else {
                System.out.println("Datos usuario y/o contraseña incorrecta, inténtelo de nuevo");
            }

        }while (!name.equals("root") || !password.equals("1234"));

        do{

            //MENÚ
            System.out.println("\n Escoge la opción a la que quieres acceder: ");
            System.out.println("1. Crear Base de Datos.");
            System.out.println("2. Crear tabla Vehículo.");
            System.out.println("3. Crear tabla Motocicleta.");
            System.out.println("4. Crear tabla Coche.");
            System.out.println("5. Introducir manualmente datos de la tabla Vehículo.");
            System.out.println("6. Introducir manualmente datos de la tabla Motocicleta.");
            System.out.println("7. Introducir manualmente datos de la tabla Coche.");
            System.out.println("8. Mostrar datos de Vehículo.");
            System.out.println("9. Mostrar todos los datos de Coche y Motocicleta. " +
                    "Se debe mostrar la información referente a la marca y el modelo del coche y/o motocicleta y " +
                    "diferenciar en el listado el tipo si es coche o motocicleta.");
            System.out.println("10. Borrar un dato de la tabla, " +
                    "previamente tiene que solicitar si es de la tabla coche o motocicleta");
            System.out.println("11. Salir.\n");


            System.out.println("Escribe aqui el número de la opción a la que quieres acceder: ");
            number = sc.nextInt();

            switch (number){
                case 1:
                    ej1objeto.CreateBBDD();
                    break;
                case 2:
                    ej1objeto.CreateTableV();
                    break;
                case 3:
                    ej1objeto.CreateTableM();
                    break;
                case 4:
                    ej1objeto.CreateTableC();
                    break;
                case 5:
                    ej1objeto.InsertValueV();
                    break;
                case 6:
                    ej1objeto.InsertValueM();
                    break;
                case 7:
                    ej1objeto.InsertValueC();
                    break;

                case 8:
                    ej1objeto.ShowdataV();
                    break;
                case 9:
                    ej1objeto.ShowdataMyC();
                    break;
                case 10:
                    ej1objeto.Deletedata();
                    break;
                case 11:
                    System.out.println("Salida con éxito.");
                    break;
                default:
                    System.out.println("El valor introducido no corresponde a ningún dato");
            }
        }while (number != 11);

    }
}