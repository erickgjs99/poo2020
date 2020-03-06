package polimorfismoinversionistas;

public class Pagare extends Inversionista {
    // Declaracion de varibles
    private double capital;
    private double anios;


    /**
     * Metodo para el caluclo de los intereses
     */
    @Override
    public void interesGanado() {
        interes = (capital / anios) * (0.45 * anios);
    }

    /**
     * Metodo get y set de la clase Pagare
     * @return
     */

    public void setCapital(double capital) {
        this.capital = capital;
    }


    public void setAnios(double anios) {
        this.anios = anios;
    }
}
