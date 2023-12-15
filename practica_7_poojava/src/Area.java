//CLASE area
public class Area {
    //ATRIBUTOS de clase area
    private String name;
    private String identification;
    private int floor;
    private String name_hospital;
    private Integer numbers_medic;


    //CONSTRUCTOR de clase area
    public Area(String name, String identification, int floor, String name_hospital, Integer numbers_medic){
        this.name = name;
        this.identification = identification;
        this.floor = floor;
        this.name_hospital = name_hospital;
        this.numbers_medic = numbers_medic;
    }


    //GETTERS de clase area
    public String getName() { return name; }

    public String getIdentification() { return identification; }

    public int getFloor() { return floor; }

    public String getName_hospital() { return name_hospital; }

    public Integer getNumbers_medic() { return numbers_medic; }


    //SETTERS de clase area
    public void setName(String name) { this.name = name; }

    public void setIdentification(String identification) { this.identification = identification; }

    public void setFloor(int floor) { this.floor = floor; }

    public void setName_hospital(String name_hospital) { this.name_hospital = name_hospital; }

    public void setNumbers_medic(Integer numbers_medic) { this.numbers_medic = numbers_medic; }
}
