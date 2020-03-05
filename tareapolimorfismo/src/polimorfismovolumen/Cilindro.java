package polimorfismovolumen;

public class Cilindro extends Formula{
    private double radio;
    private  double altura;

    /**
     * Metodo para sacar el area del cilindro
     * @return total
     */
    @Override
    public void calcularVolumen() {
        volumen = Math.PI * Math.pow(radio, 2) * altura;
    }

    /**
     * Metodo set de clase cilindro
     * @param radio
     */

    public void setRadio(double radio) {
        this.radio = radio;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }
}
