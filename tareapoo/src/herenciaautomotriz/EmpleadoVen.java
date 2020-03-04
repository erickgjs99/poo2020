package herenciaautomotriz;

public class EmpleadoVen extends Empleado{
    /**
     * Método constructor de la clase EmpleadoVen
     * @param sueldo
     * @param nombre
     * @param cargo
     * @param departamento
     */
    public EmpleadoVen(double sueldo, String nombre, String cargo, String departamento){
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
        total = 394 + (getSueldo() * 0.2);
        return total;
    }

    /**
     * Metodo para obtener la cadena para la impresión final
     * @return cad
     */
    public String obtenerCadena(){
        cad = String.format("%s%s\t\t%s\t\t\t%s\t\t\t%.2f\n",cad, getNombre(), getDepartamento(), getPuesto(),
                obtenerQuincena());
        return cad;
    }
}
