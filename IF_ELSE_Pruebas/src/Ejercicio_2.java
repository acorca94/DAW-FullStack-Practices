import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int number1;
        int number2;

        System.out.println("Inserte el número 1: ");
        number1 = sc.nextInt();

        System.out.println("Inserte el número 2: ");
        number2 = sc.nextInt();

        do {

            if (number1>number2){
                System.out.println("El número 2 debe ser superior al uno: ");
                number2 = sc.nextInt();
            }

        } while(number1 >= number2);

        for (int a = number1; a <= number2; a++){

            if (a%3==0 && a%5==0){
                System.out.println(a + " ByBoth");
            } else if (a%5==0){
                System.out.println(a + " ByFive");
            } else if (a%3==0){
                System.out.println(a + " ByThree");
            } else{
                System.out.println("Números indiferentes: " + a);
            }

        }
    }
}
