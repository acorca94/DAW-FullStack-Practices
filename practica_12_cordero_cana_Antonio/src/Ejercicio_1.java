import java.util.Scanner;
public class Ejercicio_1 {
    public void Ej1(){
        System.out.println("Hola! Bienvenido al menú del ejercicio 1." + "\n" +
                "Debes introducir números hasta que la suma dé 1000");
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int suma_total = 0;
        int cont = 0;
        double media;
        while (suma_total < 1000){
            System.out.println("Escribe un número: ");
            numero = sc.nextInt();
            suma_total=suma_total+numero;
            cont+=1;

        }
        media = suma_total/cont;
        System.out.println("A) Total acumulado -> " + suma_total);
        System.out.println("B) Cantidad de números introducidos -> " + cont);
        System.out.println("C) Media de todos ellos -> " + media);

    }

}
