package arreglospoo;

import java.util.Scanner;

public class EjecutaMultiplicacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declarar variables
        int[ ] arreglo1 = new int[10];
        int[ ] arreglo2 = new int[10];
        String cad = "";

        cad = String.format("%sMultiplicacíon y suma de dos arreglos\n\n", cad);

        for (int i = 0;i < arreglo1.length; i++){
            System.out.println("Ingrese un numero de la posición "+ i+ " para la lista 1\n");
            arreglo1[i] = entrada.nextInt();
            cad = String.format("%sEl número de la posición %d de la lista 1 es: %d\n", cad, i, arreglo1[i]);
        }

        for (int i = 0;i < arreglo2.length; i++){
            System.out.println("Ingrese un numero de la posición "+ i+ " para la lista 2\n");
            arreglo2[i] = entrada.nextInt();
            cad = String.format("%sEl número de la posición %d de la lista 2 es: %d\n", cad, i, arreglo1[i]);
        }

        Multiplicacion mult = new Multiplicacion(arreglo1, arreglo2);
        System.out.printf("%sEl resultado de todos los números ingresados es igual a: %d\n", cad, mult.suma());
    }
}
