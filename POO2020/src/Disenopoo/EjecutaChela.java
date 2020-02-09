package Disenopoo;
import java.util.Scanner;


public class EjecutaChela {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        // declarador de variable
        boolean evaluador = true;
        double precio;
        int unidades;
        int iden;
        String name;
        String tipo;
        while (evaluador == true){
            System.out.println("Nombre de la cerveza\n");
            name = sca.nextLine();
            System.out.println("Tipo de cerveza\n");
            tipo = sca.nextLine();
            System.out.println("Precio del producto\n");
            precio = sca.nextDouble();
            System.out.println("Unidades solicitadas\n");
            unidades = sca.nextInt();
            System.out.println("Desea ingresar más datos Presione:\n1._Si\n2._No");
            iden = sca.nextInt();
            if (iden == 2){
                evaluador = false;
            }
            Chela fria = new Chela(precio, unidades, name, tipo);
            String mostrar_datos = fria.obtenerDatos();
            System.out.println(mostrar_datos);
        }
        }
    }

