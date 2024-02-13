import com.google.gson.Gson;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;


public class GestionMedicos {

    public GestionMedicos() throws IOException {
        //SIRVE PARA LEER EL ARCHIVO JSON:
        Gson gson = new Gson();

        // create a reader
        Reader reader = Files.newBufferedReader(Paths.get("medico.json"));

        // convert JSON file to map
        Map<?, ?> map = gson.fromJson(reader, Map.class);

        // print map entries
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        // close reader
        reader.close();

    }




}
