package herenciainversionistas;

public class Pagare extends Inversionista {
    // Declaracion de varibles
    private double capital;
    private double anios;
    private double interes;

    /**
     * Constructor para la cuenta pagare
     * @param nombre
     * @param num_cuenta
     * @param capital
     * @param anios
     */
    public Pagare(String nombre, String num_cuenta, double capital, double anios) {
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
        this.capital = capital;
        this.anios = anios;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getAnios() {
        return anios;
    }

    public void setAnios(double anios) {
        this.anios = anios;
    }

    /**
     * Metodo para el caluclo de los intereses
     */
    public void interes() {
        interes =((capital/anios)*(0.45*anios));
    }

    /**
     * Metodo para la presentacion de los interesee
     * @return intereses
     */
    public double presentarIntereses() {
        return interes;
    }
}
