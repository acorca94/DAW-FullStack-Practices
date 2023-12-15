import java.time.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary_A = sc.nextDouble();
        LocalDate start_dateA = LocalDate.of(2005, 5, 12 );
        LocalDate start_dateB = LocalDate.of(2006, 6, 13 );
        LocalDate start_dateC = LocalDate.of(2007, 7, 14 );


        Medic medicoA = new Medic("47340008", "Marta", 23, "Femenino", 1700, start_dateA, "Quirúrgica" );
        Medic medicoB = new Medic("47340009", "Antonio", 18, "Masculino", 1700, start_dateB, "Infantil" );
        Medic medicoC = new Medic("47340010", "Carlos", 24, "Masculino", 1700, start_dateC, "Dermatología" );


        System.out.println();
    }
}