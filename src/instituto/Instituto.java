
package instituto;

import EjemplosDao.DaoAlumno;
import GestionInstituto.Asignatura;
import GestionInstituto.Curso;
import Humanos.Alumno;
import EjemplosDao.DaoProfesor;
import Humanos.Persona;
import Humanos.Profesor;
import Utilidades.ConexionBD;
import Utilidades.Imprime;
import Utilidades.Nivelformativo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Instituto  {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        /*
        Alumno alumno1=new Alumno();
        alumno1.setNombre("Rodrigo");
        alumno1.setApellidos("Perez");
        alumno1.setDireccion("Zaragoza");
        alumno1.setTelefono("146");
        alumno1.setEdad(28);
        
        DaoAlumno daoAlumno=new DaoAlumno();
        daoAlumno.conexionDaoAlumno();
        daoAlumno.insertarRegistro(alumno1.getNombre(),alumno1.getApellidos(),alumno1.getDireccion(),alumno1.getTelefono(),alumno1.getEdad());
        */
        
        //DaoProfesor daoProfesor=new DaoProfesor();
        //daoProfesor.conexionDaoProfesor();
        //ConexionBD conector=new ConexionBD();
        //ConexionBD.conectando ();
        //conector.conectando();
        //conector.buscarPorNombre("Cristina");
        //conector.actualizarPorNombre("Otis", 3);
        //conector.borrarRegistro(4);
        //conector.insertarRegistro("Miguel", "Serrano", "Zaragoza", 32, 40);
        //conector.listarProfesores();
    }
    
}

            
            /**try{
             * conectar.conectando();
             * 
             * 
             * }
             * 
             * /*ConexionBD conectar=new ConexionBD();
             * conectar.conectar();
             * /***
             * Asignatura asignatura1= new Asignatura("Java");
             * Asignatura asignatura2= new Asignatura("SQL");
             * Asignatura asignatura3= new Asignatura("JEE");
             * 
             * 
             * /*********
             * Profesor profesor1= (Profesor) new Persona("NOMBRE 1", "APELLIDOS1", 100);//POLIMORFISMO
             * Alumno alumno1= (Alumno) new Persona("Nombre", "Apellidos", 102);
             * Imprime profesor2= new Profesor();
             * Persona profesor3=new Profesor();
             * Imprime alumno2= new Alumno();
             *********/
            /**
             * //LISTA ASIGNATURAS
             * ArrayList<Asignatura> listaAsignatura= new ArrayList<>();
             * listaAsignatura.add(asignatura3);
             * listaAsignatura.add(asignatura2);
             * listaAsignatura.add(asignatura1);
             * 
             * //PROFES
             * Profesor profesor1=new Profesor();
             * profesor1.setNombre("Manolo");
             * profesor1.setListaProfesorAsignatura(listaAsignatura);
             * profesor1.setnF(Nivelformativo.TITULADO_SUPERIOR);
             * 
             * Profesor profesor2=new Profesor();
             * profesor2.setNombre("Aurelio");
             * profesor2.setListaProfesorAsignatura(listaAsignatura);
             * profesor2.setnF(Nivelformativo.TITULADO_MEDIO);
             * 
             * Profesor profesor3=new Profesor();
             * profesor3.setNombre("Avelino");
             * profesor3.setListaProfesorAsignatura(listaAsignatura);
             * profesor3.setnF(Nivelformativo.BACHILLERATO);
             * 
             * //LISTA DE PROFES
             * ArrayList<Profesor>listaProfesor= new ArrayList<>();
             * listaProfesor.add(profesor3);
             * listaProfesor.add(profesor2);
             * listaProfesor.add(profesor1);
             * 
             * //ALUMNOS
             * Alumno alumno1=new Alumno("Cristina", "Ballestero", 22, "FechaALTA", listaProfesor);
             * Alumno alumno2=new Alumno("Cristian", "Ballestero", 23, "FechaALTA", listaProfesor);
             * Alumno alumno3=new Alumno("Cristina", "Bernier", 24, "FechaALTA", listaProfesor);
             * 
             * //LISTA ALUMNOS
             * ArrayList<Alumno> listaAlumno=new ArrayList<>();
             * listaAlumno.add(alumno3);
             * listaAlumno.add(alumno2);
             * listaAlumno.add(alumno1);
             * 
             * 
             * //CURSO
             * Curso curso1=new Curso();
             * curso1.setNombreCurso("desarrollo web");
             * curso1.setFechaInicio("23 enero");
             * curso1.setFechaFin("Queda mucho aun");
             * curso1.setLista_cursoAlumno(listaAlumno);
             * curso1.setLista_cursoMateria(listaAsignatura);
             * curso1.setLista_cursoProfesor(listaProfesor);
             * 
             * /***
             * curso1.imprimeCursoCurso();
             * curso1.imprimeProfesorAsignatura();
             * curso1.imprimealumnoProfesor();
             * curso1.imprimecursoAlumno();
             * curso1.imprimecursoMateria();
             * curso1.imprimecursoProfesor();
             ****/
            /**
             * curso1.imprimeAll();
             * 
             **/