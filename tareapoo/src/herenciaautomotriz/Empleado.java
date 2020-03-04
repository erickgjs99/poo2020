package herenciaautomotriz;

public class Empleado {
    // Declaración de Variables
    protected String nombre;
    protected String puesto;
    protected String departamento;
    protected String cad = "";
    protected double sueldo;
    protected double total;


    /**
     * Metodos get y set para la super clase
     * @return
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


}
