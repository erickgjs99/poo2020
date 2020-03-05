package matricespoo;

public class Matrices {
    // Declaracion de variables
    private int[][] matrizA = new int[3][3];
    private int[][] matrizB = new int[3][3];
    private int[][] matrizC = new int[3][3];
    private  String cad = "";

    public Matrices(int[][] matrizA, int[][] matrizB) {
        this.setMatrizA(matrizA);
        this.setMatrizB(matrizB);
        this.matrizC = matrizC;
    }
    public int[][] SumaMatriz(){
        for (int i = 0; i < getMatrizA().length; i++) {
            for (int j = 0; j < getMatrizA().length; j++){
                matrizC[i][j] = (getMatrizA()[i][j] + getMatrizB()[i][j]);
            }
        }
        return matrizC;
    }
    public String presentar(){
        for (int i = 0; i < getMatrizA().length; i++){
            for (int j = 0; j < getMatrizA().length; j++){
                cad = String.format("%sLa posición [%d][%d] del arreglo A es: %d + la posición [%d][%d] " +
                        "del arreglo B es: %d la suma en el arreglo C, en la posicion [%d][%d] es igual a:%d\n",
                        cad,i, j , getMatrizA()[i][j], i, j, getMatrizB()[i][j], i, j, SumaMatriz()[i][j]);
            }
        }
        return cad;
    }

    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int[][] getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }
}

