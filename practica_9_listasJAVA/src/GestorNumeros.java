import java.util.ArrayList;

//CLASE GESTORNUMEROS:
public class GestorNumeros {

    //ATRIBUTOS DE LA CLASE GESTOR NUMEROS:
    private ArrayList<Integer> lista;

    //CONSTRUCTOR DE CLASE GESTORNUMEROS:
    public GestorNumeros() {
        this.lista = new ArrayList<>();
    }

    //GETTERS
    public ArrayList<Integer> getLista() {
        return this.lista;
    }


    //AGREGAR NÚMERO A UNA LISTA CON LIST (ARRAYLIST) y en el Main pondría: gN1.agregarNumero(número que quiera yo meter);
    public void agregarNumero(Integer numero){
        this.lista.add(numero);

    }


    public void mostrarNumero(){

        System.out.println("Aquí tienes los números de la lista: " + lista);
    }


    public void sumaNumeros(){
        int suma = 0;
        //FOREACH PARA RECORRER MI LISTA Y SUMAR LOS NÚMEROS DE ELLAS
        for (Integer e : lista){
            suma = suma + e;
        }
        System.out.println("La suma de la lista es: " + suma);
    }
}

//Sirve para mostrar la lista en orden original (de menor a mayor)
            //Collections.sort(lista);

        //Sirve para mostrar la lista (de números) de mayor a menos
            //Collections.sort(lista, Collections.reverseOrder());

