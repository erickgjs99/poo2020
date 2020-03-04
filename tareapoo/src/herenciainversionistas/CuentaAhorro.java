package herenciainversionistas;

public class CuentaAhorro extends Inversionista {
        // Declaracion de varibles
        private double capital;
        private double plazo;
        private double interes;

    /**
     * Constructor para la cuenta de ahorro
     * @param nombre
     * @param num_cuenta
     * @param capital
     * @param plazo
     */
    public CuentaAhorro (String nombre, String num_cuenta, double capital, double plazo){
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
        this.capital = capital;
        this.plazo = plazo;
    }

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

    /**
     * Método para el calculo del interes
     */
    public void interes (){
        interes =((capital/plazo)*(0.30*plazo));
    }

    /**
     * Metodo para presentar los intereses
     * @return intereses
     */
    public double presentarIntereses (){
        return interes;
    }
}
