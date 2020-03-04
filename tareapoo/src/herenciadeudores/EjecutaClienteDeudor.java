package herenciadeudores;

import java.util.Scanner;

public class EjecutaClienteDeudor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declarar Variables
        String nombre, numCliente, numCuenta;
        String cad = "";
        double prestamo;
        int plazo, opc;
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
                prestamo = 0.035;
                System.out.println("Ingrese el nombre del solicitante\n");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el número del cliente\n");
                numCliente = entrada.nextLine();
                System.out.println("Ingrese el número de cuenta\n");
                numCuenta = entrada.nextLine();
                System.out.println("Ingrese el valor del préstamo\n");
                prestamo = entrada.nextDouble();
                System.out.println("Ingrese el plazo a pagar en meses\n");
                plazo = entrada.nextInt();
                CreditoAuto car = new CreditoAuto(nombre, numCliente, numCuenta, prestamo, plazo);
                cad = String.format("%s%s", cad, car.obtenerDatos());
            }
            if (opc == 2){
                prestamo = 0.035;
                System.out.println("Ingrese el nombre del solicitante\n");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el número del cliente\n");
                numCliente = entrada.nextLine();
                System.out.println("Ingrese el número de cuenta\n");
                numCuenta = entrada.nextLine();
                System.out.println("Ingrese el valor del préstamo\n");
                prestamo = entrada.nextDouble();
                System.out.println("Ingrese el plazo a pagar en meses\n");
                plazo = entrada.nextInt();
                PrestamoHipotecario hipo = new PrestamoHipotecario(nombre,
                        numCliente, numCuenta, prestamo, plazo);
                cad = String.format("%s%s", cad, hipo.obtenerDatos());
            }
            if (opc == 3){
                prestamo = 0.035;
                System.out.println("Ingrese el nombre del solicitante\n");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el número del cliente\n");
                numCliente = entrada.nextLine();
                System.out.println("Ingrese el número de cuenta\n");
                numCuenta = entrada.nextLine();
                System.out.println("Ingrese el valor del préstamo\n");
                prestamo = entrada.nextDouble();
                System.out.println("Ingrese el plazo a pagar en meses\n");
                plazo = entrada.nextInt();
                PrestamoPersonal perso = new PrestamoPersonal(nombre,
                        numCliente, numCuenta, prestamo, plazo);
                cad = String.format("%s%s", cad, perso.obtenerDatos());
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
