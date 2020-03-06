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
        total = prestamo * interes * plazo;
    }

    /**
     * Metodo get y set de la lase prestamoHipotecario
     * @return
     */

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }


    public void setPrestamo(double prestamo) {
        this.prestamo = prestamo;
    }
}
