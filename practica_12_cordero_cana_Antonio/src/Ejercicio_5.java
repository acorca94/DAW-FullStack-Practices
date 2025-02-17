import java.util.Scanner;

public class Ejercicio_5 {
    public void Ej5(){

                Scanner scanner = new Scanner(System.in);
                System.out.print("frase: ");
                String frase = scanner.nextLine();
                int inicioPalabra = 0;
                StringBuilder palabraActual = new StringBuilder();

        StringBuilder fraseInvertida = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter != ' ') {
                palabraActual.append(caracter);
            } else {
                if (palabraActual.length() > 0) {
                    if (fraseInvertida.length() > 0) {
                        fraseInvertida.insert(0, ' ');
                    }
                    fraseInvertida.insert(0, palabraActual);
                    palabraActual.setLength(0); }
            }
        }
        if (palabraActual.length() > 0) {
            if (fraseInvertida.length() > 0) {
                fraseInvertida.insert(0, ' ');
            }
            fraseInvertida.insert(0, palabraActual);
        }
        System.out.println("La frase invertida: " +
                fraseInvertida.toString());
    }
}

