import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio_1 ej1objeto = new Ejercicio_1();
        Ejercicio_2 ej2ercicio = new Ejercicio_2();
        Ejercicio_3 ej3objeto = new Ejercicio_3();
        Ejercicio_4 ej4objeto = new Ejercicio_4();


        int number;
        do{
            System.out.println("\n" + "Bienvenido al menú. Escoge el ejercicio al que quieres acceder: " + "\n");
            //EJERCICIO 1:
            System.out.println("1. Ejercicio 1.");
            //EJERCICIO 2:
            System.out.println("2. Ejercicio 2.");
            //EJERCICIO 3:
            System.out.println("3. Ejercicio 3.");
            //EJERCICIO 4:
            System.out.println("4. Ejercicio 4.");
            //OPCIÓN SALIR:
            System.out.println("6. Salir" + "\n");


            System.out.println("Escribe aqui el número de la opción a la que quieres acceder: ");
            number = sc.nextInt();

            switch (number){
                case 1:
                    ej1objeto.Enero();
                    break;
                case 2:
                    ej2ercicio.Ej2();
                    break;
                case 3:
                    ej3objeto.Ej3();
                    break;
                case 4:
                    ej4objeto.Ej4();
                    /*int number;
                    do{
                        System.out.println("\n" + "Bienvenido al menú del ejercicio 4. Escoge la opción a la que quieres acceder: " + "\n");
                        System.out.println("1. Añadir animal.");
                        System.out.println("2. Eliminar un animal por nombre.");
                        System.out.println("3. Obtener los datos de un animal por nombre.");
                        System.out.println("4. Obtener la media de todos los pesos de los animales.");
                        System.out.println("5. Obtener la media de todos los pesos de los animales.");
                        System.out.println("6. Obtener el animal más mayor.");
                        System.out.println("7. Obtener el animal más pequeño.");
                        System.out.println("8. Salir." + "\n");


                        System.out.println("Escribe aqui el número de la opción a la que quieres acceder: ");
                        number = sc.nextInt();

                        switch (number){
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:

                                break;
                            case 5:

                                break;
                            case 6:

                                break;
                            case 7:

                                break;
                            case 8:
                                System.out.println("Salida con éxito.");
                                break;
                            default:
                                System.out.println("El valor introducido no corresponde a ninguna función.");
                        }
                    }while (number != 8);*/
                    break;
                case 5:
                    System.out.println("Salida con éxito.");
                    break;
                default:
                    System.out.println("El valor introducido no corresponde a ninguna función.");
            }
        }while (number != 5);
    }
}