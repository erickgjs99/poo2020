package herenciaautomotriz;

public class EmpleadoMeca extends Empleado{

    /**
     * Método constructor de la clase EmpleadoMeca
     * @param sueldo
     * @param nombre
     * @param cargo
     * @param departamento
     */
    public EmpleadoMeca(double sueldo, String nombre, String cargo, String departamento){
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
        total = getSueldo() / 0.4;
        return total;
    }

    /**
     * Metodo para obtener la cadena para la impresión final
     * @return cad
     */
    public String obtenerCadena(){
        cad = String.format("%s%s\t\t%s\t\t%s\t\t%.2f\n",cad, getNombre(), getDepartamento(), getPuesto(),
                obtenerQuincena());
        return cad;
    }
}
