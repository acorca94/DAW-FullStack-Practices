import java.sql.*;
import java.util.Scanner;


public class Ejercicio_1 {

    ////////PARA CONECTAR LA BASE DE DATOS////////
    Scanner sc = new Scanner(System.in);
    String URL = "jdbc:mysql://localhost:3306/";
    String USER = "root";
    String PASS = "1234";
    Connection conn = null;
    Statement stmt = null;
    /////////////// HASTA AQUI ///////////////////

    int filas_afectadas = -1;

    String nameBBDD;


    /////////CREACIÓN DE UNA BASE DE DATOS/////////
    public void CreateBBDD() {
        System.out.println("Estás dentro de la creación de Base de Datos: ");
        //Aquí podemos llamar la base de datos por teclado.
        System.out.println("Nombre de tu base de datos: ");
        nameBBDD = sc.nextLine();
        String sentencia1 = "CREATE DATABASE " + nameBBDD;
        System.out.println(" >> Tu Base de Datos se llama -> " + sentencia1);

        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            stmt.executeUpdate(sentencia1);

            stmt.close();

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }


    /////////CREACIÓN DE LA TABLA VEHÍCULO/////////
    public void CreateTableV() {
        System.out.println("Tabla creada con éxito.");
        String sentenciav = "Create table " + nameBBDD + ".vehiculo (" +
                "id int auto_increment primary key not null," +
                "marca varchar(40) not null," +
                "modelo varchar(30) not null," +
                "año int not null," +
                "tipo enum('coche', 'motocicleta') not null" +
                ");";

        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            stmt.executeUpdate(sentenciav);
            stmt.close();

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }


    ////////CREACIÓN DE LA TABLA MOTOCICLETA/////////
    public void CreateTableM() {
        System.out.println("Tabla creada con éxito.");
        String sentenciam = "Create table " + nameBBDD + ".motocicleta (" +
                "id int auto_increment primary key not null," +
                "cilindrada int not null," +
                "codigo_vehiculo int not null," +
                "foreign key (codigo_vehiculo) references vehiculo(id)" +
                ");";

        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            stmt.executeUpdate(sentenciam);
            stmt.close();

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }


    //////////CREACIÓN DE LA TABLA COCHE//////////
    public void CreateTableC() {
        System.out.println("Tabla creada con éxito.");

        String sentenciac = "Create table " + nameBBDD + ".coche (" +
                "id int auto_increment primary key not null," +
                "num_puertas int not null," +
                "color varchar(50) not null," +
                "codigo_coche int not null," +
                "foreign key (codigo_coche) references vehiculo(id)" +
                ");";

        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            stmt.executeUpdate(sentenciac);
            stmt.close();

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }


    //////// INSERTAR VALORES DE LA TABLA VEHÍCULO ////////
    public void InsertValueV() {
        System.out.println("Estás dentro de la inserción de los valores de los campos: ");
        System.out.println("Introduce los datos de tu vehículo: ");
        System.out.println("Introduce la marca: ");
        String brand1 = sc.next();
        System.out.println("Introduce el modelo: ");
        String model = sc.next();
        System.out.println("Introduce el año: ");
        int year = sc.nextInt();
        System.out.println("Introduce el tipo (motocicleta o coche): ");
        String type1 = sc.next();
        String sentenciainsertV = "INSERT INTO " + nameBBDD + ".vehiculo(marca, modelo, año, tipo) " +
                "VALUES ('" + brand1 + "', '" + model + "', " + year + ", '" + type1 + "');";

        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            filas_afectadas = stmt.executeUpdate(sentenciainsertV);
            System.out.println(" >> Tus valores se han introducido correctamente. " + filas_afectadas + " fila(s) introducida(s).");
            stmt.close();

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }


    ///////// INSERTAR VALORES DE LA TABLA MOTOCICLETA ////////
    public void InsertValueM() {

        System.out.println("Estás dentro de la inserción de los valores de los campos: ");
        System.out.println("Introduce los datos de tu Motocicleta: ");
        System.out.println("Introduce la cilindrada: ");
        int cubicCapacity = sc.nextInt();
        System.out.println("Introduce el codigo de la foreign key: ");
        int code = sc.nextInt();

        String sentenciainsertM = "INSERT INTO " + nameBBDD + ".motocicleta(cilindrada, codigo_vehiculo) " +
                "VALUES (" + cubicCapacity + ", " + code + ");";

        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            filas_afectadas = stmt.executeUpdate(sentenciainsertM);
            System.out.println(" >> Tus valores se han introducido correctamente. " + filas_afectadas + " fila(s) introducida(s).");
            stmt.close();

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }


    ////////// INSERTAR VALORES DE LA TABLA COCHE ////////
    public void InsertValueC() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Estás dentro de la inserción de los valores de los campos: ");
        System.out.println("| Introduce los datos de tu Coche | ");
        System.out.println("Introduce el número de puertas: ");
        int number_doors = sc.nextInt();
        System.out.println("Introduce el color: ");
        String color = sc.nextLine();
        System.out.println("Introduce el codigo: ");
        int code = sc.nextInt();
        String sentenciainsertC = "INSERT INTO " + nameBBDD + ".coche(num_puertas, color, codigo_coche) " +
                "VALUES (" + number_doors + ", '" + color + "', " + code + ");";

        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            filas_afectadas = stmt.executeUpdate(sentenciainsertC);
            System.out.println(" >> Tus valores se han introducido correctamente. " + filas_afectadas + " fila(s) introducida(s).");
            stmt.close();

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }


    //////// MOSTRAR LOS DATOS DE VEHICULO ////////
    public void ShowdataV() {
        System.out.println("Aquí tienes los datos de tu vehículo: ");

        try {

            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();

            //SIRVE PARA HACER UN SELECT (CONSULTA).
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + nameBBDD + ".vehiculo");
            System.out.println("Resultados de la base de datos: ");
            while (rs.next()){
                System.out.println("ID: " + rs.getInt("id") + " -> Marca: " +
                        rs.getString("marca") + " -> Modelo: " + rs.getString("modelo") +
                        " -> Año: " + rs.getInt("año") + " -> Tipo: " + rs.getString("tipo"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    //////// MOSTRAR LOS DATOS DE MOTOCICLETA Y COCHE ////////
    public void ShowdataMyC() {


        try {
            // TODO ESTE CÓDIGO SIRVE  PARA CREAR UN SELECT (CONSULTA)
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();

            //DATOS DE LA MOTOCICLETA
            System.out.println("Aquí tienes los datos de tu motocicleta: ");
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM " + nameBBDD + ".vehiculo" +
                    " INNER JOIN " + nameBBDD + ".motocicleta" + " ON vehiculo.id = motocicleta.codigo_vehiculo");
            while (rs1.next()){
                System.out.println(" -> Marca: " + rs1.getString("marca") +
                        " -> Modelo: " + rs1.getString("Modelo") +
                        " -> Tipo: " + rs1.getString("tipo") +
                        " ->ID: " + rs1.getInt("id") +
                        " -> Cilindrada: " + rs1.getInt("cilindrada") +
                        " -> Clave foránea: " + rs1.getInt("codigo_vehiculo"));
            }

            //DATOS DEL COCHE
            System.out.println("Aquí tienes los datos de tu coche: ");
            ResultSet rs2 = stmt.executeQuery("SELECT * FROM " + nameBBDD + ".vehiculo" +
                    " INNER JOIN " + nameBBDD + ".coche" + " ON vehiculo.id = coche.codigo_coche");
            while (rs2.next()){
                System.out.println(" -> Marca: " + rs2.getString("marca") +
                        " -> Modelo: " + rs2.getString("Modelo") +
                        " -> Tipo: " + rs2.getString("tipo") +
                        " ->ID: " + rs2.getInt("id") +
                        " -> Número de puertas: " + rs2.getInt("num_puertas") +
                        " -> Color: " + rs2.getString("color") +
                        " -> Clave foránea: " + rs2.getInt("codigo_coche"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    // ELIMINAR (EN ESTE CASO UNA FILA) DE UNA TABLA
    public void Deletedata() {
        System.out.println("Hola, has accedido a la opción de eliminar la fila de una tabla. A continuación, escoge entre: \n" +
                "1. Tabla motocicleta.\n" +
                "2. Tabla coche.\n");
        System.out.println("Escribe el número de la tabla: ");
        int numberoption = sc.nextInt();
        if (numberoption == 1){
            try {

                conn = DriverManager.getConnection(URL, USER, PASS);
                stmt = conn.createStatement();

                String consulta1 = "DELETE FROM " + nameBBDD + ".motocicleta" +  " WHERE id=1";
                filas_afectadas = stmt.executeUpdate(consulta1);
                System.out.println(filas_afectadas + " fila(s) eliminada(s) de tu tabla motocicleta.");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (numberoption == 2) {
            try {

                conn = DriverManager.getConnection(URL, USER, PASS);
                stmt = conn.createStatement();

                String consulta2 = "DELETE FROM " + nameBBDD + ".coche" +  " WHERE id=1";
                filas_afectadas = stmt.executeUpdate(consulta2);
                System.out.println(filas_afectadas + " fila(s) eliminada(s) de tu tabla coche.");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("Opción no existente.");
        }

    }
}
