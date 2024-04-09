import java.sql.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String URL = "jdbc:mysql://localhost:3306/";
        String USER = "root";
        //LA CONTRASEÑA SERA DE UN TIPO U OTRO DEPENDIENDO SI ES SOLO NÚMEROS O NÚMEROS Y LETRAS (AUNQUE PODRÍA DAR ERROR ABAJO EN EL CONN DEL TRY-CATCH
        String PASS = "1234";
        Connection conn = null;
        Statement stmt = null;

        try{
            //Paso 1: CONECTAR CON MYSQL
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            stmt.close();
        } catch (SQLException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}