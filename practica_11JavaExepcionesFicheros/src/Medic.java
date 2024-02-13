import java.time.LocalDate;

//CLASE MEDICO
public class Medic {

    //ATRIBUTOS DE CLASE MÉDICO
    private String name;
    private int age;
    private String gender;
    private String dni;
    private Double salary;
    private LocalDate start_date;
    private Address address;


    //CONSTRUCTOR DE CLASE MEDICO
    public Medic(String name, int age, String gender, String dni, double salary, int year, int month, int day, Address address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dni = dni;
        this.salary = salary;
        this.start_date = LocalDate.of(year, month, day);
        this.address = address;
    }


    //GETTERS DE CLASE MEDICO
    public String getName() { return name; }

    public int getAge() {
        return age;
    }

    public String getGender(){
        return gender;
    }

    public String getDni() {
        return dni;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public Address getAddress() {
        return address;
    }


    //SETTERS DE CLASE MEDICO
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

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
