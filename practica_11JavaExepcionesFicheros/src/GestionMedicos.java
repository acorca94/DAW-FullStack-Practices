import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GestionMedicos {

    //FECHA INICIO MEDICO////////////
    LocalDate datemedicoA = LocalDate.of(2020, 1, 15);
    LocalDate datemedicoB = LocalDate.of(2020, 1, 2);

    //DIRECCIÓN MEDICO
    Address addressmedicoA = new Address("Velazquez", 41749, "Sevilla", "Sevilla");
    Address addressmedicoB = new Address("Av. Argentina", 41009, "Sevilla", "Dos hermanas");

    //OBJETOS MEDICO
    Medic medicoA = new Medic("Antonio", 29, "Maculino", "47340008-Y", 2500, datemedicoA.getYear(), datemedicoA.getMonth().getValue(), datemedicoA.getDayOfMonth(), addressmedicoA);
    Medic medicoB = new Medic("Antonio", 29, "Maculino", "47340008-Y", 2500, datemedicoB.getYear(), datemedicoB.getMonth().getValue(), datemedicoB.getDayOfMonth(), addressmedicoB);


    //CREAR UN MÉDICO
    public static void createMedic(){
        System.out.println("AÑADE LA INFORMACIÓN DEL MÉDICO NUEVO: \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        String name = sc.nextLine();
        System.out.println("Edad: ");
        int age = sc.nextInt();
        System.out.println("Género: ");
        String gender = sc.nextLine();
        System.out.println("DNI: ");
        String dni = sc.nextLine();
        System.out.println("Salario: ");
        double salary= sc.nextDouble();
        System.out.println("Año incio: ");
        int year = sc.nextInt();
        System.out.println("Mes incio: ");
        int month = sc.nextInt();
        System.out.println("Día incio: ");
        int day = sc.nextInt();

        System.out.println("Dirección del nuevo médico: ");
        System.out.println("Calle: ");
        String street = sc.nextLine();
        System.out.println("Calle: ");
        int postal_code = sc.nextInt();
        System.out.println("Calle: ");
        String province = sc.nextLine();
        System.out.println("Calle: ");
        String locality = sc.nextLine();
        Address addressmedicoC = new Address(street, postal_code, province, locality);
        Medic medicoC = new Medic(name, age, gender, dni, salary, year, month, day, addressmedicoC);

        System.out.println("Nombre: " + medicoC);

    }

    //LEER/MOSTRAR MÉDICO
    public void showMedic(){
        ArrayList<Medic> listamedico = new ArrayList<Medic>();
        listamedico.add(medicoA);
        listamedico.add(medicoB);
        //listamedico.add(medicoC);
        System.out.println("Aquí tienes los médicos: ");
    }

}
