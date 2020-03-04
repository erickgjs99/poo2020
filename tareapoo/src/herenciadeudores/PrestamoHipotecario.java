package herenciadeudores;

public class PrestamoHipotecario extends ClienteDeudor{

    private double interes = 0.05;

    /**
     * Metodo constructor de la clase PrestamoHipotecario
     * @param nombre
     * @param numCliente
     * @param numCuenta
     * @param prestamo
     * @param plazo
     */
    public PrestamoHipotecario(String nombre, String numCliente, String numCuenta,double prestamo, int plazo){
        this.nombre = nombre;
        this.numCliente = numCliente;
        this.numCuenta = numCuenta;
        this.plazo = plazo;
        this.prestamo = prestamo;
    }

    /**
     * Metodo para obtener el interes
     * @return total
     */
    public double obtenerInteres(){
        total = prestamo * interes * plazo;
        return total;
    }

    /**
     * Metodo para obtener la cadena
     * @return cad
     */
    public String obtenerDatos(){
        cad = String.format("%s%s\t\t%s\t\t%s\t\t\t%.2f\n", cad,
                getNumCliente(), getNombre(), getNumCuenta(),
                obtenerInteres());
        return cad;
    }
}
