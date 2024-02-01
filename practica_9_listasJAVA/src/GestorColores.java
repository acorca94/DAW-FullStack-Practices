import java.util.Set;
import java.util.HashSet;

public class GestorColores {

    //ATRIBUTO DE GESTORCOLORES
    private Set<String> colors;


    //CONSTRUCTOR DE GESTORCOLORES
    public GestorColores() {
        this.colors = new HashSet<>();
    }


    //GETTER DE GESTOR COLORES
    public Set<String> getColors() {
        return this.colors;
    }


    //AGREGAR COLOR CON SET (HASHSET)
    public void agregarColor(String nombre) {
        this.colors.add(nombre);
    }


    //MOSTRAR COLOR CON SET(HASHSET)
    public void mostrarColor() {
        System.out.println("Aquí tienes tus colores: " + colors);
    }


    //VERIFICAR SI EXISTE EL COLOR2 EN LA LISTA
    public void existeColor(String nombre) {
        if (colors.contains(nombre)) {
            System.out.println(nombre + " está en la lista.");
        }
        else {
            System.out.println(nombre + " no está en la lista");
        }
    }

}
