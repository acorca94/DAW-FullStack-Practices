import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //CONDICIÓN IF-ELSE METIENDO INFO POR TECLADO
        Scanner sc = new Scanner(System.in);
/*
        System.out.println("Escribe tu edad: ");
        int edad = sc.nextInt();

        if (edad<12){
            System.out.println("Eres un niño.");

        }else if (edad<18){
            System.out.println("Eres adolescente.");

        }else {
            System.out.println("Eres adulto.");
        }
*/

        //RECORRER UN FOR CON UN ARRAY
        String[] nombres = new String[7];
        nombres[0]= "Lunes";
        nombres[1]= "Martes";
        nombres[2]= "Miércoles";
        nombres[3]= "Jueves";
        nombres[4]= "Viernes";
        nombres[5]= "Sábado";
        nombres[6]= "Domingo";
/*
        System.out.println("Días de la semana: ");
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);

        }

        //RECORRER WHILE CON ARRAY
        System.out.println("Días de la semana: ");
        int a = 0;
        while (a < 7){
            System.out.println(nombres[a]);
            a++;
        }
*/
/*
        int a = 0;
        while (a < 7){
            String dia = sc.nextLine();
            if (dia.equals("Domingo")){
                System.out.println("Error");
            }

            System.out.println(nombres[a]);
            a++;

        }
*/
        int opcion1;
        do {
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Raíz Cuadrada");
            System.out.println("6 - Salir");


            System.out.println("Escríbe el número correspondiente al producto: ");
            opcion1 = sc.nextInt();

            switch (opcion1) {
                case 1:
                    System.out.println("Sumar");
                    break;

                case 2:
                    System.out.println("Restar");
                    break;

                case 3:
                    System.out.println("Multiplicar");
                    break;

                case 4:
                    System.out.println("Dividir");
                    break;

                case 5:
                    System.out.println("Raiz C.");
                    break;

                case 6:
                    System.out.println("Saliendo");
                    break;
            }
        } while (opcion1 != 6);
    }
}