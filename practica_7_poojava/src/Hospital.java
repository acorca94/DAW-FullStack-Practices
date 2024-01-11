//CLASE hospital
public class Hospital {
    //ATRIBUTOS de clase hospital
    private String name;
    private String cif;
    private Address address;


    //CONSTRUCTOR de la clase hospital
    public Hospital(String name, String cif, Address address){
        this.name = name;
        this.cif = cif;
        this.address = address;
    }


    //GETTERS de la clase hospital
    public String getName() { return name;}

    public String getCif(){
        return  cif;
    }

    public Address address(){
        return address;
    }


    //SETTERS de clase Hospital
    public void setName(String name) {
        this.name = name;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setLocation(Address address) {
        this.address = address;
    }
}
