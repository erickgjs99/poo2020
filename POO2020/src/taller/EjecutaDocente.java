package taller;

public class EjecutaDocente {
    public static void main(String[] args) {
        // Creación de objeto tiempo
        Docente docente = new Docente();
        docente.actualizar_nombre("Caray");
        docente.actualizar_edad(44);
        docente.actualizar_peso(75);
        docente.actualizar_genero("Masculino");
        docente.actualizar_estatura(1.70);
        docente.actualizar_materia("Calculo Diferencial");
        String mostrar_informacion = docente.obtener_informacion() ;
        System.out.println(mostrar_informacion);

    }
}