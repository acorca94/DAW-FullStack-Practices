public class Medic extends People {
    private Double salary;
    private String start_date;
    private String area;

    //CONSTRUCTOR DE CLASE MEDICO y hereda lo de clase persona (lo que esta dentro de super)
    public Medic(String dni, String name, Integer age, String gender, Double salary, String start_date, String area){
        super(dni, name, age, gender);

        this.salary = salary;
        this.start_date = start_date;
        this.area = area;
    }

    //GETTERS DE CLASE MEDICO


    public Double getSalary() {
        return salary;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getArea() {
        return area;
    }

    //SETTERS DE CLASE MEDICO
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
