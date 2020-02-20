package arreglospoo;

public class Multiplicacion {
    // Declaramos las variables
    private int[ ] arreglo1 = new int[10];
    private int[ ] arreglo2 = new int[10];
    private int mult;
    private int suma = 0;
    private String cad = "";

    public Multiplicacion(int[]arreglo1, int[] arreglo2){
        this.arreglo1 = arreglo1;
        this.arreglo2 = arreglo2;
    }


    public int suma(){
        for(int i = 0; i < arreglo1.length; i++){
            mult = arreglo1[i] * arreglo2[i];
            suma = suma + mult;
            }
        return suma;
    }


    public int[] getArreglo1() {
        return arreglo1;
    }

    public void setArreglo1(int[] arreglo1) {
        this.arreglo1 = arreglo1;
    }

    public int[] getArreglo2() {
        return arreglo2;
    }

    public void setArreglo2(int[] arreglo2) {
        this.arreglo2 = arreglo2;
    }
}
