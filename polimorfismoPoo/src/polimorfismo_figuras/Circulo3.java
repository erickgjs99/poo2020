package polimorfismo_figuras;

public class Circulo3 extends Figura3{
    private double radio;


    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void obtenerDatos() {
        cad = String.format("%s\tCirculo\t\t\t%.2f\n", cad, obtenerArea());
    }
}
