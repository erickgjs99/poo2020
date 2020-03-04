package herenciavolumen;

public class Cubo extends Formula{

    /**
     * Metodo constructor de la clase Cubo
     * @param forma
     * @param lado
     */
    public Cubo(String forma, double lado){
        this.forma = forma;
        this.lado = lado;
    }

    /**
     * Metodo para sacar el area del Cono
     * @return total
     */
    public  double obtenerArea(){
        total = getLado() * 6;
        return total;
    }

    /**
     * Metodo para obtener la cadena
     * @return cad
     */
    public String obtenerDatos(){
        cad = String.format("%s\t%s\t\t\t\t\t%.2f\n",cad, getForma(), obtenerArea());
        return cad;
    }


}
