package herencia;


/**
 * Esta clase hereda del clase persona
  */
public class Docente extends Persona{
    // Atributos propios de esta clase
    private String area;

    public Docente(String nombre, String cedula,String area,String estado_civil, String fecha_nacimiento){
        this.area = area;
        this.nombre = nombre;
        this.cedula = cedula;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void ensenar(){
        System.out.println("Metodo para enseñar");
    }

    public void calificar(){
        System.out.println("Metodo para calificar");
    }

    public String getArea() {
        return area;
    }



    public void setArea(String area) {
        this.area = area;
    }
}
