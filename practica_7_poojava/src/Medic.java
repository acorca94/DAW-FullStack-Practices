public class Medic extends People {
    private Integer salary;
    private String start_date;
    private String area;

    public Medic(String dni, String name, Integer age, String gender, Integer salary, String start_date, String area){
        super(dni, name, age, gender);

        this.salary = salary;
        this.start_date = start_date;
        this.area = area;
    }

}
