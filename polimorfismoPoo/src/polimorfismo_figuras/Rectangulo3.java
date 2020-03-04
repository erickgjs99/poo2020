package polimorfismo_figuras;

public class Rectangulo3 extends Figura3{
    private double baseRecta;
    private double alturaRecta;

    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }


    @Override
    public void calcularArea() {
        area = baseRecta * alturaRecta;
    }

    @Override
    public void obtenerDatos() {
        cad = String.format("%s\tRectangulo\t\t\t%.2f\n", cad, obtenerArea());
    }
}
