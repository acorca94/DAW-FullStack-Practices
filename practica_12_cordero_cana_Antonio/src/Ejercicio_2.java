import java.util.Scanner;

public class Ejercicio_2 {
    public void Ej2(){
        System.out.println("Hola! Bienvenido al menú del ejercicio 2." + "\n" +
                "Debes adivinar un número entre 0 y 50.");
        Scanner sc = new Scanner(System.in);

        int numaleatorio;
        int numero;
        numaleatorio = (int) Math.floor(Math.random()*50);
        System.out.println("Ya tenemos tu número aleatorio" + "\n" + "¡Puedes empezar a jugar!");
        int cont = 10;
        for(int i= 0; i<cont; i++) {
            System.out.println("Introduce tu número: ");
            numero = sc.nextInt();
            if (numaleatorio < numero) {
                System.out.println("Tu número es mayor.");
            } else if (numaleatorio > numero) {
                System.out.println("Tu número es menor.");
            } else if (numaleatorio == numero) {
                System.out.println("¡¡ENHORABUENA!! ADIVINASTE.");
            }
        }
        System.out.println("Números de intentos -> " + cont + "\n" + "Has alcanzado el número máximo de intentos.");
    }
}
