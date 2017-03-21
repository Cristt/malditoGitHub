package Utilidades;

import static Utilidades.ConexionBD.conexion;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {
    //Variable GLOBAL = Fuera de los elementos de la clase. Tiene que ser declarada FUERA
    //Los OBJETOS O METODOS ESTATICOS son de LA CLASE, sus valores son compartidos por todos los objetos y metodos de esta clase
    public static Connection conexion = null;
    //POR CADA CLASE SOLO VA A HABER UNA CONEXION Y UN METODO QUE CONECTA
    public static Connection conectando() throws ClassNotFoundException, SQLException {

        // Cargar el driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        // Pedir una conexion (esto solo devuelve true / false)
        //conexion = DriverManager.getConnection("jdbc:sqlserver://192.168.1.110\\SQL2012EXPRESS_1;databaseName=Academia", "sa", "root");
        // Pedir una conexion (esto solo devuelve true / false)
        conexion = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS2012;databaseName=Academia", "sa", "root");

        // Especifica lo que devuelve si la conexion es o no nula, COMPROBACIÓN
        if (conexion != null) {
            // Driver Manager es el controlador general de todos los drivers
            DatabaseMetaData dm = conexion.getMetaData();

            System.out.println("Conexion establecida");
            System.out.println("Driver name" + dm.getDriverName());
            System.out.println("Driver version" + dm.getDriverVersion());
            System.out.println("Database name" + dm.getDatabaseProductName());

        }
        return conexion;
    }
    
    public void cerrarConexion() throws SQLException {
        conexion.close();
    }}
/**
    public void buscarPorNombre(String nombreBuscado) throws SQLException, ClassNotFoundException {

        conectando();
        String sql = "Select * from Profesor where Profesor=?";
        // Método con parametro
        PreparedStatement buscar = conexion.prepareStatement(sql);
        // El String que se recibe sustituye al primer interrogante, al ser un SELECT devuelve
        // un numero de resultados, que hay que recorrer
        buscar.setString(1, nombreBuscado);
        // Utilizamos EXECUTE QUERY, por que nos devuelve un numero de resultados
        ResultSet rs = buscar.executeQuery();

        // mientras tengamos resultados...
        while (rs.next()) {
            System.out.println("ID Profesor: " + rs.getString(1));
            System.out.println("Nombre profesor: " + rs.getString(2));
            System.out.println("Apellido profesor: " + rs.getString(3));
            System.out.println("Direccion profesor: " + rs.getString(4));
            System.out.println("Telefono profesor: " + rs.getString(5));
            System.out.println("Edad Profesor: " + rs.getString(6));
        }
        // cierra conexion (el preparedStatement y el resultSet)
        buscar.close();
        rs.close();
    }

    public void actualizarPorNombre(String nombreProfesor, int idProfesor) throws SQLException {
        String sql = "update profesor set nombreProfesor=? where idProfesor=?";
        PreparedStatement buscar = conexion.prepareStatement(sql);
        buscar.setString(1, nombreProfesor);
        buscar.setInt(2, idProfesor);
        // Solo para buscar una ejecucion (no conjunto de resultados),
        // el execute update solo devuelve el numero de filas afectadas
        int filasAfectadas = buscar.executeUpdate();
        System.out.println("Filas afectadas: " + filasAfectadas);
    }

    public void borrarRegistro(int idProfesor) throws SQLException {
        String sql = "delete from profesor where idProfesor=?";
        PreparedStatement buscar = conexion.prepareStatement(sql);
        buscar.setInt(1, idProfesor);
        // el execute update solo devuelve el numero de filas afectadas
        int filasAfectadas = buscar.executeUpdate();
        System.out.println("Filas afectadas: " + filasAfectadas);
    }

    public void insertarRegistro(String nombreProfesor, String apellidoProfesor, String direccionProfesor, int telefonoProfesor, int edadProfesor) throws SQLException {

        String sql = "insert into Profesor (nombreProfesor, apellidoProfesor, direccionProfesor, telefonoProfesor, edadProfesor) values (?,?,?,?,?)";
        PreparedStatement buscar = conexion.prepareStatement(sql);
        buscar.setString(1, nombreProfesor);
        buscar.setString(2, apellidoProfesor);
        buscar.setString(3, direccionProfesor);
        buscar.setInt(4, telefonoProfesor);
        buscar.setInt(5, edadProfesor);
        int filasAfectadas = buscar.executeUpdate();
        System.out.println("Filas afectadas: " + filasAfectadas);
    }

    public void listarProfesores() throws SQLException {
        String sql = "select * from Profesor";
//El STATEMENT es para consultas sin parametros
        Statement stm = null;
        stm = conexion.createStatement();
//Rellenamos la lista de profesores en un ResultSet (la consulta recorre la lista)
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            System.out.println("ID Profesor: " + rs.getString(1));
            System.out.println("Nombre profesor: " + rs.getString(2));
            System.out.println("Apellido profesor: " + rs.getString(3));
            System.out.println("Direccion profesor: " + rs.getString(4));
            System.out.println("Telefono profesor: " + rs.getString(5));
            System.out.println("Edad Profesor: " + rs.getString(6));

        }
        stm.close();
        rs.close();
    }

    public void cerrarConexion() throws SQLException {
        conexion.close();
    }
}

/**
 * **************************************************************************************************************
 */
//CARGAR EL DRIVER
/**
 * *
 * public Connection conectando(){
 *
 * try { Class.forName("org.sqlite.JDBC"); try { //PEDIMOS UNA CONEXION
 * conexion=DriverManager.getConnection("jdbc:sqlite:C:\\cursoDesarrolloWeb\\InstitutoPruebas.db",
 * "root", "root"); } catch (SQLException ex) {
 * Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex); } }
 * catch (ClassNotFoundException ex) {
 * Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
 *
 * }
 * if (conexion != null){ System.out.println("Conexion establecida"); } return
 * conexion; } ***
 */
/**
 * **
 * public Connection conectando(){
 *
 * try { Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); try {
 * //PEDIMOS UNA CONEXION
 * conexion=DriverManager.getConnection("jdbc:sqlite:C:\\localhost:1433;databaseName=Academia",
 * "root", "root"); } catch (SQLException ex) {
 * Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex); } }
 * catch (ClassNotFoundException ex) {
 * Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
 *
 * }
 * if (conexion != null){ System.out.println("Conexion establecida"); } return
 * conexion; }}
    *
 */
