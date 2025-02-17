import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio_3 {
    public static void Ej3() {
        System.out.println("Realizar un método que reciba como parámetro una lista de números enteros mayores que 0, " +
                "pudiendo contener elementos duplicados. Este método debe sustituir cada valor repetido por 0. " +
                "Para terminar, realizar un método que muestre el array modificado.");

       List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);

        // Llamar al método para reemplazar los valores duplicados por 0
        List<Integer> modifiedNumbers = replaceDuplicates(numbers);

        // Mostrar el array modificado
        System.out.println("Array modificado:");
        for (Integer number : modifiedNumbers) {
            System.out.print(number + " ");
        }
    }

    private static List<Integer> replaceDuplicates(List<Integer> numbers) {

    }
}
