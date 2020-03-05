package polimorfismoautomotriz;

public class EmpleadoVen extends Empleado{
    private String nombre;
    private String departamento;
    private String puesto;
    private double sueldo;
    private int ventasrealizadas;
    private double ventatotal;


    /**
     * Metodo para obtener la quincena del empleado
     * @return total
     */
    @Override
    public void calcularQuincena() {
        total = getSueldo() + ((getVentasrealizadas() * 0.02) * getVentatotal());
    }
    /**
     * Metodo get y set de la clase EmpleadoMeca
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

    public int getVentasrealizadas() {
        return ventasrealizadas;
    }

    public void setVentasrealizadas(int ventasrealizadas) {
        this.ventasrealizadas = ventasrealizadas;
    }

    public double getVentatotal() {
        return ventatotal;
    }

    public void setVentatotal(double ventatotal) {
        this.ventatotal = ventatotal;
    }



}
