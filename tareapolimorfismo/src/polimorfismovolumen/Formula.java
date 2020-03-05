package polimorfismovolumen;

public abstract class Formula {
    protected String forma;
    protected double volumen;
    protected  String cad = "";

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public double getVolumen() {
        return volumen;
    }

   public abstract void calcularVolumen();
}
