
package GestionInstituto;

import Humanos.Alumno;
import Humanos.Profesor;
import Utilidades.Imprime;
import java.util.ArrayList;

public class Curso implements Imprime{
    
    private int idCurso;
    private String nombreCurso;
    private String fechaInicio;
    private String fechaFin;
    //Relacion alumnos - materias - profesores.
    private ArrayList<Profesor> lista_cursoProfesor;
    private ArrayList<Alumno> lista_cursoAlumno;
    private ArrayList<Asignatura> lista_cursoMateria;

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<Profesor> getLista_cursoProfesor() {
        return lista_cursoProfesor;
    }

    public void setLista_cursoProfesor(ArrayList<Profesor> lista_cursoProfesor) {
        this.lista_cursoProfesor = lista_cursoProfesor;
    }

    public ArrayList<Alumno> getLista_cursoAlumno() {
        return lista_cursoAlumno;
    }

    public void setLista_cursoAlumno(ArrayList<Alumno> lista_cursoAlumno) {
        this.lista_cursoAlumno = lista_cursoAlumno;
    }

    public ArrayList<Asignatura> getLista_cursoMateria() {
        return lista_cursoMateria;
    }

    public void setLista_cursoMateria(ArrayList<Asignatura> lista_cursoMateria) {
        this.lista_cursoMateria = lista_cursoMateria;
    }

    @Override
    public void imprimealumnoProfesor() {
        //Este metodo es CLASE ALUMNO 
    }

    @Override
    public void imprimeProfesorAsignatura() {

    }

    @Override
    public void imprimecursoProfesor() 
    {
        imprimeCursoCurso();
        System.out.println("Datos del curso: "+this.getNombreCurso()+"Inicio el: "+this.getFechaInicio()+"Acabose: "+this.getFechaFin());
        for (int i = 0; i < lista_cursoProfesor.size(); i++) {
            Profesor profesor = lista_cursoProfesor.get(i);   
            System.out.println("Listado profesores del curso: "+profesor.getNombre()+".."+profesor.getApellidos());
            //System.out.println("Listado profesores del curso: "+profesor.getApellidos());
            
        }
    }

    @Override
    public void imprimecursoAlumno() {
        //System.out.println("Datos del curso: "+this.getNombreCurso()+"..."+this.getFechaInicio()+"..."+this.getFechaFin());
        for (int i = 0; i < lista_cursoAlumno.size(); i++) {
            Alumno alumno = lista_cursoAlumno.get(i);
            System.out.println("Listado alumnos del curso: "+alumno.getNombre()+"...."+alumno.getApellidos());
        }
            
        }
        
    

    @Override
    public void imprimecursoMateria() {
        
        //System.out.println("Datos del curso: "+this.getNombreCurso()+"..."+this.getFechaInicio()+"..."+this.getFechaFin());
        for (int i = 0; i < lista_cursoMateria.size(); i++) {
            Asignatura asignatura = lista_cursoMateria.get(i);
            System.out.println("Listado asignaturas del curso: "+asignatura.getNombreAsignatura());
        }
    }

    @Override
    
    //este metodo ahorra los demas system out de info general (comentados)
    public void imprimeCursoCurso() {
        System.out.println("Información general acerca del curso: "+ this.getIdCurso()+"..."+this.getNombreCurso()+"...."+this.fechaInicio+"...."+this.getFechaFin());
    }

    @Override
    public void imprimeAll() {
        
        imprimecursoProfesor();
        imprimecursoAlumno();
        imprimecursoMateria();
        imprimeCursoCurso();
       
    }
}

        
    
    
