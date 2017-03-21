
package GestionInstituto;

//JAVABEANS puro, de acceso y escritura

public class Asignatura {
    
    private int idAsignatura;
    private String nombreAsignatura;

    public Asignatura() {
    }

    public Asignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
    
    
    
}
