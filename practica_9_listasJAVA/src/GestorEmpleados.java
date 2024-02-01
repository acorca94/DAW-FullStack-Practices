import java.util.HashMap;
import java.util.Map;

public class GestorEmpleados {
    private Map<String, Double> mapa;

    //CONSTRUCTOR
    public GestorEmpleados() {
        this.mapa = new HashMap<>();
    }

    //GETTER
    public Map<String, Double> getMapa() {
        return this.mapa;
    }


    //AGREGAR PERSONA CON MAP (HASHMAP)
    public void agregarEmpleado(String name, Double salary) {
        this.mapa.put(name, salary);
    }

    //MOSTRAR PERSONA CON MAP(HASHMAP)
    public void mostrarEmpleado(String nombre) {
        Double salary = this.mapa.get(nombre);
        System.out.println("Nombre: " + nombre + "\n" +
                "Salario: " + salary);
    }

    public void existeEmpleado(String nombre) {
        if (mapa.containsKey(nombre)) {
            System.out.println(nombre + " está en la lista.");
        }
        else {
            System.out.println(nombre + " no está en la lista");
        }
    }
}
