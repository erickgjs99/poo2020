package polimorfismovolumen;

import java.util.Scanner;

public class EjecutaFormas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaracion de variables
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
                 Cubo cub = new Cubo();
                 System.out.println("AREA DE UN CUBO");
                 System.out.println("Ingrese la medida de un lado del cubo");
                 cub.setLado(entrada.nextDouble());
                 cub.calcularVolumen();
                 cad = String.format("%s\t%s\t\t\t\t\t%.2f\n", cad, "Cubo", cub.getVolumen());
             }
             if (opc == 2){
                 Cilindro cil = new Cilindro();
                 System.out.println("AREA DE UN CILINDRO");
                 System.out.println("Ingrese el radio del cilindro");
                 cil.setRadio(entrada.nextDouble());
                 System.out.println("Ingrese la altura del cilindro");
                 cil.setAltura(entrada.nextDouble());
                 cil.calcularVolumen();
                 cad = String.format("%s\t%s\t\t\t\t%.2f\n", cad, "Cilindro", cil.getVolumen());
             }
             if (opc == 3){
                 Cono con = new Cono();
                 System.out.println("AREA DE UN CONO");
                 System.out.println("Ingrese el radio del cono");
                 con.setRadio(entrada.nextDouble());
                 System.out.println("Ingrese la altura del cono");
                 con.setAltura(entrada.nextDouble());
                 con.calcularVolumen();
                 cad = String.format("%s\t%s\t\t\t\t\t%.2f\n", cad, "Cono", con.getVolumen());
             }
             if (opc == 4){
                 Esfera es = new Esfera();
                 System.out.println("AREA DE UN ESFERA");
                 System.out.println("Ingrese el radio del cono");
                 es.setRadio(entrada.nextDouble());
                 es.calcularVolumen();
                 cad = String.format("%s\t%s\t\t\t\t\t%.2f\n", cad, "Esfera", es.getVolumen());
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
