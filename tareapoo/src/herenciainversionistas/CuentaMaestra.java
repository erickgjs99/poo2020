package herenciainversionistas;

public class CuentaMaestra extends Inversionista {
    // Declaracion de varibles
    private double capital_inicio;
    private double capital_actual;
    private double anios;
    private double interes;


    /**
     * Constructor para la cuenta maestra
     * @param nombre
     * @param num_cuenta
     * @param capital_inicio
     * @param capital_actual
     * @param anios
     */
    public CuentaMaestra (String nombre, String num_cuenta, double capital_inicio, double capital_actual, double anios){
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
        this.capital_inicio = capital_inicio;
        this.capital_actual = capital_actual;
        this.anios = anios;
    }

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

    /**
     * Metodo para el calculo de los intereses
     */
    public void interes (){
        if(capital_actual < capital_inicio){
            interes = (capital_actual - capital_inicio)*(anios*0.70);
        }
        if(capital_actual < capital_inicio){
            interes = capital_actual*0.40;
        }
        if(capital_actual > capital_inicio){
            interes = 0;
        }
    }

    /**
     * Metodo para la presentacion de los intereses
     * @return intereses
     */
    public double presentarIntereses (){
        return interes;
    }
}
