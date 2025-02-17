import com.db4o.*;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        ObjectContainer db = null;

        try {

            //ABRIR MI BBDD
                db = Db4o.openFile("nombreBBDD.db4o");
                System.out.println("Se ha realizado la conexión a la base de datos.");

            //CREACIÓN DE OBJETO PERSONA
                Persona persona1 = new Persona("Carlos", "Diaz", "Morales", 24);
                Persona persona2 = new Persona("Antoñito", "Ramirez", "Garcia", 19);

            //SIRVE PARA GUARDAR PERSONA1 EN LA BASE DE DATOS
                db.store(persona1);
                db.store(persona2);

            //SIRVE PARA HACER CONSULTA
                ObjectSet persona1consulta = db.queryByExample(persona1);
                ObjectSet persona2consulta = db.queryByExample(persona2);
                System.out.println(persona1consulta);
                System.out.println(persona2consulta);

            //SIRVE PARA MODIFICAR DATOS DE CLASE PERSONA Y NECESITAMOS HACER ANTES LO QUE ESTA ARRIBA DE ESTA LINEA
                Persona personaA = (Persona) persona1consulta.next();
                personaA.setEdad(25);
                db.store(personaA);
                System.out.println("Aqui tienes tu dato(s) modificado(s) -> " + persona1consulta);

            //Sirve para cambiar dato a todos los objetos creados de mi objeto persona2 (en este caso).
                do {
                    Persona personaB = (Persona) persona2consulta.next();
                    personaB.setEdad(100);
                    db.store(personaB);
                }while (persona2consulta.hasNext());
                System.out.println("\n" + "Aqui tienes tu(s) dato(s) modificado(s) -> " + persona2consulta);

            //Estoy probando
                for (int i = 0; i<=persona2consulta.size(); i++){
                    persona2consulta.hasNext();
                }

            //SIRVE PARA ELIMINAR TODOS LAS PERSONAS CREADAS COMO PERSONA1. ES DECIR, SI HAY 8 CARLOS, PUES ME LOS BORRA
                while (persona1consulta.hasNext()){
                    personaA = (Persona) persona1consulta.next();
                    db.delete(personaA);
                }

            System.out.println("Aqui tienes tu(s) dato(s) borrado(s) -> " + persona1consulta);

        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }finally {
            db.commit();
            db.close();
        }
    }
}