package polimorfismo_figuras;

public class Triangulo3 extends Figura3{
    private double baseTriang;
    private double alturaTriang;

    public void setBaseTriang(double baseTriang) {
        this.baseTriang = baseTriang;
    }


    public void setAlturaTriang(double alturaTriang) {
        this.alturaTriang = alturaTriang;
    }


    @Override
    public void calcularArea() {
        area = (baseTriang * alturaTriang)/2;
    }

    @Override
    public void obtenerDatos() {
        cad = String.format("%s\tTriangulo\t\t\t%.2f\n", cad, obtenerArea());
    }
}
