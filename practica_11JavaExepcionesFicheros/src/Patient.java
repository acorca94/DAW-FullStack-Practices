
//CLASE PACIENTE
public class Patient {
    //ATRIBUTOS DE CLASE PACIENTE
    private String name;
    private int age;
    private String gender;
    private String dni;
    private Address address;


    //CONSTRUCTOR DE CLASE PACIENTE
    public Patient(String name, int age, String gender, String dni, Address address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dni = dni;
        this.address = address;
    }


    //GETTERS DE CLASE PACIENTE
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender(){
        return gender;
    }

    public String getDni() {
        return dni;
    }

    public Address getAddress() {
        return address;
    }


    //SETTERS DE CLASE PACIENTE
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
