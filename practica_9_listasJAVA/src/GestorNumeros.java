import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//CLASE GESTORNUMEROS:
public class GestorNumeros {

    //ATRIBUTOS DE LA CLASE GESTOR NUMEROS:
    private Integer lista;

    //CONSTRUCTOR DE CLASE GESTORNUMEROS:
    public GestorNumeros(Integer lista) {
        this.lista = lista;
    }

    //GETTER
    public Integer getLista() {
        return lista;
    }

    //SETTER
    public void setLista(Integer lista) {
        this.lista = lista;
    }

    //METODO PARA CREAR LISTA
    public void create_list(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe aquí el número que quieres añadir a tu lista: ");
        int numero = sc.nextInt();
        //CREAR LISTA EN JAVA
        List<Integer> lista = new ArrayList<Integer>();

        //Método para poder agregar números a mi lista
        lista.add(10);
        lista.add(20);
        lista.add(numero);

        //Sirve para mostrar la lista en orden original (de menor a mayor)
            //Collections.sort(lista);

        //Sirve para mostrar la lista (de números) de mayor a menos
            //Collections.sort(lista, Collections.reverseOrder());

        //FOREACH PARA RECORRER MI LISTA Y SUMAR LOS NÚMEROS DE ELLAS
        int suma = 0;
        for (Integer e : lista){
            suma = suma + e;
            System.out.println("Número de mi lista: " + e);
        }

        System.out.println("La suma de todos los números de mi lista: " + suma);

    }


}
