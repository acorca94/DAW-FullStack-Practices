import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ejercicio_1 ejercicio1  = new Ejercicio_1();
        Ejercicio_2 ejercicio2  = new Ejercicio_2();
        Ejercicio_3 ejercicio3  = new Ejercicio_3();
        Ejercicio_4 ejercicio4  = new Ejercicio_4();
        Ejercicio_5 ejercicio5  = new Ejercicio_5();
        Ejercicio_6 ejercicio6  = new Ejercicio_6();
        Ejercicio_7 ejercicio7  = new Ejercicio_7();
        Ejercicio_8 ejercicio8  = new Ejercicio_8();
        Ejercicio_9 ejercicio9  = new Ejercicio_9();
        Ejercicio_10 ejercicio10  = new Ejercicio_10();




        int opcion;
        do{
            System.out.println("Hola, bievenid@ al menú principal. Escoge la opción que desea" +
                    "\n" + "1) Ejercicio 1"+
                    "\n" + "2) Ejercicio 2"+
                    "\n" + "3) Ejercicio 3"+
                    "\n" + "4) Ejercicio 4"+
                    "\n" + "5) Ejercicio 5"+
                    "\n" + "6) Ejercicio 6"+
                    "\n" + "7) Ejercicio 7"+
                    "\n" + "8) Ejercicio 8"+
                    "\n" + "9) Ejercicio 9"+
                    "\n" + "10) Ejercicio 10"+
                    "\n" + "0) Salir."
            );
            System.out.println("Introduce el número de la opción que deseas: ");
            opcion = sc.nextInt();

            if (opcion==1){
                ejercicio1.Ej1();
            } else if (opcion==2) {
                ejercicio2.Ej2();
            } else if (opcion==3) {
                ejercicio3.Ej3();
            } else if (opcion==4) {
                ejercicio4.Ej4();
            } else if (opcion==5) {
                ejercicio5.Ej5();
            } else if (opcion==6) {
                ejercicio6.Ej6();
            } else if (opcion==7) {
                ejercicio7.Ej7();
            } else if (opcion==8) {
                ejercicio8.Ej8();
            } else if (opcion==9) {
                ejercicio9.Ej9();
            } else if (opcion==10) {
                ejercicio10.Ej10();
            } else if (opcion==0){
                System.out.println("Saliendo...");
            } else{
                System.out.println("Número erróneo");
            }

        }while(opcion!=0);
    }
}