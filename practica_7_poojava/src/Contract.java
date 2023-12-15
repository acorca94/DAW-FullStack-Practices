//Aquí estamos llamando de la biblioteca a la función java.time para poder traer LocalData y otras funciones. El asterisco sirve para importarlo todo lo de la funcion java.time
import java.time.*;
public class Contract {
    //ATRIBUTOS de clase contrato
    private  LocalDate date_creation;
    private String medical_data;
    private String hospital_data;


    //CONSTRUCTOR de clase contrato
    public Contract(LocalDate date_creation, String medical_data, String hospital_data){
        this.date_creation = date_creation;
        this.medical_data = medical_data;
        this.hospital_data = hospital_data;
    }


    //GETTERS de clase contrato
    public LocalDate getDate_creation() { return date_creation; }

    public String getMedical_data() { return medical_data; }

    public String getHospital_data() { return hospital_data; }


    //SETTERS de clase contrato
    public void setDate_creation(LocalDate date_creation) { this.date_creation = date_creation; }

    public void setMedical_data(String medical_data) { this.medical_data = medical_data; }

    public void setHospital_data(String hospital_data) { this.hospital_data = hospital_data; }
}
