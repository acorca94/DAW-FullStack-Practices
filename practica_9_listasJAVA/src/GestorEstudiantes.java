import java.util.Set;
import java.util.HashSet;


public class GestorEstudiantes {

    //ATRIBUTO DE CLASE GestorEstudiantes con el tipo de clase Estudiantes
    private Set<Estudiantes> student;

    //CONSTRUCTOR
    public GestorEstudiantes() {
        this.student = new HashSet<>();
    }


    //GETTERS
    public Set<Estudiantes> getStudent() {
        return student;
    }


    //AGREGAR Estudiante CON SET (HASHSET)
    public void agregarEstudiante(Estudiantes nombre) {
        this.student.add(nombre);
    }


    //MOSTRAR ESTUDIANTE(S) CON SET(HASHSET)
    public void mostrarEstudiante(Estudiantes student) {
        System.out.println("Aquí esta el estudiante: nombre: " + student.getName() + "; id: " +student.getID());
    }


    //VERIFICAR SI EXISTE EL ESTUDIANTE EN LA LISTA
    public void existeEstudiante(int id) {
        for (Estudiantes e : student){
            if (e.getID() == id) {
                System.out.println(e.getID() + " está en la lista.");
                return;
            }
        }
        System.out.println(id + " no está en la lista");

    }

}
