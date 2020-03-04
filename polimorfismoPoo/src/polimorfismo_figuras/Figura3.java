package polimorfismo_figuras;

public abstract class Figura3 {
    private String nomFigura;
    protected double area;
    protected String cad = "";

    public abstract void calcularArea();
    public double obtenerArea(){
        return area;
    }

    public abstract void obtenerDatos();
    public String obtenerCadena(){return cad;};

    public String getNomFigura() {
        return nomFigura;
    }

    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }
}
