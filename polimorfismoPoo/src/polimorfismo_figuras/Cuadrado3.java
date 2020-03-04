package polimorfismo_figuras;

public class Cuadrado3 extends  Figura3{
    private double ladoCuad;

    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }

    @Override
    public void calcularArea() {
        area = Math.pow(ladoCuad, 2);
    }

    @Override
    public void obtenerDatos() {
        cad = String.format("%s\tCuadrado\t\t\t%.2f\n", cad, obtenerArea());
    }
}
