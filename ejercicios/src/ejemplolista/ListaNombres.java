package ejemplolista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaracion de variables
        List<String> nombres = new ArrayList<String>();
        boolean verf = true;
        int opc;
        while (verf == true){
            System.out.println("BIENVENIDO\n| 1 | Agregar un nuevo nombre\n| 2 | Presentar\n| 3 | Salir\n");
            opc = entrada.nextInt();
            entrada.nextLine();
            if (opc == 1){
                System.out.println("Ingrese el nombre por favor");
                nombres.add(entrada.nextLine());
            }
            if (opc == 2){
                for (int i = 0; i < nombres.size(); i++){
                    System.out.println("-----------------------------------");
                    System.out.println("Nombres agragados\n"+ nombres.get(i));

                }
            }
            if (opc == 3){
                verf = false;
            }

        }
        System.out.println("FIN DEL PROGRAMA");


    }
}
