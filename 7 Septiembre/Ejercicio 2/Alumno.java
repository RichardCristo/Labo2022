import java.util.ArrayList;

public class Alumno {
    private int dni;
    private String apellido;
    private String nombre;
    private ArrayList<Examen> examenesRealizados;
    private ArrayList<Alumno> listaAlumnos;

    public Alumno(int dni, String apellido, String nombre, ArrayList<Examen> examenesRealizados, ArrayList<Alumno> listaAlumnos) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.examenesRealizados = examenesRealizados;
        this.listaAlumnos = listaAlumnos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Examen> getExamenesRealizados() {
        return examenesRealizados;
    }

    public void setExamenesRealizados(ArrayList<Examen> examenesRealizados) {
        this.examenesRealizados = examenesRealizados;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public int cantidadAprobados(){
        int cantAprobados = 0;
        for(Alumno unAlumno : listaAlumnos){
            for (Examen unExamen : examenesRealizados){
                if (unExamen.aprobado()) cantAprobados ++;
            }
        }
        return cantAprobados;
    }
}
