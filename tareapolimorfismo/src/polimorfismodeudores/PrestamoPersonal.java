package polimorfismodeudores;

public class PrestamoPersonal extends ClienteDeudor{
    private double interes = 0.035;
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


    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }


    public void setPrestamo(double prestamo) {
        this.prestamo = prestamo;
    }
}
