package disenioSeleccion;

public class Empleado {
    // declaracion de variables
    private String nombre;
    private double horas;
    private double cuota;
    private double sueldo;
    private  String cad;

    /**
     * Metodo constructor
     * @param nombre
     * @param horas
     * @param cuota
     */
    public Empleado(String nombre, double horas, double cuota){
        this.setNombre(nombre);
        this.setHoras(horas);
        this.setCuota(cuota);
    }

    /**
     * Metodo para la obtencion del sueldo
     * @return sueldo
     */
    public  double obtenerSueldo(){
        if(getHoras() <= 40){
            setSueldo(getHoras() * getCuota());
        }else{
            setSueldo((40 * getCuota()) + (getHoras() - 40) * (getCuota() *2));
        }
        return getSueldo();
    }

    /**
     * Metodo para obtener los datos del empleado
     * @return
     */
    public String obtenerdatos(){
        cad = "Nombre del empleado:\n"+ getNombre() +"\n"+"Horas Trabajadas:\n"+ getHoras() +"\n"+"Cuota del Empleado:\n"+ getCuota() +"\n"+
                "El sueldo Total a pagar al empleado es de: "+ obtenerSueldo()+" UDS";

        return cad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
