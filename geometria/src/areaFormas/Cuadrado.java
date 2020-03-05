package areaFormas;

public class Cuadrado extends  Formas{
    private double lado;
    private double areaCuadrado;
    private String cad = "";


    /**
     * Metodo constructor de la clase Cuadrado
     * @param lado
     */
    public Cuadrado(double lado){
        this.lado = lado;
    }


    /**
     * Metodo para calcular el area del Cuadrado
     * @return
     */
    public double cuadradoArea(){
        areaCuadrado = Math.pow(getLado(), 2);
        return  areaCuadrado;
    }

    /**
     * Metodo que presenta la respuesta del calculo
     * @return
     */
    public String cadenaArea2(){
        cad = String.format("%s\t%s\t\t\t\t%.2f\n",
                cad, "Cuadrado", cuadradoArea());
        return cad;
    }

    // Metodo get y set de la clase Cuadrado
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
