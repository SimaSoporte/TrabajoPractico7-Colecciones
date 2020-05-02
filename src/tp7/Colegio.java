package tp7;

public class Colegio {

    public static void main(String[] args) {
        
        //a) Crear las materias:
        Materia mat1 = new Materia(1,"Ingles I",1);
        Materia mat2 = new Materia(2,"Matematicas",1);
        Materia mat3 = new Materia(3,"Laboratorio I",1);
        Materia mat4 = new Materia(1,"Ingles I",1);
        
        //b) Crear 2 alumnos.
        Alumno alu1 = new Alumno(1001, "López", "Martin");
        Alumno alu2 = new Alumno(1002, "Martínez", "Brenda");
        Alumno alu3 = new Alumno(1002, "Martínez", "Brenda");
        
        //c) Inscribir a López en las 3 materias.
        alu1.agrgarMateria(mat1);
        alu1.agrgarMateria(mat2);
        alu1.agrgarMateria(mat3);

        //d) Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.
        alu2.agrgarMateria(mat1);
        alu2.agrgarMateria(mat2);
        alu2.agrgarMateria(mat3);
        alu2.agrgarMateria(mat3);
        alu2.agrgarMateria(mat4);
        
        //e) Visualizar la cantidad de materias a las que está inscripto cada alumno.
        alu1.listarMaterias();
        alu2.listarMaterias();
        
        /*
            a. ¿Por qué ambos tienen la misma cantidad si al último alumno lo inscribió en 4
            materias?

            Porque la estructura que almacena las lista de materias en las que se ha 
            inscripto un alumno no permite valores duplicados.


            b. ¿Qué tipo de colección implementó para evitar materias repetidas y que otras
            cuestiones tuvo que modificar?

            Laa estructura utilizada es un HashSet que no permite valores duplicados. 
            También se han sobreescrito los métodos 'equal' y 'hashCode' para que 
            no permita objetos distintos (distinto valor de hash) con el mismo valor 
            de 'idMateria' (valores iguales).
        */

    }
}