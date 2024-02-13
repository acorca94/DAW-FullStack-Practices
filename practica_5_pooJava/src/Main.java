import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //User_1 y user_2 son objetos, de clase usuario.
        Usuario user_1 = new Usuario("Antonio", "Cordero", 41749, "Calle Montes", "accgp00@gmail.com", "accgp");
        Usuario user_2 = new Usuario("Marta", "Hinojosa", 41210, "Calle Valle", "marta.hinojosa@gmail.com", "mhggp");

        //Aquí es por si quisieramos cambiar la informacion del usario uno o dos.
        //user_1.setName(""Carlos);
        //user_1.setSurname("Garcia");
        //user_1.setPostalCode(11503);
        //user_1.setAddress("Calle Montesino");
        //user_1.setEmail("carlos.garcia@gmail.com");
        //user_1.setPassword("cgfgp");

        //user_2.setName("Antonio");
        //user_2.setSurname("Ramirez");
        //user_2.setPostalCode(41749);
        //user_2.setAddress("Calle Higuera");
        //user_2.setEmail("antonio.ramirez@gmail.com");
        //user_2.setPassword("ardgp");

        Scanner sc = new Scanner(System.in);

        System.out.println("Usuario 1: ");
        String userEmail1 = sc.nextLine();

        System.out.println("Contraseña: ");
        String userPassword1 = sc.nextLine();

        user_1.check(userEmail1, userPassword1);

        //Otra forma de decir si es correcto o no, sería de la siguiente forma:
        //if (user_1.check(userEmail1, userPassword1)) {
        //System.out.println("Correcto");
        //} else {
        //System.out.println("Incorrecto");
        //}

        System.out.println(" ");

        System.out.println("Usuario 2: ");
        String userEmail2 = sc.nextLine();

        System.out.println("Contraseña: ");
        String userPassword2 = sc.nextLine();

        user_2.check(userEmail2, userPassword2);

        //Otra forma de decir si es correcto o no, sería de la siguiente forma:
        //if (user_2.check(userEmail2, userPassword2)) {
            //System.out.println("Correcto");
        //} else {
            //System.out.println("Incorrecto");
        //}

    }
}
        //Esto sería para imprimir toda la información de user_1 y user_2 a través del get.
        //System.out.println(" " + user_1.toStringA(user_1));
        //System.out.println(" " + user_2.toStringA(user_2));





