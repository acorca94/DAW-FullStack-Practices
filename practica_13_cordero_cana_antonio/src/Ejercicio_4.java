import java.util.Scanner;
public class Ejercicio_4 {
    public void Ej4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Crear una opción de menú, dicha opción mostrará un nuevo menú al usuario con las siguientes opciones:\n" +
                "\n" +
                "\n" +
                "Añadir un animal.\n" +
                "Eliminar un animal por nombre.\n" +
                "Obtener los datos de un animal por nombre.\n" +
                "Obtener todas las razas de los animales.\n" +
                "Obtener la media de todos los pesos de los animales.\n" +
                "Obtener el animal más mayor.\n" +
                "Obtener el animal más pequeño.\n" +
                "Salir del programa.\n" +
                "\n" +
                "Se tendrá que realizar una clase Animal que tenga los siguientes atributos: nombre, raza, peso y edad. La clase debe de contener todo lo necesario para poder ser usada.\n" +
                "\n" +
                "Realizar una clase MisAnimales que contenga una lista de animales.\n");


        Animales animal1 = new Animales("Toby", "Labrador", 6.5, 8);
        System.out.println("Nombre" + animal1.getNombre() + "Raza -> " + animal1.getRaza());

    }
}
