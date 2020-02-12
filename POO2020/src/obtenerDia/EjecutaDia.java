package obtenerDia;

import java.util.Scanner;

public class EjecutaDia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declaracion de variables
        int num;
        System.out.println("Ingrese el numero que corresponde con el dia de la semana\n");
        num = entrada.nextInt();

        Dia day = new Dia(num);

        String dia = day.calcularNombre();
        System.out.println(dia);
    }
}
