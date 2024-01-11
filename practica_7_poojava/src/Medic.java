import java.time.LocalDate;

//CLASE medico que extiende de persona
public class Medic extends People {
    //ATRIBUTOS de clase medico solo
    private Double salary;
    private LocalDate start_date;
    private Area area;


    //CONSTRUCTOR de clase medico y hereda los atributos de clase persona (lo que esta dentro de super)
    public Medic(String dni, String name, Integer age, String gender, double salary, LocalDate start_date, Area area){
        super(dni, name, age, gender);

        this.salary = salary;
        this.start_date = start_date;
        this.area = area;
    }


    //GETTERS de clase medico
    public Double getSalary() {
        return salary;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public Area getArea() {
        return area;
    }


    //SETTERS de clase medico
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public void setArea(Area area) {
        this.area = area;
    }

}
