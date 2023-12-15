//CLASE hospital
public class Hospital {
    //ATRIBUTOS de clase hospital
    private String name;
    private String cif;
    private String location;


    //CONSTRUCTOR de la clase hospital
    public Hospital(String name, String cif, String location){
        this.name = name;
        this.cif = cif;
        this.location = location;
    }


    //GETTERS de la clase hospital
    public String getName() { return name;}

    public String getCif(){
        return  cif;
    }

    public String location(){
        return location;
    }


    //SETTERS de clase Hospital
    public void setName(String name) {
        this.name = name;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
