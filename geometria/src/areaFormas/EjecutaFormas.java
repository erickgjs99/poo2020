package areaFormas;

import java.util.Scanner;

public class EjecutaFormas {
    public static void main(String[] args) {
        // Para la entrada de datos en el programa
        Scanner entrada = new Scanner(System.in);
        // Declaracion  de variables
        int opcion, opcion2;
        boolean verf = true;
        String cad = "";
        double base, altura, lado, radio;
        cad = String.format("%sAREA DE FIGURAS\nNombre de la Figura\t\t Area de la Figura\n", cad);
        // While para preguntar el usuario
        while(verf == true){
            System.out.println("BIENVENIDO\nELIGE LA FIGURA PARA CALCULAR EL AREA PRESIONA\n1._TRIANGULO\n" +
                    "2._CUADRADO\n3._RECTANGULO\n4._CIRCULO\n");
            opcion = entrada.nextInt();
            if (opcion == 1){
                System.out.println("AREA DE UN TRIANGULO");
                System.out.println("Ingrese la Base");
                base = entrada.nextDouble();
                System.out.println("Ingrese la Altura");
                altura = entrada.nextDouble();
                Triangulo tri = new Triangulo(base, altura);
                cad = String.format("%s%s", cad, tri.cadenaArea());
            }
            if (opcion == 2){
                System.out.println("AREA DE UN CUADRADO");
                System.out.println("Ingrese un lado del cuadrado");
                lado = entrada.nextDouble();
                Cuadrado cua = new Cuadrado(lado);
                cad = String.format("%s%s", cad, cua.cadenaArea2());
            }
            if (opcion == 3){
                System.out.println("AREA DE UN RECTANGULO");
                System.out.println("Ingrese la Base del Rectangulo");
                base = entrada.nextDouble();
                System.out.println("Ingrese la Altura del Rectangulo");
                altura = entrada.nextDouble();
                Rectangulo rec = new Rectangulo(base, altura);
                cad = String.format("%s%s", cad, rec.cadenaArea3());
            }
            if (opcion == 4){
                System.out.println("AREA DE UN CIRCULO");
                System.out.println("Ingrese el radio del Circulo");
                radio = entrada.nextDouble();
                Circulo cir = new Circulo(radio);
                cad = String.format("%s%s", cad, cir.cadenaArea4());
            }else {
                if (opcion > 4){
                    System.out.println("INGRESE UNA OPCION VALIDA");
                }
            }
            System.out.println("DESEA INGRESAR MAS FORMAS PRESIONE:\n1._SI\n2._NO\n");
            opcion2 = entrada.nextInt();
            if (opcion2 == 2){
                verf = false;
            }
            entrada.nextLine();
        }
        // Impresion de los resultados
        System.out.printf("%s", cad);
        // Fin
    }
}
