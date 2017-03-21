package EjemplosDao;

import Utilidades.ConexionBD;
import static Utilidades.ConexionBD.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoAlumno {

    public Connection conexionDaoAlumno() throws ClassNotFoundException, SQLException {
        ConexionBD.conexion = null;
        conexion = ConexionBD.conectando();
        if (conexion != null) {
            System.out.println("Conexion establecida");
        }
        return conexion;
    }
        //private Connection conexion=null;

    public void buscarPorNombre(String nombreBuscado) throws SQLException, ClassNotFoundException {
        
        //el PREPARED STATEMENT sólo es para consultas con parametros (?,?...) 
        //que variaran segun la peticion del usuario a la base de datos
        
        String sql = "Select * from Alumno where Alumno=?";
        // Método con parametro
        PreparedStatement buscar = conexion.prepareStatement(sql);
        // El String que se recibe sustituye al interrogante, al ser un SELECT devuelve
        // un numero de resultados, que hay que recorrer mediante el ResultSet
        buscar.setString(1, nombreBuscado);
        // Utilizamos EXECUTE QUERY, por que nos devuelve un numero de resultados
        ResultSet rs = buscar.executeQuery();
        // while (rs.next()= mientras tengamos resultados,pintame...
        while (rs.next()) {
            System.out.println("ID Alumno: " + rs.getString(1));
            System.out.println("Nombre Alumno: " + rs.getString(2));
            System.out.println("Apellido Alumno: " + rs.getString(3));
            System.out.println("Direccion Alumno: " + rs.getString(4));
            System.out.println("Telefono Alumno: " + rs.getString(5));
            System.out.println("Edad Alumno: " + rs.getString(6));
        }
        // cierra conexion (el preparedStatement y el resultSet)
        buscar.close();
        rs.close();
    }

    public void actualizarPorNombre(String nombreAlumno, int idAlumno) throws SQLException {
        String sql = "update Alumno set nombreAlumno=? where idAlumno=?";
        PreparedStatement buscar = conexion.prepareStatement(sql);
        buscar.setString(1, nombreAlumno);
        buscar.setInt(2, idAlumno);
        // Solo para buscar una ejecucion (no conjunto de resultados), comprobar el cambio en la BD
        // el execute update solo devuelve el numero de filas afectadas
        int filasAfectadas = buscar.executeUpdate();
        System.out.println("Filas afectadas: " + filasAfectadas);
    }

    public void borrarRegistro(int idAlumno) throws SQLException {
        String sql = "delete from Alumno where Alumno=?";
        PreparedStatement buscar = conexion.prepareStatement(sql);
        buscar.setInt(1, idAlumno);
        // el execute update solo devuelve el numero de filas afectadas
        int filasAfectadas = buscar.executeUpdate();
        System.out.println("Filas afectadas: " + filasAfectadas);
    }

    public void insertarRegistro(String nombreAlumno, String apellidoAlumno, String direccionAlumno, String telefonoAlumno, int edadAlumno) throws SQLException {

        String sql = "insert into Alumno (nombreAlumno, apellidoAlumno, direccionAlumno, telefonoAlumno, edadAlumno) values (?,?,?,?,?)";
        PreparedStatement buscar = conexion.prepareStatement(sql);
        buscar.setString(1, nombreAlumno);
        buscar.setString(2, apellidoAlumno);
        buscar.setString(3, direccionAlumno);
        buscar.setString(4, telefonoAlumno);
        buscar.setInt(5, edadAlumno);
        int filasAfectadas = buscar.executeUpdate();
        System.out.println("Filas afectadas: " + filasAfectadas);
    }

    public void listarAlumnos() throws SQLException {
        String sql = "select * from Alumno";
//El STATEMENT es para consultas sin parametros
        Statement stm = null;
        stm = conexion.createStatement();
//Rellenamos la lista de profesores en un ResultSet (la consulta recorre la lista)
        // si devuelve datos = execute query; si no devuelve resultados = execute update
        //(que solo devolvera cambios, filas afectadas)
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            System.out.println("ID Alumno: " + rs.getString(1));
            System.out.println("Nombre Alumno: " + rs.getString(2));
            System.out.println("Apellido Alumno: " + rs.getString(3));
            System.out.println("Direccion Alumno: " + rs.getString(4));
            System.out.println("Telefono Alumno: " + rs.getString(5));
            System.out.println("Edad Alumno: " + rs.getString(6));

        }
        stm.close();
        rs.close();
    }



}
