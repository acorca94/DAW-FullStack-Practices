import com.google.gson.Gson;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.time.LocalDate;


public class GestionMedicos {

    public GestionMedicos() throws IOException {
        //SIRVE PARA LEER EL ARCHIVO JSON:
        Gson gson = new Gson();

    }

    public void showMedic() throws IOException {
        // create a reader
        Reader reader = Files.newBufferedReader(Paths.get("medico.json"));
        Gson gson = new Gson();

        // convert JSON file to map
        Map<?, ?> map = gson.fromJson(reader, Map.class);

        // AQUÍ ME ESTA IMPRIMIENDO TODOS LAS CLAVES Y VALORES, DEL MÉDICO CREADO EN MI JSON
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        // close reader
        reader.close();
    }


    //CREAR UN JSON DE UN OBJETO
    public void createMedic() throws IOException {
        Gson gson = new Gson();
        Address direccion1 = new Address("Mariano", 41749, "Sevilla", "Sevilla");
        Medic medico1 = new Medic("Marta", 23, "Femenino", "47340009Y", 2000, 2004, 5, 20, direccion1);

        String json = gson.toJson(medico1);

        System.out.println(json);
    }
    public void updateMedic(){

    }

    public void deleteMedic(){
        File fichero = new File(" ");

        if (fichero.delete())
            System.out.println("El fichero ha sido borrado satisfactoriamente");
        else
            System.out.println("El fichero no pudo ser borrado");
    }




}
