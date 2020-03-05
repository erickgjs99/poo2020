package matricespoo;
import java.util.Scanner;
public class EjecutaMatrices {
    // Declaracion de variables
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        String cad = "";

        cad = String.format("Programa que suma arreglos bidimencionales\n");
        System.out.println("Ingreso de valores dela matriz A");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++){
                System.out.println("Ingrese el valor de la posicion: "+"["+i+"]"+"["+j+"]"+"\n");
                matrizA[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Ingreese los valores de la matriz B");
        for (int i = 0; i < matrizB.length; i++) {2
            for (int j = 0; j < matrizB.length; j++){
                System.out.println("Ingrese el valor de la posicion: "+"["+i+"]"+"["+j+"]"+"\n");
                matrizB[i][j] = entrada.nextInt();
            }
        }
        // Iniciamos el objeto
        Matrices matrices = new Matrices(matrizA,matrizB);

        cad = String.format("%s%s", cad, matrices.presentar());

        System.out.printf("%s", cad);

    }
}

