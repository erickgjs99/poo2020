package Ejercicio2;

public class Empleado {
    // Declaración de variables
    private String nombre;
    private double vhoras;
    private double htrabajadas;
    private double sueldo;

    /**
     * Constructor
     * @param nombre
     * @param vhoras
     * @param htrabajadas
     */
    public Empleado(String nombre, double vhoras, double htrabajadas){
        this.setNombre(nombre);
        this.setVhoras(vhoras);
        this.setHtrabajadas(htrabajadas);
    }

    // Metodos para el ingreso y el guardado de datos proporcionadospor el usuario
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVhoras() {
        return vhoras;
    }

    public void setVhoras(double vhoras) {
        this.vhoras = vhoras;
    }

    public double getHtrabajadas() {
        return htrabajadas;
    }

    public void setHtrabajadas(double htrabajadas) {
        this.htrabajadas = htrabajadas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Metodo para calcular el sueldo del empleado
     * @return sueldo
     */
    public double calcularSueldo(){
        if(getHtrabajadas() <= 40){
            setSueldo(getHtrabajadas() * getVhoras());
        }else{
            if(getHtrabajadas() <=50){
                setSueldo((40* getVhoras()) + (getHtrabajadas() - 40) * (getVhoras() *2));;
            }else {
                setSueldo((40*getVhoras())+(10*getVhoras()*2)+((getHtrabajadas()-50)*(getVhoras()*3)));
            }
        }
        return getSueldo();
    }

    /**
     * Metodo para presentar la informacion
     * @return
     */
    public String obtenerDatos(){
        String presentar = "Nombre del empleado: "+ getNombre() +":\n"+"Sueldo por Hora: " + getVhoras()
                +"\n"+"Horas trabajadas: "+ getHtrabajadas() +"\n"+"Sueldo total: "+calcularSueldo()+" USD\n";
        return presentar;
    }


}
