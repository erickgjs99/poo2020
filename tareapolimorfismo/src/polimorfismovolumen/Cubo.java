package polimorfismovolumen;

public class Cubo extends Formula{
    private double lado;


    /**
     * Metodo para obtener el volumen
     */
    @Override
    public void calcularVolumen() {
        volumen = Math.pow(lado, 3);
    }

    /**
     * Metodo set para la clase cubo
     * @param lado
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
}
