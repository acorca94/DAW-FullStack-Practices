import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GestorPersonas {

    private String name;
    private Integer age;

    public GestorPersonas(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
