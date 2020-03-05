package polimorfismoautomotriz;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaracion de Variables
        String cad = "";
        boolean verf = true;
        int cont = 0;
        int opc;
        cad = String.format("%sReporte de Nómina Quincenal\nNombre\t\t\t\t" +
                "Departamento\t\t\t\tPuesto\t\t\t\tSueldo Quincenal\n",cad);
        // Ciclo While
        while (verf == true){
            System.out.println("Bienvenido\nQue tipo de empleado desea " +
                    "ingresar a la nómina quincenal\n| 1 | Administrativo\n" +
                    "| 2 | Mecánico\n| 3 | Vendedor\n| 4 | Imprimir reporte final\n");
            opc = entrada.nextInt();
            entrada.nextLine();
            if (opc == 1){
                EmpleadoAdmi admi = new EmpleadoAdmi();
                System.out.println("Ingrese el nombre\n");
                admi.setNombre(entrada.nextLine());
                System.out.println("Ingrese el departamento del empleado\n");
                admi.setDepartamento(entrada.nextLine());
                System.out.println("Ingrese el puesto del empleado\n");
                admi.setPuesto(entrada.nextLine());
                System.out.println("Ingrese el sueldo mensual del empleado\n");
                admi.setSueldo(entrada.nextDouble());
                admi.calcularQuincena();
                cad = String.format("%s%s\t\t\t%s\t\t\t%s\t\t\t%.2f\n", cad, admi.getNombre(), admi.getDepartamento(),
                        admi.getPuesto(), admi.getTotal());
            }
            if (opc == 2){
                EmpleadoMeca mec = new EmpleadoMeca();
                System.out.println("Ingrese el nombre\n");
                mec.setNombre(entrada.nextLine());
                System.out.println("Ingrese el departamento del empleado\n");
                mec.setDepartamento(entrada.nextLine());
                System.out.println("Ingrese el puesto del empleado\n");
                mec.setPuesto(entrada.nextLine());
                System.out.println("Ingrese el valor total de trabajos realizados durante el mes del empleado\n");
                mec.setSueldo(entrada.nextDouble());
                mec.calcularQuincena();
                cad = String.format("%s%s\t\t\t%s\t\t\t%s\t\t\t%.2f\n", cad, mec.getNombre(), mec.getDepartamento(),
                        mec.getPuesto(), mec.getTotal());
            }
            if (opc == 3){
                EmpleadoVen vend = new EmpleadoVen();
                System.out.println("Ingrese el nombre\n");
                vend.setNombre(entrada.nextLine());
                System.out.println("Ingrese el departamento del empleado\n");
                vend.setDepartamento(entrada.nextLine());
                System.out.println("Ingrese el puesto del empleado\n");
                vend.setPuesto(entrada.nextLine());
                System.out.println("Ingrese las ventas realizadas durante el mes del vendedor\n");
                vend.setVentasrealizadas(entrada.nextInt());
                System.out.println("Ingrese el valor total de ventas del empleado\n");
                vend.setVentatotal(entrada.nextDouble());
                vend.calcularQuincena();
                cad = String.format("%s%s\t\t\t%s\t\t\t%s\t\t\t%.2f\n", cad, vend.getNombre(), vend.getDepartamento(),
                        vend.getPuesto(), vend.getTotal());
            }
            cont = cont + 1;
            if (opc == 4){
                verf = false;
            }
        }
        System.out.printf("%s\nTotal de empleados ingresados en la nómina: %d\n",cad, cont);

    }
}
