package polimorfismoinversionistas;

public class CuentaAhorro extends Inversionista {
        // Declaracion de varibles
        private double capital;
        private double plazo;


    /**
     * Método para el calculo del interes
     */
    @Override
    public void interesGanado() {
        interes = (capital / plazo) * (0.30 * plazo);
    }

    /**
     * Metodo get y set de la clase cuentaAhorro
     * @return
     */
    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getPlazo() {
        return plazo;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

}
