package polimorfismodeudores;

import java.util.Scanner;

public class EjecutaClienteDeudor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declarar Variables
        String cad = "";
        int opc;
        boolean verf = true;
        int cont = 0;
        // Concatenamiento de cadena para la Impresión Final
        cad = String.format("%sReporte de Clientes Deudores\nNo.Cliente" +
                "\t\t\tNombre\t\t\tNo.Cuenta\t\t\tInterés por pagar\n", cad);
        // Ciclo While
        while(verf == true){
            System.out.println("Bienvenido\nQue tipo de préstamo desea adquirir:\n" +
                "| 1 | Crédito de Auto\n| 2 | Crédito Hipotecario\n" +
                    "| 3 | Crédito Personal\n| 4 | Salir\n");
            opc = entrada.nextInt();

            entrada.nextLine();
            if (opc == 1){
                CreditoAuto car = new CreditoAuto();
                System.out.println("Ingrese el nombre del solicitante\n");
                car.setNombre(entrada.nextLine());
                System.out.println("Ingrese el número del cliente\n");
                car.setNumCliente(entrada.nextLine());
                System.out.println("Ingrese el número de cuenta\n");
                car.setNumCuenta(entrada.nextLine());
                System.out.println("Ingrese el valor del préstamo\n");
                car.setPrestamo(entrada.nextDouble());
                System.out.println("Ingrese el plazo a pagar en meses\n");
                car.setPlazo(entrada.nextDouble());
                car.interesGanado();
                cad = String.format("%s%s\t\t\t%s\t\t\t%s\t\t\t%.2f\n", cad, car.getNumCliente(), car.getNombre(),
                        car.getNumCuenta(), car.getTotal() );
            }
            if (opc == 2){
                PrestamoHipotecario hipo = new PrestamoHipotecario();
                System.out.println("Ingrese el nombre del solicitante\n");
                hipo.setNombre(entrada.nextLine());
                System.out.println("Ingrese el número del cliente\n");
                hipo.setNumCliente(entrada.nextLine());
                System.out.println("Ingrese el número de cuenta\n");
                hipo.setNumCuenta(entrada.nextLine());
                System.out.println("Ingrese el valor del préstamo\n");
                hipo.setPrestamo(entrada.nextDouble());
                System.out.println("Ingrese el plazo a pagar en meses\n");
                hipo.setPlazo(entrada.nextDouble());
                hipo.interesGanado();
                cad = String.format("%s%s\t\t\t%s\t\t\t%s\t\t\t%.2f\n", cad, hipo.getNumCliente(), hipo.getNombre(),
                        hipo.getNumCuenta(), hipo.getTotal() );
            }
            if (opc == 3){
                PrestamoPersonal perso = new PrestamoPersonal();
                System.out.println("Ingrese el nombre del solicitante\n");
                perso.setNombre(entrada.nextLine());
                System.out.println("Ingrese el número del cliente\n");
                perso.setNumCliente(entrada.nextLine());
                System.out.println("Ingrese el número de cuenta\n");
                perso.setNumCuenta(entrada.nextLine());
                System.out.println("Ingrese el valor del préstamo\n");
                perso.setPrestamo(entrada.nextDouble());
                System.out.println("Ingrese el plazo a pagar en meses\n");
                perso.setPlazo(entrada.nextDouble());
                perso.interesGanado();
                cad = String.format("%s%s\t\t\t%s\t\t\t%s\t\t\t%.2f\n", cad, perso.getNumCliente(), perso.getNombre(),
                        perso.getNumCuenta(), perso.getTotal() );      ;
            }
            if (opc == 4){
                verf = false;
            }
            cont = cont + 1;
        }
        //Impresión del resultado
        System.out.printf("%s\nTOTAL %d CLIENTES\n", cad, cont);



    }
}
