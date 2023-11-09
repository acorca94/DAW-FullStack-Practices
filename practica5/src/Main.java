public class Main {
    public static void main(String[] args) {

        Usuario user_1 = new Usuario("Antonio", "Cordero", 41749, "Calle Montes", "accgp00@gmail.com", "accgp");
        Usuario user_2 = new Usuario("Marta", "Hinojosa", 41210, "Calle Valle", "marta.hinojosa@gmail.com", "mhggp");

        user_1.setName("Carlos");
        user_1.setSurname("Diaz");
        user_1.setPostalCode(11500);
        user_1.setAddress("Calle Ingeniero Andres");
        user_1.setEmail("carlos.diaz@gmail.com");
        user_1.setPassword("cdmgp");

        user_2.setName("Antonio");
        user_2.setSurname("Ramirez");
        user_2.setPostalCode(41749);
        user_2.setAddress("Calle Higuera");
        user_2.setEmail("antonio.ramirez@gmail.com");
        user_2.setPassword("ardgp");

        System.out.println(" " + user_1.toStringA(user_1));
        System.out.println(" " + user_2.toStringA(user_2));

    }

}


