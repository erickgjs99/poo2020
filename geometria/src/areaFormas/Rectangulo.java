package areaFormas;

public class Rectangulo extends  Formas{
    private double base;
    private double altura;
    private double areaRectangu;
    private String cad = "";

    /**
     * Metodo constructor de la clase Rectangulo
     * @param base
     * @param altura
     */
    public Rectangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    /**
     * Metodo para calcular el area del Rectangulo
     * @return
     */
    public double rectanguloArea(){
        areaRectangu = base * altura;
        return  areaRectangu;
    }

    /**
     * Metodo que presenta la cadena del resultado final
     * @return
     */
    public String cadenaArea3(){
        cad = String.format("%s\t%s\t\t\t\t%.2f\n",
                cad, "Rectangulo",rectanguloArea());
        return cad;
    }
    // Metodos get y set de la clase Rectangulo
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
