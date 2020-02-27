package herencia;

/**
 * Clase que hereda de la clase Persona
 */
public class Administracion extends Persona{
    private String dependencia;
    public Administracion(String nombre, String cedula,String dependencia ,String estado_civil, String fecha_nacimiento){
        this.dependencia = dependencia;
        this.nombre = nombre;
        this.cedula = cedula;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void gestionar(){
        System.out.println("Metodo para gestionar");
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
}
