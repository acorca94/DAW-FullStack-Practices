import java.sql.*;
public class Main {
    public static void main(String[] args) {

        String URL = "jdbc:mysql://localhost:3306/";
        String USER = "root";
        //LA CONTRASEÑA SERA DE UN TIPO U OTRO DEPENDIENDO SI ES SOLO NÚMEROS O NÚMEROS Y LETRAS (AUNQUE PODRÍA DAR ERROR ABAJO EN EL CONN DEL TRY-CATCH
        String PASS = "1234";
        Connection conn = null;
        Statement stmt = null;

        int filas_afectadas = -1;
        //String consulta = "INSERT INTO sakila.actor(actor_id, first_name, last_name) VALUES('201', 'Antonio', 'Cordero')";
        //String consulta1 = "DELETE FROM sakila.actor WHERE actor_id='201'";

        try{
            //Paso 1: CONECTAR CON MYSQL
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();

            //Seleccionamos base de dato
            ResultSet rs = stmt.executeQuery("SELECT * FROM sakila.actor");
            //Otra forma de hacerlo sería asi:
                //String consulta = "SELECT * FROM sakila.actor";
                //ResultSet rs = stmt.executeQuery(consulta);
            /*1. Ejecutar una consulta SQL. SIRVE PARA HACER UN SELECT
            System.out.println("Resultados de la base de datos: ");
            //La misma funcion que for pero con while:
            while (rs.next()){
                System.out.println("ID: " + rs.getInt("actor_id") + " -> VALOR: " + rs.getString("first_name"));
            }
            */

            //Con esto recorremos el tamaño entero de la variable rs e
            //imprimimos todos los id y valor de la tabla que se a seleccionado. Arriba es lo mismo pero con un while
            /*for (i=0; i<rs.size();i++) {
                System.out.println("ID: " + rs.getInt("id") + ", Valor: " +
                        rs.getString("valor"));
            }
            */

            /*2. Ejecutar una consulta SQL. SIRVE PARA INSERTAR VALORES A LOS CAMPOS (MÁS ARRIBA HAY COSAS QUE TAMBIÉN DEBE USARSE)
            stmt = conn.createStatement();
            filas_afectadas = stmt.executeUpdate(consulta);
            System.out.println(filas_afectadas + " fila(s) insertada(s).");
            */

            /*3. Eliminar un campo de una tabla
            stmt = conn.createStatement();
            filas_afectadas = stmt.executeUpdate(consulta1);
            System.out.println(filas_afectadas + " fila(s) insertada(s).");
            stmt.close();
            */

            /*4. Crear tabla Casa
            stmt.executeUpdate("Create table sakila.Casa (" +
                    "Id int primary key," +
                    "Puertas int," +
                    "Direccion varchar(100) not null" +
                    ")");
            rs.close();
            */

            /*Esto se utiliza para cerrar la base de datos y/o la conexión
            rs.close();
            stmt.close();
            */

        } catch (SQLException e){
            //Este te dice una linea de error
            System.out.println("ERROR: " + e.getMessage());
            //Este te explica el error mas completo
                //e.printStackTrace();
        }
    }
}