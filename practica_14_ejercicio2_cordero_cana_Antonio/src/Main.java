import java.sql.*;
import java.util.Scanner;
import com.db4o.*;

public class Main {
    public static void main(String[] args) {
        // Conexión a la base de datos
        Scanner sc = new Scanner(System.in);
        String URL = "jdbc:mysql://localhost:3306/";
        String USER = "root";
        String PASS = "1234";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            // Crear la tabla Pilotos si no existe
            PreparedStatement createTable = conn.prepareStatement("CREATE TABLE IF NOT EXISTS sakila.Pilotos (nombre VARCHAR(50), " +
                    "apellidos VARCHAR(50), nacionalidad VARCHAR(50), puntos INT)");
            createTable.executeUpdate();

            System.out.println("Nombre del piloto: ");
            String name = sc.nextLine();
            System.out.println("Apellido del piloto: ");
            String surname = sc.nextLine();
            System.out.println("Nacionalidad del piloto: ");
            String nationality = sc.nextLine();
            System.out.println("Puntos del piloto: ");
            int points = sc.nextInt();
            // Insertar un piloto en la tabla
            Piloto piloto = new Piloto(name, surname, nationality, points);
            PreparedStatement insertPiloto = conn.prepareStatement("INSERT INTO sakila.Pilotos VALUES (?, ?, ?, ?)");
            insertPiloto.setString(1, piloto.getNombre());
            insertPiloto.setString(2, piloto.getApellidos());
            insertPiloto.setString(3, piloto.getNacionalidad());
            insertPiloto.setInt(4, piloto.getPuntos());
            insertPiloto.executeUpdate();

            // Leer los pilotos de la tabla
            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM sakila.Pilotos");
            while(resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String apellidos = resultSet.getString("apellidos");
                String nacionalidad = resultSet.getString("nacionalidad");
                int puntos = resultSet.getInt("puntos");
                Piloto pilotoLeido = new Piloto(nombre, apellidos, nacionalidad, puntos);
                System.out.println(pilotoLeido.getNombre() + " " + pilotoLeido.getApellidos() + " - Nacionalidad: " + pilotoLeido.getNacionalidad() + " - Puntos: " + pilotoLeido.getPuntos());
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
