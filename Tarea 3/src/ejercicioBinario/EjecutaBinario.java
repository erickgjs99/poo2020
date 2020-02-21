package ejercicioBinario;

import java.util.Scanner;

public class EjecutaBinario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaracion de Variables
        String [] bin = new String[50];
        String cad = "";
        boolean verf = true;
        int verf2;
        int cont = 0;
        cad = String.format("%s%s", cad, "Programa para convertir un binario a decimal\n");
        while (verf == true){
            System.out.println("Por favor ingrese el binario\n");
            bin[cont] = entrada.nextLine();
            //Iniciamos objeto
            Binario b = new Binario(bin[cont]);
            cad = String.format("%sEl número binario %s convertido a decimal es el número: %d\n", cad, bin[cont]
                    , b.obtenerDecimal());
            System.out.println("Desea ingresar más binarios Presione\n1._1\n2._No\n");
            verf2 = entrada.nextInt();
            entrada.nextLine();
            if (verf2 == 2){
                verf = false;
            }
            cont += 1;
        }

        System.out.printf("%s", cad);

    }
}
