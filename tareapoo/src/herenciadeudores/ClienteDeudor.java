package herenciadeudores;

public class ClienteDeudor {
    // Declara Variables
    protected String nombre;
    protected String numCliente;
    protected String numCuenta;
    protected double interes;
    protected double prestamo;
    protected  double total;
    protected int plazo;
    protected String cad = "";




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(double prestamo) {
        this.prestamo = prestamo;
    }
}
