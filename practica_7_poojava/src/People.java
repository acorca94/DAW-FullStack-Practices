//CLASE
public class People {

    //ATRIBUTOS DE CLASE
    private String dni;
    private String name;
    private Integer age;
    private String gender;

    //CONSTRUCTOR DE PEOPLE
    public People(String dni, String name, Integer age, String gender){
        this.dni = dni;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    //GETTERS DE PEOPLE
    public String getDni(){
        return this.dni;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    public String getGender(){
        return this.gender;
    }


    //SETTERS DE PEOPLE

    public void setDni(String dni){ this.dni = dni; }

    public void setName(String name){ this.name = name; }

    public void setAge(Integer age){ this.age = age; }

    public void setGender(String gender){ this.gender = gender; }

}
