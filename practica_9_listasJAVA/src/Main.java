import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //OBJETOS EJERCICIO 1.
        GestorNumeros gN1 = new GestorNumeros ();
        //OBJETOS EJERCICIO 2.
        GestorPersonas gP1 = new GestorPersonas();
        //OBJETOS EJERCICIO 3.
        GestorColores gC1 = new GestorColores();
        //OBJETOS EJERCICIO 4.
        GestorEstudiantes gE1 = new GestorEstudiantes();
        Estudiantes student2 = new Estudiantes("Maria", 2);

        //CREACIÓN DEL MENÚ con el system.out.println
        System.out.println("Bienvenido al menú. Estas son las opciones: ");
        System.out.println("1. Ejercicio 1 - GestorNumeros -> Manejo de LIST en Java.");
        System.out.println("2. Ejercicio 2 - GestorPersonas -> Manejo de MAP (HasMap) en Java.");
        System.out.println("3. Ejercicio 3 - GestorColores -> Manejo de SET (HasSet) en Java.");
        System.out.println("4. Ejercicio 4 - GestorEstudiantes -> Manejo de SET (HasSet) en Java con Objetos Personalizados.");
        System.out.println("5. Ejercicio 5 - GestorEmpleados -> Manejo de SET (HasSet) en Java con Objetos Personalizados.");

        //CREACIÓN DEL MENÚ dándole funcionalidad con los métodos
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la opcion a la que quieres acceder: ");
        int option = sc.nextInt();

        if(option == 1){
            //AGREGAR NÚMEROS A MI LISTA. EL METODO ESTÁ EN CLASE GestorNumeros
            gN1.agregarNumero(20);
            gN1.agregarNumero(30);
            gN1.agregarNumero(40);
            gN1.agregarNumero(50);

            //MOSTRAR NÚMEROS DE MI LISTA. EL MÉTODO ESTÁ EN CLASE GestorNumeros
            gN1.mostrarNumero();

            //VER SUMA TOTAL DE LOS NÚMEROS DE MI LISTA. EL MÉTODO ESTÁ EN CLASE GestorNumeros
            gN1.sumaNumeros();
        }
        else if (option == 2) {
            //Sirve para agregar persona con el nombre y edad del atributo MAP creado en clase gestorpersonas
            gP1.agregarPersona("Carlos", 24);
            gP1.agregarPersona("Marta", 23);
            gP1.agregarPersona("Fran", 30);

            //Muestra todas las personas tanto que tengo creada como las que voy añadiendo con el metodo de la linea anterior.
            gP1.mostrarPersona("Fran");

            //Verifica si existe una persona en la lista con la Key
            gP1.existePersona("Carlos");


        }
        else if (option == 3) {
            //Sirve para agregar colores con SET (HASHSET)
            gC1.agregarColor("Amarillo");
            gC1.agregarColor("Azul");
            gC1.agregarColor("Verde");

            //Sirve para mostrar los colores con SET (HASHSET)
            gC1.mostrarColor();

            //Sirve para verificar si un color, esta en la lista
            gC1.existeColor("Amarillo");

        }
        else if (option == 4) {
            //Sirve para agregar estudiantes con SET (HASHSET)
            sc.nextLine();
            System.out.print("Nombre\n>>> ");
            String n = sc.nextLine();
            System.out.print("id\n>>> ");
            int i = sc.nextInt();
            Estudiantes student1 = new Estudiantes(n, i);
            gE1.agregarEstudiante(student1);
            gE1.agregarEstudiante(student2);

            //Sirve para mostrar los estudiantes con SET (HASHSET)
            gE1.mostrarEstudiante(student2);
            gE1.mostrarEstudiante(student1);

            //Sirve para verificar si un estudiante, esta en la lista
            gE1.existeEstudiante(5);

        } else if (option == 5) {

        }
        else {
            System.out.println("Número introducido erróneo.");
        }
    }
}