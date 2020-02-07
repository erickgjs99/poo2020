package taller;

public class EjecutaUniversidad {
    public static void main(String[] args) {
        // Creación de objeto tiempo
        Universidad universidad = new Universidad();
        universidad.actualizar_nombre("San Pancho");
        universidad.actualizar_ubicacion("Quito");
        universidad.actualizar_estudiantes(80000);
        universidad.actualizar_autoridades("Rector - Vicerrectorado - Administrativo - Docentes - Estudiantes");
        universidad.actualizar_laboratorios("Fisica - Quimica - Computación - Biología - Arquitectura - Bioquímica");
        universidad.actualizar_docentes("Ingenieros - Magisters - PHD - Licenciados");
        String mostrar_informacion = universidad.obtener_informacion() ;
        System.out.println(mostrar_informacion);

    }
}