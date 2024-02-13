public class Address {

    //ATRIBUTOS DE CLASE DIRECCIÓN
    private String street;
    private Integer postal_code;
    private String province;
    private String locality;


    //CONSTRUCTOR DE LA CLASE DIRECCIÓN
    public Address(String street, Integer postal_code, String province, String locality){
        this.street = street;
        this.postal_code =  postal_code;
        this.province = province;
        this.locality = locality;
    }


    //GETTERS DE LA CLASE DIRECCIÓN
    public String getStreet() { return street; }

    public Integer getPostal_code() { return postal_code; }

    public String getProvince() { return province; }

    public String getLocality() { return locality; }


    //SETTERS DE LA CLASE DIRECCIÓN
    public void setStreet(String street) { this.street = street; }

    public void setPostal_code(Integer postal_code) { this.postal_code = postal_code; }

    public void setProvince(String province) { this.province = province; }

    public void setLocality(String locality) { this.locality = locality; }
}


