import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ejercicio_1 {
    String URL = "jdbc:mysql://localhost:3306/";
    String USER = "root";
    String PASS = "1234";
    Connection conn = null;
    Statement stmt = null;
    int filas_afectadas = -1;

    public void CreateBBDD() {
        System.out.println("Estás dentro de la creación de Base de Datos: ");
        //Aquí podemos llamar la base de datos desde aqui directamente o por teclado. En este caso nos la pide directamente dentro de la variable
        String sentencia1 = "CREATE DATABASE tema17";
        System.out.println(" >> Tu Base de Datos se llama -> tema17");
        //PARA ELIMINAR UNA BASE DE DATOS
        //String sentenciadelete = "Drop database inmobiliario";

        try{
            //CONECTAR CON LA BBDD
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            //OTRA FORMA DE EJECUTAR UNA SENTENCIA SERÍA:
                //ResultSet rs = stmt.executeQuery("CREATE DATABASE tema17");
            //SIRVE PARA EJECUTAR LA SENTENCIA DECLARADA MAS ARRIBA FUERA DEL TRY-CATCH
            stmt.executeUpdate(sentencia1);
            //PARA ELIMINAR UNA BASE DE DATOS
            //stmt.executeUpdate(sentenciadelete);
            stmt.close();

        }catch (SQLException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void CreateTable() {
        System.out.println("Estás dentro de la creación de la tabla vivienda: ");
        String sentenciav = "Create table tema17.Vivienda (" +
                "Id int primary key," +
                "Direccion varchar(100)," +
                "Numero_habitaciones int," +
                "Precio double" +
                ");";
        String sentenciac = "Create table tema17.Chalet (" +
                "Id int primary key," +
                "Jardin boolean," +
                "foreign key (codigo_) references Vivienda(Id)" +
                ");";

        System.out.println(" >> Tu tabla se llama vivienda.");

        try{
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            stmt.executeUpdate(sentenciav);
            stmt.executeUpdate(sentenciac);
            stmt.close();

        }catch (SQLException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void InsertValueV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Estás dentro de la inserción de los valores de los campos: ");
        System.out.println("Introduce los datos de tu vivienda: ");
        System.out.println("Introduce el ID: ");
        int id = sc.nextInt();
        System.out.println("Introduce la dirección: ");
        String address = sc.next();
        System.out.println("Introduce el número de habitaciones: ");
        int nh = sc.nextInt();
        System.out.println("Introduce el precio de la vivienda: ");
        double price = sc.nextDouble();
        String sentencia1 = "INSERT INTO tema17.vivienda(Id, Direccion, Numero_habitaciones, Precio) VALUES ("+ id +", "+ address +", "+ nh +", "+ price +"));";



        try{
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            filas_afectadas = stmt.executeUpdate(sentencia1);
            System.out.println(" >> Tus valores se han introducido correctamente " + filas_afectadas + "fila(s) introducida(s).");
            stmt.close();

        }catch (SQLException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void InsertValueC() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Estás dentro de la inserción de los valores de los campos: ");
        System.out.println("Introduce los datos de tu chalet: ");
        System.out.println("Introduce el ID: ");
        int id = sc.nextInt();
        System.out.println("Introduce si tiene jardin: ");
        String jardin = sc.nextLine();
        String sentencia1 = "INSERT INTO tema17.chalet(Id, Jardin) VALUES("+ id +", "+ jardin +");";



        try{
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            filas_afectadas = stmt.executeUpdate(sentencia1);
            System.out.println(" >> Tus valores se han introducido correctamente " + filas_afectadas + "fila(s) introducida(s).");
            stmt.close();

        }catch (SQLException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void ObtainingData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola! Bienvenido al menú del ejercicio 1." + "\n" +
                "Debes introducir números hasta que la suma dé 1000");
    }

    public void UpdateData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola! Bienvenido al menú del ejercicio 1." + "\n" +
                "Debes introducir números hasta que la suma dé 1000");
    }
}
