package polimorfismo_figuras;

import java.util.Scanner;

public class EjecutaFigura3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaracion de variables
        boolean verf = true;
        int opc;
        String cad = "";
        cad = String.format("%sÁrea de Figuras Geométricas\nNombre de la Figura\t\t\tÁrea total\n", cad);
        // While para ingreso de datos
        while (verf == true){
            System.out.println("BIENVENIDO\nAREA DE FIGURAS GEOMETRICAS OPCIONA\n| 1 | CUADRADO\n| 2 | RECTANGULO\n" +
                    "| 3 | CIRCULO\n| 4 | TRIANGULO\n| 5 | SALIR\n");
            opc = entrada.nextInt();
            if (opc == 1){
                Cuadrado3 cua = new Cuadrado3();
                System.out.println("AREA DE UN CUADRADO");
                cua.setNomFigura("Cuadrado");
                System.out.println("Ingrese la medida de un lado del cuadrado");
                cua.setLadoCuad(entrada.nextDouble());
                cua.calcularArea();
                cua.obtenerDatos();
                cad = String.format("%s%s", cad , cua.obtenerCadena());
            }
            if (opc == 2){
                Rectangulo3 rec = new Rectangulo3();
                System.out.println("AREA DE UN RECTANGULO");
                System.out.println("Ingrese la base del rectangulo");
                rec.setBaseRecta(entrada.nextDouble());
                System.out.println("Ingrese la altura del rectangulo");
                rec.setAlturaRecta(entrada.nextDouble());
                rec.calcularArea();
                rec.obtenerDatos();
                cad = String.format("%s%s", cad, rec.obtenerCadena());
            }
            if (opc == 3){
                Circulo3 circ = new Circulo3();
                System.out.println("AREA DE UN CIRCULO");
                System.out.println("Ingrese el radio del circulo");
                circ.setRadio(entrada.nextDouble());
                circ.calcularArea();
                circ.obtenerDatos();
                cad = String.format("%s%s", cad, circ.obtenerCadena());
            }
            if (opc == 4){
                Triangulo3 tri = new Triangulo3();
                System.out.println("AREA DE UN TRIANGULO");
                System.out.println("Ingrese la base del triangulo");
                tri.setBaseTriang(entrada.nextDouble());
                System.out.println("Ingrese la altura del triangulo");
                tri.setAlturaTriang(entrada.nextDouble());
                tri.calcularArea();
                tri.obtenerDatos();
                cad = String.format("%s%s", cad, tri.obtenerCadena());
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
