package tp7;

public class Colegio {

    public static void main(String[] args) {
        
        Materia mat1 = new Materia(1,"Ingles I",1);
        Materia mat2 = new Materia(2,"Matematicas",1);
        Materia mat3 = new Materia(3,"Laboratorio I",1);
        
        Alumno alu1 = new Alumno(1001, "López", "Martin");
        Alumno alu2 = new Alumno(1002, "Martínez", "Brenda");
        
        alu1.agrgarMateria(mat1);
        alu1.agrgarMateria(mat2);
        alu1.agrgarMateria(mat3);

        alu2.agrgarMateria(mat1);
        alu2.agrgarMateria(mat2);
        alu2.agrgarMateria(mat3);
        alu2.agrgarMateria(mat3);
        
        System.out.println("Cantidad de materias de " + alu1.getApellido() + " - " + alu1.cantidadMaterias());
        System.out.println("Cantidad de materias de " + alu2.getApellido() + " - " + alu2.cantidadMaterias());
    }
}