package taller;


public class EjecutaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.actualizaEdad(20);
        estudiante.actualizaNombre("Erick Jaramillo");
        estudiante.actualizaMateria("Ingenieria");
        estudiante.actualizaLibro("Derivadas de Lapin");
        estudiante.actualizarcomida("Lasaña");
        estudiante.actualizaGenero("Masculino");
        String mostrar_datos = estudiante.obtenerDatos();
        System.out.println(mostrar_datos);
    }
}
