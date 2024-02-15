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


    //CREAR UN JSON DE UN OBJETO
    public void createMedic() throws IOException {
        Gson gson = new Gson();
        LocalDate date = LocalDate.of(2004, 5, 1);
        Address direccion1 = new Address("Mariano", 41749, "Sevilla", "Sevilla");
        Medic medico1 = new Medic("Marta", 23, "Femenino", "47340009Y", 2000, date.getYear(), date.getMonthValue(), date.getDayOfMonth(), direccion1);

        String json = gson.toJson(medico1.getName());

        System.out.println(json);
    }


    //LEER UN ARCHIVO JSON
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

        // CERRAR LECTURA
        reader.close();
    }


    //ESCRIBIR EN UN FICHERO JSON
    public void writeMedic() throws IOException {

        String texto1 = "Hola mi gente";
        String texto2 = "sois lo mejor del mundo";
        try {
            BufferedWriter bw = new  BufferedWriter(new FileWriter("medic.json"));
            bw.write(texto1);
            bw.newLine();
            bw.write(texto2);
            
        } catch (IOException e) {
            System.out.println("ERROR");
        }

    }

    //ACTUALIZAR ARCHIVO JSON
    public void updateMedic(){

    }


    //ELIMINAR ARCHIVO JSON
    public void deleteMedic(){
        File fichero = new File(" ");

        if (fichero.delete())
            System.out.println("El fichero ha sido borrado satisfactoriamente");
        else
            System.out.println("El fichero no pudo ser borrado");
    }



}
