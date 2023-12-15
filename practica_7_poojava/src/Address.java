//CLASE dirección
public class Address {
    //ATRIBUTOS de clase dirección
    private String street;
    private Integer postal_code;
    private int number_hospital;
    private String province;
    private String locality;


    //CONSTRUCTOR de la clase dirección
    public Address(String street, Integer postal_code, int number_hospital, String province, String locality){
        this.street = street;
        this.postal_code =  postal_code;
        this.number_hospital = number_hospital;
        this.province = province;
        this.locality = locality;
    }


    //GETTERS de clase dirección
    public String getStreet() { return street; }

    public Integer getPostal_code() { return postal_code; }

    public int getNumber_hospital() { return number_hospital; }

    public String getProvince() { return province; }

    public String getLocality() { return locality; }


    //SETTERS de la clase dirección
    public void setStreet(String street) { this.street = street; }

    public void setPostal_code(Integer postal_code) { this.postal_code = postal_code; }

    public void setNumber_hospital(int number_hospital) { this.number_hospital = number_hospital; }

    public void setProvince(String province) { this.province = province; }

    public void setLocality(String locality) { this.locality = locality; }
}
