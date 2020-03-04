package herenciavolumen;

public class Cono extends Formula{

    /**
     * Constructor de la clase Esfera
     * @param forma
     * @param radio
     * @param altura
     */
    public Cono(String forma, double radio, double altura){
        this.radio = radio;
        this.altura = altura;
        this.forma = forma;
    }

    /**
     * Metodo para sacar el area del Cono
     * @return total
     */
    public double areaCono(){
        total = 0.33 * Math.PI * Math.pow(getRadio(), 2) * getAltura();
        return total;
    }

    /**
     * Metodo para obtener la cadena
     * @return cad
     */
    public String obtenerDatos2() {
        cad = String.format("%s\t%s\t\t\t\t\t%.2f\n",cad, getForma(), areaCono());
        return cad;
    }
}
