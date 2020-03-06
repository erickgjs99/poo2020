package ejemplolista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        boolean verf = true;
        int opc;
        // Sistema para ingresar los vehiculos
        do {
            System.out.println("Digite | 1 | para almacenar nuevo vehiculo");
            System.out.println("Digite | 2 | para presentar vehiculos");
            System.out.println("Digite | 3 | para salir");
            opc = entrada.nextInt();
           switch (opc){
               case 1:
                Vehiculo veh = new Vehiculo();
                   System.out.println("Ingrese la placa");
                   veh.setPlaca(entrada.nextLine());
                   System.out.println("Ingrese la marca");
                   veh.setMarca(entrada.nextLine());
                   System.out.println("Ingrese el modelo");
                   veh.setModelo(entrada.nextLine());
                   System.out.println("Ingrese el año");
                   veh.setAnio(entrada.nextInt());
                   entrada.nextLine();
                   System.out.println("Ingrese el color");
                   veh.setColor(entrada.nextLine());
                   System.out.println("Ingrese cilindraje");
                   veh.setCilindraje(entrada.nextInt());
                   // Agregamos objeto vehiculos
                   vehiculos.add(veh);
                   break;
               case 2:
                   //Recorremos lista con forech
                   //System.out.println("PLACA\t\t\tMARCA\t\t\tCILINDRAJE\n");
                   for (Vehiculo v: vehiculos){
                       System.out.println("-----------------");
                       System.out.println("Placa: "+ v.getPlaca());
                       System.out.println("Marca: "+ v.getMarca());
                       System.out.println("Modelo: "+ v.getModelo());
                       System.out.println("Año: "+ v.getAnio());
                       System.out.println("Cilindraje: "+ v.getCilindraje());
                       System.out.println("Color: "+ v.getColor());
                       System.out.println("-----------------");

                       //System.out.println(v.getPlaca()+"\t\t\t"+v.getMarca()+"\t\t\t"+v.getCilindraje()+"\n");
                   }
                   break;
               case 3:
                   verf = false;
                   break;
               default:
                   System.out.println("Entrada no valida");
            }


        }while (verf == true);



    }
}
