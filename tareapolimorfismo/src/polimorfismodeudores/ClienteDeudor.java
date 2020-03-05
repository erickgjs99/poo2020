package polimorfismodeudores;

public abstract class ClienteDeudor {
    // Declara Variables
    protected String nombre;
    protected String numCliente;
    private String numCuenta;
    protected double total;


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

    public double getTotal() {
        return total;
    }

    public abstract void interesGanado();


    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
}
