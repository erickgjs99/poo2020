package herenciainversionistas;


import java.util.Scanner;
public class EjecutaInversionista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaracion de Variables
        String cad = "";
        boolean verf = true;
        String nombre, num_cuenta;
        double capital_inicio, capital_actual, capital, anios;
        double total_intereses = 0;
        int cont = 0;
        int condicion, opc;


        cad = String.format("%s%s\n%s\t\t\t%s\t\t\t%s\t\t\t%s\n", cad, "REPORTE DE INVERSIONES", "No.Cliente",
                "NOMBRE", "No. Cuenta", "Interés ganado");
        // Ciclo While para el ingreso de los datos
        while (verf == true) {
            System.out.println("Ingrese su nombre:\n");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su número de cuenta:\n");
            num_cuenta = entrada.nextLine();
            // Ingreso del tipo de prestamo
            System.out.println("Ingrese el tipo de cuenta del inversionista:\n| 1 | Cuenta de ahorro\n" +
                    "| 2 |Cuenta Maestra\n| 3 |Cuenta pagaré\n| 4 | Imprimir Reporte");
            opc = entrada.nextInt();
            entrada.nextLine();
            // Cuenta de ahorros
            if (opc == 1) {
                System.out.println("Ingrese el capital:\n");
                capital = entrada.nextDouble();
                System.out.println("Ingrese el plazo anual a pagar el capital:\n");
                anios = entrada.nextDouble();
                // Creacion del objeto
                CuentaAhorro cuentaAhorro = new CuentaAhorro(nombre, num_cuenta, capital, anios);
                cuentaAhorro.interes();
                cad = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cad, cont, cuentaAhorro.getNombre(), cuentaAhorro.getNum_cuenta(),
                        cuentaAhorro.presentarIntereses());
                cont += 1;
                total_intereses = total_intereses + cuentaAhorro.presentarIntereses();
            }
            // Condición para el cuenta maestra
            if (opc == 2) {
                System.out.println("Ingrese el capital con el que inicio:\n");
                capital_inicio = entrada.nextDouble();
                System.out.println("Ingrese el capital que tiene actualmente:\n");
                capital_actual = entrada.nextDouble();
                System.out.println("Ingrese los años desde su capital inicial:\n");
                anios = entrada.nextDouble();
                // Creacion del objeto
                CuentaMaestra cuentaMaestra = new CuentaMaestra(nombre, num_cuenta, capital_inicio, capital_actual, anios);
                cuentaMaestra.interes();
                cad = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cad, cont, cuentaMaestra.getNombre(), cuentaMaestra.getNum_cuenta(),
                        cuentaMaestra.presentarIntereses());
                cont += 1;
                total_intereses = total_intereses + cuentaMaestra.presentarIntereses();
            }
            // Condicion para la cuenta pagare
            if (opc == 3) {
                System.out.println("Ingrese el capital que pagará:\n");
                capital = entrada.nextDouble();
                System.out.println("Ingrese los años en lo que pagará el capital:\n");
                anios = entrada.nextDouble();
                // Creacion del objeto
                Pagare pagare = new Pagare(nombre, num_cuenta, capital, anios);
                pagare.interes();
                cad = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cad, cont, pagare.getNombre(), pagare.getNum_cuenta(),
                        pagare.presentarIntereses());
                cont += 1;
                total_intereses = total_intereses + pagare.presentarIntereses();
            }
            if (opc == 4) {
                verf = false;
            }
            entrada.nextLine();
        }
        // Presentacion final
        System.out.printf("%s\nTOTAL:%d clientes\t\t\t\t\t\t\t\t\t\t\t\t%.2f\n", cad, cont, total_intereses);
    }
}

