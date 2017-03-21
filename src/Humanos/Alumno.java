
package Humanos;

import java.util.ArrayList;


public class Alumno extends Persona implements Utilidades.Imprime{
    
    private int idAlumno;
    private String fechaAlta;
    //Establece relacion alumnos - profesores
    public ArrayList<Profesor> Lista_alumnoProfesor;
    private String direccion;
    private String telefono; 

    public Alumno(String telefono) {
        this.telefono = telefono;
    }

    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    

    public Alumno(String fechaAlta, ArrayList<Profesor> Lista_alumnoProfesor) {
        super();
        this.fechaAlta = fechaAlta;
        this.Lista_alumnoProfesor = Lista_alumnoProfesor;
    }

    public Alumno() {
        super();
    }

    
    
    public Alumno(String nombre, String apellidos, int edad, String fechaAlta, ArrayList<Profesor> Lista_alumnoProfesor) {
        super(nombre, apellidos, edad);
        this.fechaAlta = fechaAlta;
        this.Lista_alumnoProfesor = Lista_alumnoProfesor;
    }

    
    public ArrayList<Profesor> getListaprofesores() {
        return Lista_alumnoProfesor;
    }

    public void setListaprofesores(ArrayList<Profesor> Listaprofesores) {
        this.Lista_alumnoProfesor = Listaprofesores;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    @Override
    public void imprimealumnoProfesor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeProfesorAsignatura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimecursoProfesor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimecursoAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimecursoMateria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeCursoCurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
