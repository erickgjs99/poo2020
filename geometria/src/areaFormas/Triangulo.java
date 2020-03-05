package areaFormas;

public class Triangulo extends  Formas{
    private double base;
    private double altura;
    private double areaTriangulo;
    private String cad = "";

    /**
     * Metodo constructor de la clase Triangulo
     * @param base
     * @param altura
     */
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    /**
     * Metodo para calcular el area del Triangulo
     * @return areaTriangulo
     */
    public double obtenerArea(){
        areaTriangulo = (getAltura() * getBase())/2;
        return areaTriangulo;
    }

    /**
     * Metodo para presentar en una cadena el resultado
     * @return
     */
    public String cadenaArea(){
        cad = String.format("%s\t%s\t\t\t\t%.2f\n",
                cad, "Triangulo", obtenerArea());
        return cad;
    }

    // Para establecer metodo get y set de la clase Triangulo
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
