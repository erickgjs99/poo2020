package polimorfismodeudores;

public class CreditoAuto extends  ClienteDeudor{

    private double interes = 0.07;
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

    public double getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(double prestamo) {
        this.prestamo = prestamo;
    }

    public double getPlazo() {
        return plazo;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }
}
