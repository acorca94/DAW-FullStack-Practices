import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
        //CREAR UN MÉDICO NUEVO
        GestionMedicos gm = new GestionMedicos();

        //MOSTRAR MÉDICO
        gm.showMedic();

        //ELIMINAR FICHERO JSON
        gm.deleteMedic();

        //CREAR UN JSON A TRAVES DE UN OBJETO
        gm.createMedic();

    }
}