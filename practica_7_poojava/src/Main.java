import java.time.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Address locationA = new Address("Avenida Macarena", 41749, 5, "Sevilla", "Sevilla");
        Address locationB = new Address("Calle Mercurio", 41009, 4, "Sevilla", "Dos hermanas");
        Address locationC = new Address("Calle Martes", 41010, 10, "Sevilla", "Sevilla");

        Hospital hospitalA = new Hospital("Virgen del Rocío", "f34000923", locationA);
        Hospital hospitalB = new Hospital("Hospital de Valme", "d34000920", locationB);
        Hospital hospitalC = new Hospital("Hospital QuirónSalud", "d3400450", locationC);

        LocalDate start_dateA = LocalDate.of(2005, 5, 12 );
        LocalDate start_dateB = LocalDate.of(2006, 6, 13 );
        LocalDate start_dateC = LocalDate.of(2007, 7, 14 );

        Area areaA = new Area("Quirúrgica", "1A", 2, "Hospital de Valme", 12345);
        Area areaB = new Area("Infantil", "2B", 3, "Virgen del Rocío", 54321);
        Area areaC = new Area("Ginecología", "2A", 2, "V", 13452);

        Medic medicoA = new Medic("47340008", "Marta", 23, "Femenino", 1700, start_dateA, areaA);
        Medic medicoB = new Medic("47340009", "Antonio", 18, "Masculino", 1700, start_dateB, areaB);
        Medic medicoC = new Medic("47340010", "Carlos", 24, "Masculino", 1700, start_dateC, areaC);

        Contract contratomedicoA = new Contract(start_dateA, medicoA, hospitalA);
        Contract contratomedicoB = new Contract(start_dateB, medicoB, hospitalB);
        Contract contratomedicoC = new Contract(start_dateC, medicoC, hospitalC);
    }
}