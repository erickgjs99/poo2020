package polimorfismodeudores;

public class PrestamoHipotecario extends ClienteDeudor{
    private double interes = 0.05;
    private double plazo;
    private double prestamo;


    /**
     * Metodo para obtener el interes
     * @return total
     */
    @Override
    public void interesGanado() {
        total = getPrestamo() * interes * getPlazo();
    }

    /**
     * Metodo get y set de la lase prestamoHipotecario
     * @return
     */
    public double getPlazo() {
        return plazo;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    public double getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(double prestamo) {
        this.prestamo = prestamo;
    }
}
