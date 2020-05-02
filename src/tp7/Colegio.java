package tp7;

public class Colegio {

    public static void main(String[] args) {
        
        //a) Crear las materias:
        Materia mat1 = new Materia(1,"Ingles I",1);
        Materia mat2 = new Materia(2,"Matematicas",1);
        Materia mat3 = new Materia(3,"Laboratorio I",1);
        
        //b) Crear 2 alumnos.
        Alumno alu1 = new Alumno(1001, "López", "Martin");
        Alumno alu2 = new Alumno(1002, "Martínez", "Brenda");
        
        //c) Inscribir a López en las 3 materias.
        alu1.agrgarMateria(mat1);
        alu1.agrgarMateria(mat2);
        alu1.agrgarMateria(mat3);

        //d) Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.
        alu2.agrgarMateria(mat1);
        alu2.agrgarMateria(mat2);
        alu2.agrgarMateria(mat3);
        alu2.agrgarMateria(mat3);
        
        alu1.listarMaterias();
        alu2.listarMaterias();
    
    }
}