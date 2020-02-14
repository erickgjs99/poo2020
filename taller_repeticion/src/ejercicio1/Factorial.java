package ejercicio1;

public class Factorial {
    // declaracion de variables
    private int fact;
    private String cad = "";
    private int resultado;


    public Factorial(int fact){
        this.fact = fact;
    }

    public int factorial() {
        resultado = 1;
        for (int i = 1; i <= getFact(); i++) {
            resultado *= i;
        }
        return resultado;
    }

    public String obtenerDatos(){
        cad = String.format("%s%d\t\t\t\t\t\t\t%d\n", cad, getFact(),factorial());

        return cad;
    }

    public int getFact() {
        return fact;
    }

    public void setFact(int fact) {
        this.fact = fact;
    }
}
