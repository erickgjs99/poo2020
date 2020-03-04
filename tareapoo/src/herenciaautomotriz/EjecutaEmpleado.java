package herenciaautomotriz;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaracion de Variables
        String nombre, departamento, cargo;
        String cad = "";
        double sueldo;
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
                System.out.println("Ingrese el nombre\n");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el departamento del empleado\n");
                departamento = entrada.nextLine();
                System.out.println("Ingrese el puesto del empleado\n");
                cargo = entrada.nextLine();
                System.out.println("Ingrese el sueldo mensual del empleado\n");
                sueldo = entrada.nextDouble();
                EmpleadoAdmi admi = new EmpleadoAdmi(sueldo,nombre,cargo, departamento);
                cad = String.format("%s%s", cad, admi.obtenerCadena());
            }
            if (opc == 2){
                System.out.println("Ingrese el nombre\n");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el departamento del empleado\n");
                departamento = entrada.nextLine();
                System.out.println("Ingrese el puesto del empleado\n");
                cargo = entrada.nextLine();
                System.out.println("Ingrese el valor total de trabajos realizados del empleado\n");
                sueldo = entrada.nextDouble();
                EmpleadoMeca mec = new EmpleadoMeca(sueldo,nombre,cargo, departamento);
                cad = String.format("%s%s", cad, mec.obtenerCadena());
            }
            if (opc == 3){
                System.out.println("Ingrese el nombre\n");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el departamento del empleado\n");
                departamento = entrada.nextLine();
                System.out.println("Ingrese el puesto del empleado\n");
                cargo = entrada.nextLine();
                System.out.println("Ingrese el valor total de ventas realizadas del empleado\n");
                sueldo = entrada.nextDouble();
                EmpleadoVen vend = new EmpleadoVen(sueldo,nombre,cargo, departamento);
                cad = String.format("%s%s", cad, vend.obtenerCadena());
            }
            cont = cont + 1;
            if (opc == 4){
                verf = false;
            }
        }
        System.out.printf("%s\nTotal de empleados ingresados en la nómina: %d\n",cad, cont);

    }
}
