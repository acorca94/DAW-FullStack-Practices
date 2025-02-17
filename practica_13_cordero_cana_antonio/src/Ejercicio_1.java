import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Ejercicio_1 {

    public void Enero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Crear una opción en Java que almacene en una lista de objetos de la clase ENERO " +
                "las temperaturas medias del mes de Enero (31 días) que introduzca un usuario.");


        ArrayList<Integer> days_january = new ArrayList<>();

        for (int i = 1; i<32; i++){
            days_january.add(i);
            
        }
        System.out.println("Días del mes de Enero: " + days_january);


    }
}
