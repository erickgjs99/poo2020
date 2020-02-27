package herencia;

/**
 * clase que hereda de la clase persona
 * contendra todos los atributos definidos en persona
 */
public class Estudiante extends Persona{
    // Atributos propios de esta clase
    private String carrera;

    public Estudiante(String nombre, String cedula,String carrera ,String estado_civil, String fecha_nacimiento){
        this.carrera = carrera;
        this.nombre = nombre;
        this.cedula = cedula;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nacimiento;
    }


    public void matricular(){
        System.out.println("Metodo para matricular");
    }

    public void aprender(){
        System.out.println("Metodo para aprender");
    }


    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
