
package Humanos;


import GestionInstituto.Asignatura;
import Utilidades.Nivelformativo;
import java.util.ArrayList;

//POJOS - Objetos Planos (solo tienen propiedades, y getter setter

public class Profesor extends Persona implements Utilidades.Imprime{
    
    private String direccion;
    private String telefono;
    private int idProfesor;
    //Estos dos métodos se podrian inyectar en SPRING para hacerlo un JAVABEANS
    private Enum<Nivelformativo>nF;
          //Relacion profesor - asignatura. 
    private ArrayList<Asignatura> ListaProfesorAsignatura;

        public Profesor() {
            super();
    }
    
    public Profesor(String direccion, String telefono, int idProfesor, Enum<Nivelformativo> nF, ArrayList<Asignatura> ListaProfesorAsignatura, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.direccion = direccion;
        this.telefono = telefono;
        this.idProfesor = idProfesor;
        this.nF = nF;
        this.ListaProfesorAsignatura = ListaProfesorAsignatura;
    }

    public ArrayList<Asignatura> getListaProfesorAsignatura() {
        return ListaProfesorAsignatura;
    }

    public void setListaProfesorAsignatura(ArrayList<Asignatura> ListaProfesorAsignatura) {
        this.ListaProfesorAsignatura = ListaProfesorAsignatura;
    }

    public Enum<Nivelformativo> getnF() {
        return nF;
    }

    public void setnF(Enum<Nivelformativo> nF) {
        this.nF = nF;
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

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    @Override
    public void imprimealumnoProfesor() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeProfesorAsignatura() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimecursoProfesor() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimecursoAlumno() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimecursoMateria() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeCursoCurso() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
    
}
