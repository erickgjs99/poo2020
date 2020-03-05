package polimorfismovolumen;

public class Cono extends Formula{
    private double radio;
    private double altura;


    /**
     * Metodo para sacar el area del Cono
     * @return total
     */

    @Override
    public void calcularVolumen() {
        volumen = 0.33 * Math.PI * Math.pow(radio, 2) * altura;
    }


    /**
     * Metodo set de la clase Cono
     * @return
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }



}
