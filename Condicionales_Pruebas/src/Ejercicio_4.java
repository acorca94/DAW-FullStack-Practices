import java.util.Objects;
import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String user1;
        String user2;

        System.out.println("Escoje entre: " +
                "\n -> Piedra" +
                "\n -> Papel" +
                "\n -> Tijera");
        System.out.println("Inserte su jugada usuario 1 -> ");
        user1 = sc.nextLine();

        System.out.println("Inserte  su jugada usuario 2 -> ");
        user2 = sc.nextLine();

        do {

            if(!(user1.equals("piedra") || user1.equals("papel")|| user1.equals("tijera"))){
                System.out.println("ERROR. Comiencen el juego de nuevo :) " + "\n");
                System.out.println("Introduce tu jugada de nuevo usuario 1: ");
                user1 = sc.nextLine();

                System.out.println("Introduce tu jugada de nuevo usuario 2: ");
                user2 = sc.nextLine();
            }else if (user1.equals(user2)){

            }
        }while(user1.equals(user2));

        if (user1.equals("tijera") && user2.equals("papel")){
            System.out.println("Gana Jugador 1");
        }else if (user1.equals("papel") && user2.equals("tijera")){
            System.out.println("Gana Jugador 2");
        }else{
            System.out.println("Error.");
        }

    }
}
