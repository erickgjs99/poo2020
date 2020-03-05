package polimorfismoinversionistas;


import java.util.Scanner;
public class EjecutaInversionista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaracion de Variables
        String cad = "";
        boolean verf = true;
        int cont = 0;
        int condicion, opc;
        double total = 0;


        cad = String.format("%s%s\n%s\t\t\t%s\t\t\t\t%s\t\t\t\t\t%s\n", cad, "REPORTE DE INVERSIONES", "No.Cliente",
                "NOMBRE", "No. Cuenta", "Interés ganado");
        // Ciclo While para el ingreso de los datos
        while (verf == true) {
            // Ingreso del tipo de prestamo
            System.out.println("Ingrese el tipo de cuenta del inversionista:\n| 1 | Cuenta de ahorro\n" +
                    "| 2 |Cuenta Maestra\n| 3 |Cuenta pagaré\n| 4 | Imprimir Reporte");
            opc = entrada.nextInt();
            entrada.nextLine();
            // Cuenta de ahorros
            if (opc == 1) {
                CuentaAhorro ch = new CuentaAhorro();
                System.out.println("Ingrese su nombre:\n");
                ch.setNombre(entrada.nextLine());
                System.out.println("Ingrese su número de cuenta:\n");
                ch.setNum_cuenta(entrada.nextLine());
                System.out.println("Ingrese el capital:\n");
                ch.setCapital(entrada.nextDouble());
                System.out.println("Ingrese el plazo anual a pagar el capital:\n");
                ch.setPlazo(entrada.nextDouble());

                ch.interesGanado();
                cad = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cad, cont, ch.getNombre(), ch.getNum_cuenta(),
                        ch.getInteres());
                cont += 1;
                total = total + ch.getInteres();
            }
            // Condición para el cuenta maestra
            if (opc == 2) {
                CuentaMaestra cm = new CuentaMaestra();
                System.out.println("Ingrese su nombre:\n");
                cm.setNombre(entrada.nextLine());
                System.out.println("Ingrese su número de cuenta:\n");
                cm.setNum_cuenta(entrada.nextLine());
                System.out.println("Ingrese el capital con el que inicio:\n");
                cm.setCapital_inicio(entrada.nextDouble());
                System.out.println("Ingrese el capital que tiene actualmente:\n");
                cm.setCapital_actual(entrada.nextDouble());
                System.out.println("Ingrese los años desde su capital inicial:\n");
                cm.setAnios(entrada.nextDouble());
                // Creacion del objeto

                cm.interesGanado();
                cad = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cad, cont, cm.getNombre(), cm.getNum_cuenta(),
                        cm.getInteres());
                cont += 1;
                total = total + cm.getInteres();
            }
            // Condicion para la cuenta pagare
            if (opc == 3) {
                Pagare pagare = new Pagare();
                System.out.println("Ingrese su nombre:\n");
                pagare.setNombre(entrada.nextLine());
                System.out.println("Ingrese su número de cuenta:\n");
                pagare.setNum_cuenta(entrada.nextLine());
                System.out.println("Ingrese el capital que pagará:\n");
                pagare.setCapital(entrada.nextDouble());
                System.out.println("Ingrese los años en lo que pagará el capital:\n");
                pagare.setAnios(entrada.nextDouble());
                pagare.interesGanado();
                cad = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cad, cont, pagare.getNombre(), pagare.getNum_cuenta(),
                        pagare.getInteres());
                cont += 1;
                total = total + pagare.getInteres();
            }
            if (opc == 4) {
                verf = false;
            }
            entrada.nextLine();
        }
        // Presentacion final
        System.out.printf("%s\nTOTAL:%d clientes\t\t\t\t\t\t\t\t\t\t\t\t%.2f\n", cad, cont, total);
    }
}

