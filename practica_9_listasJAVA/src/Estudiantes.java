public class Estudiantes {
    private String name;
    private Integer ID;

    //CONSTRUCTOR
    public Estudiantes(String name, Integer ID) {
        this.name = name;
        this.ID = ID;
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getID() {
        return ID;
    }

    //SETTERS
    public void setID(Integer ID) {
        this.ID = ID;
    }

}

