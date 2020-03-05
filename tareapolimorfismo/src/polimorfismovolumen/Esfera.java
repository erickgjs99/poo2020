package polimorfismovolumen;

public class Esfera extends Formula {
    private double radio;
    /**
     * Metodo para sacar el area de la Esfera
     * @return total
     */
    @Override
    public void calcularVolumen() {
        volumen = 0.25 * Math.PI * Math.pow(radio, 3);
    }


    /**
     * Metodo set de la clase esfera
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
