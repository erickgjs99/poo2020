package Ejercicio1;

public class Promedio {
    // Declaracion de Variables
    private double c1;
    private double c2;
    private double c3;
    private double c4;
    private double prom;
    private String cad;

    /**
     * Método Constructor
     * @param c1
     * @param c2
     * @param c3
     * @param c4
     */
    public Promedio(double c1, double c2, double c3, double c4){
        this.setC1(c1);
        this.setC2(c2);
        this.setC3(c3);
        this.setC4(c4);
    }
    // Metodos para el ejercicio

    /**
     * Metodo para sacar el promedio
     * @return getProm()
     */
    public double promedioAlum(){
        setProm((getC1() + getC2() + getC3() + getC4()) / 4);
        return getProm();
    }

    /**
     * Metodo para saber si aprueba o no
     * @return getCad()
     */
    public String estadoAlum() {
        String informacion = "";
        if (getProm() >= 60) {
            setCad("USTED APRUEBA CON TOTAL EXITO");
        } else {
            if (getProm() <= 59) {
                setCad("REPROBADO");
            }
        }
        return getCad();
    }
    // metodos de las cadenas universales que sirven para guardar los datos
    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public double getC3() {
        return c3;
    }

    public void setC3(double c3) {
        this.c3 = c3;
    }

    public double getC4() {
        return c4;
    }

    public void setC4(double c4) {
        this.c4 = c4;
    }

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }

    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }
}
