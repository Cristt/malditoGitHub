
package EjemplosDao;

import Utilidades.ConexionBD;
import static Utilidades.ConexionBD.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Los DAO solo trabajan con la base de datos. operacion CRUD (Create, Read, Update y Delete)
public class DaoProfesor {
    
        public Connection conexionDaoProfesor() throws ClassNotFoundException, SQLException{
            ConexionBD.conexion=null;
            conexion=ConexionBD.conectando();
            if(conexion!=null){
                System.out.println("Conexion establecida");
            }
            return conexion;
        }
        //private Connection conexion=null;
 
        public void buscarPorNombre(String nombreBuscado) throws SQLException, ClassNotFoundException {

        String sql = "Select * from Profesor where Profesor=?";
        // Método con parametro
        PreparedStatement buscar = conexion.prepareStatement(sql);
        // El String que se recibe sustituye al primer interrogante, al ser un SELECT devuelve
        // un numero de resultados, que hay que recorrer
        buscar.setString(1, nombreBuscado);
        // Utilizamos EXECUTE QUERY, por que nos devuelve un numero de resultados
        ResultSet rs = buscar.executeQuery();
        // while (rs.next()= mientras tengamos resultados,pintame...
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
