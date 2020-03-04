package herenciaautomotriz;

public class EmpleadoAdmi extends Empleado {

    /**
     * Método constructor de la clase EmpleadoAdmi
     * @param sueldo
     * @param nombre
     * @param cargo
     * @param departamento
     */
    public EmpleadoAdmi(double sueldo, String nombre, String cargo, String departamento){
        this.sueldo = sueldo;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = cargo;
    }

    /**
     * Metodo para obtener la quincena del empleado
     * @return total
     */
    public double obtenerQuincena(){
        total = getSueldo() / 2;
        return total;
    }

    /**
     * Metodo para obtener la cadena para la impresión final
     * @return cad
     */
    public String obtenerCadena(){
        cad = String.format("%s%s\t\t\t%s\t\t\t%s\t\t\t\t%.2f\n",cad, getNombre(), getDepartamento(), getPuesto(),
                obtenerQuincena());
        return cad;
    }





}
