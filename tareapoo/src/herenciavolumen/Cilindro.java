package herenciavolumen;

public class Cilindro extends Formula{
    /**
     * Constructor de la clase Cilindro
     * @param forma
     * @param radio
     * @param altura
     */
    public Cilindro(String forma, double radio, double altura){
        this.radio = radio;
        this.altura = altura;
        this.forma = forma;
    }

    /**
     * Metodo para sacar el area del cilindro
     * @return total
     */
    public double areaCilindro(){
        total = Math.PI * Math.pow(getRadio(), 2) * getAltura();
        return total;
    }

    /**
     * Metodo para obtener la cadena
     * @return cad
     */
    public String obtenerDatos(){
        cad = String.format("%s\t%s\t\t\t\t%.2f\n",cad, getForma(), areaCilindro());
        return cad;
    }








}
