package tp7;

import java.util.HashSet;
import java.util.Iterator;

public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> misMaterias = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() { return legajo; }
    public void setLegajo(int legajo) { this.legajo = legajo; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Este método recibe por parametro una materia y la agrega a la lista de materias inscriptas del alumno, 
     * siempre y cuando la materia no figure en la su lista. Esta funcionalidad 
     * está implementada por el tipo de estructura de datos utilizada (HashSet).
     * @param m 
     */
    public void agrgarMateria(Materia m) {
        if ( misMaterias.add(m) ) {
            System.out.println(nombre + " se inscribió en: " + m.getNombre());
        } else {
            System.out.println(nombre + " ya está inscripto/a en: " + m.getNombre());
        }
    }

    private int cantidadMaterias() {
        return misMaterias.size();
    }
    
    public void listarMaterias(){
        System.out.println("\nAlumno/a: " + nombre + " " + apellido);
        System.out.println("Cantidad de materias en las que esta inscripto/a: " +  cantidadMaterias());
        System.out.println("[ idMateria ][ nombre ][ anio ]");
        Iterator it = misMaterias.iterator();
        while (it.hasNext()) {
            Materia mat = (Materia)it.next();
            System.out.println("[ " + mat.getIdMateria() + " ][ " + mat.getNombre() + " ][ " + mat.getAnio() + " ]");
        }
    }
}
