package areaFormas;

public class Circulo extends  Formas{
    private double radio;
    private double areaCirc;
    private String cad = "";


    /**
     * Metodo constructor de la clase Circulo
     * @param radio
     */
    public Circulo(double radio){
        this.radio = radio;
    }

    /**
     * Metodo para calcular el area del circulo
     * @return
     */
    public double areaCirculo(){
        areaCirc = Math.PI * Math.pow(radio, 2);
        return areaCirc;
    }
    /**
     * Metodo que presenta la cadena del resultado final
     * @return
     */
    public String cadenaArea4(){
        cad = String.format("%s\t%s\t\t\t\t\t%.2f\n",
                cad, "Circulo", areaCirculo());
        return cad;
    }
    // Metodo get y set de la clase Circulo
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
