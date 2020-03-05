package polimorfismoinversionistas;

public class CuentaMaestra extends Inversionista {
    // Declaracion de varibles
    private double capital_inicio;
    private double capital_actual;
    private double anios;

    /**
     * Metodo para el calculo de los intereses
     */
    @Override
    public void interesGanado() {
        if(capital_actual < capital_inicio){
            interes = ((capital_actual - capital_inicio)*(anios*0.70));
        }
        if(capital_actual < capital_inicio){
            interes = (capital_actual*0.40);
        }
        if(capital_actual > capital_inicio){
            interes = (0);
        }
    }
    /**
     * Metodo set y get de la clase cuentaMaestra
     */
    public double getCapital_inicio() {
        return capital_inicio;
    }

    public void setCapital_inicio(double capital_inicio) {
        this.capital_inicio = capital_inicio;
    }

    public double getCapital_actual() {
        return capital_actual;
    }

    public void setCapital_actual(double capital_actual) {
        this.capital_actual = capital_actual;
    }

    public double getAnios() {
        return anios;
    }

    public void setAnios(double anios) {
        this.anios = anios;
    }
}
