import java.util.Map;
import java.util.HashMap;

public class GestorPersonas {

    private Map<String, Integer> map;

    //CONSTRUCTOR
    public GestorPersonas() {

        this.map = new HashMap<>(Map.of("Antonio", 29));
    }

    //GETTER
    public Map<String, Integer> getMap() {
        return this.map;
    }


    //AGREGAR PERSONA CON MAP (HASHMAP)
    public void agregarPersona(String nombre, Integer edad) {
        this.map.put(nombre, edad);
    }

    //MOSTRAR PERSONA CON MAP(HASHMAP)
    public void mostrarPersona(String nombre) {
        Integer edad = this.map.get(nombre);
        System.out.println("Nombre: " + nombre + "\n" +
                "Edad: " + edad);
    }

    public void existePersona(String nombre) {
        if (map.containsKey(nombre)) {
            System.out.println(nombre + " está en la lista.");
        }
        else {
            System.out.println(nombre + " no está en la lista");
        }
    }
}
