package herenciavolumen;

public class Esfera extends Formula {
    /**
     * Constructor de la clase Esfera
     * @param forma
     * @param radio
     */
    public Esfera(String forma,double radio){
        this.forma = forma;
        this.radio = radio;
    }
    /**
     * Metodo para sacar el area de la Esfera
     * @return total
     */

    public double areaEsfera(){
        total = 0.25 * Math.PI * Math.pow(getRadio(), 3);
        return total;
    }
    /**
     * Metodo para obtener la cadena
     * @return cad
     */
    public String obtenerDatos(){
        cad = String.format("%s\t%s\t\t\t\t\t%.2f\n",cad, getForma(), areaEsfera());
        return cad;
    }
}
