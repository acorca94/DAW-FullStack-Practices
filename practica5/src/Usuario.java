//Declaramos aqui la class, que en este caso es usuario

public class Usuario{

    //Estos son los atributos de clase usuario
    private String name;
    private String surname;
    private Integer postalCode;
    private String address;
    private String email;
    private String password;


    //Constructor para inicializar las variables de class
    public Usuario(String name, String surname, Integer postalCode, String address, String email, String password){
        //Aquí this sirve para diferenciar con las variables de class. No tiene mas valor allá.
        this.name = name;
        this.surname = surname;
        this.postalCode = postalCode;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    //Get sirve para devolvernos la variable. En este caso sería la variable Name.
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    //Set sirve para modificar la variable. En este caso la variable Name.
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //El toString hay que llamarlo de alguna forma y en este caso le ponemos A (nunca números). Es para tener todas las variables aquí recogida y en el orden que yo quiera
    public String toStringA(Usuario us){
        return us.getName() + " " + us.getSurname() + " " + us.getPostalCode() + " " + getAddress() + " " + getEmail() + " " + getPassword();
    }
}
