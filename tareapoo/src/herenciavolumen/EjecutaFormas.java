package herenciavolumen;

import java.util.Scanner;

public class EjecutaFormas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaracion de variables
         double radio;
         double altura;
         double lado;
         boolean verf = true;
         int opc;
         String cad = "";
         cad = String.format("%sÁrea de Figuras Geométricas\nNombre de la Figura\t\t\tÁrea total\n", cad);
         // While para ingreso de datos
         while (verf == true){
             System.out.println("BIENVENIDO\nAREA DE FIGURAS GEOMETRICAS OPCIONA\n| 1 | CUBO\n| 2 | CILINDRO\n" +
                     "| 3 | CONO\n| 4 | ESFERA\n| 5 | SALIR\n");
             opc = entrada.nextInt();
             if (opc == 1){
                 System.out.println("AREA DE UN CUBO");
                 System.out.println("Ingrese la medida de un lado del cubo");
                 lado = entrada.nextDouble();
                 Cubo cub = new Cubo("CUBO", lado);
                 cad = String.format("%s%s", cad, cub.obtenerDatos());
             }
             if (opc == 2){
                 System.out.println("AREA DE UN CILINDRO");
                 System.out.println("Ingrese el radio del cilindro");
                 radio = entrada.nextDouble();
                 System.out.println("Ingrese la altura del cilindro");
                 altura = entrada.nextDouble();
                 Cilindro cil = new Cilindro("CILINDRO", radio, altura);
                 cad = String.format("%s%s", cad, cil.obtenerDatos());
             }
             if (opc == 3){
                 System.out.println("AREA DE UN CONO");
                 System.out.println("Ingrese el radio del cono");
                 radio = entrada.nextDouble();
                 System.out.println("Ingrese la altura del cono");
                 altura = entrada.nextDouble();
                 Cono con = new Cono("CONO", radio, altura);
                 cad = String.format("%s%s", cad, con.obtenerDatos2());
             }
             if (opc == 4){
                 System.out.println("AREA DE UN ESFERA");
                 System.out.println("Ingrese el radio del cono");
                 radio = entrada.nextDouble();
                 Esfera es = new Esfera("ESFERA", radio);
                 cad = String.format("%s%s", cad, es.obtenerDatos());
             }
             if (opc == 5){
                 verf = false;
             }
         }
         // Impresion de los resultados
        System.out.printf("%s", cad);
        // FIN
    }
}
