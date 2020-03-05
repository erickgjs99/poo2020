package polimorfismoautomotriz;

public class EmpleadoAdmi extends Empleado {
    private String nombre;
    private String departamento;
    private String puesto;
    private double sueldo;


    /**
     * Metodo para obtener la quincena del empleado
     * @return total
     */
    @Override
    public void calcularQuincena() {
        total = getSueldo() / 2;
    }
    /**
     * Metodo set de la clase EmpleadoMeca
     * @param nombre
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


}
