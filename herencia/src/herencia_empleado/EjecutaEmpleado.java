package herencia_empleado;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaracion de variables
        String nombre, cargo, area, edad;
        double salario, horas_trab, sueld_hora;
        boolean verf = true;
        int verf2, verf3;
        String cad = "";

        cad = String.format("%sEmpresa de Embutidos La Italiana\n", cad);

        while (verf == true){
            System.out.println("Que tipo de Empleado desea ingresar sus datos Presione:\n1._Empleado por Horas" +
                    "\n2._Empleado Asalariado\n");
             verf2 = entrada.nextInt();
            entrada.nextLine();
            if (verf2 == 1){
                 System.out.println("Calcular el sueldo de Empleado por Hora\n");
                 System.out.println("Ingrese su Nombre");
                 nombre = entrada.nextLine();
                 System.out.println("Ingrese su edad");
                 edad = entrada.nextLine();
                 System.out.println("Ingrese su cargo en la empresa");
                 cargo = entrada.nextLine();
                 System.out.println("Ingrese su area en la empresa");
                 area = entrada.nextLine();
                 System.out.println("Ingrese las horas trabajadas en la empresa");
                 horas_trab = entrada.nextDouble();
                 System.out.println("Ingrese el valor por hora que gana el empleado");
                 sueld_hora = entrada.nextDouble();

                 EmpleadoHora empl1 = new EmpleadoHora(nombre, edad, cargo, area, horas_trab, sueld_hora);

                 cad = String.format("%s--------------------------------------------------------------------\n" +
                                 "Empleado por Hora\nNombre: %s\nEdad: %s\nCargo: %s\nArea de trabajo: %s\n" +
                                 "Horas trabajadas en el mes: %.2f\nValor de hora del empleado: %.2f\n" +
                                 "TOTAL A PAGAR: %.2f" +
                                 "\n--------------------------------------------------------------------\n",
                         cad, empl1.getNombre(), empl1.getEdad(), empl1.getCargo(),
                         empl1.getArea(), empl1.getHoras_trabajadas(), empl1.getValor_hora(), empl1.salario());
             }
            if (verf2 == 2){
                System.out.println("Calcular el sueldo de Empleado Asalariado\n");
                System.out.println("Ingrese su Nombre");
                nombre = entrada.nextLine();
                System.out.println("Ingrese su edad");
                edad = entrada.nextLine();
                System.out.println("Ingrese su cargo en la empresa");
                cargo = entrada.nextLine();
                System.out.println("Ingrese su area en la empresa");
                area = entrada.nextLine();
                System.out.println("Ingrese el salario mensual del empleado");
                salario = entrada.nextDouble();


                EmpleadoAsalariado empl2 = new EmpleadoAsalariado(nombre, edad, cargo, area, salario);

                cad = String.format("%s--------------------------------------------------------------------\n" +
                                "Empleado por Hora\nNombre: %s\nEdad: %s\nCargo: %s\nArea de trabajo: %s\n" +
                                 "TOTAL A PAGAR: %.2f" +
                                "\n--------------------------------------------------------------------\n",
                        cad, empl2.getNombre(), empl2.getEdad(), empl2.getCargo(),
                        empl2.getArea(), empl2.getSalario());
            }
            System.out.println("Desea ingresar más empleados Presione:\n1._Si\n2._No");
            verf3 = entrada.nextInt();
            if (verf3 == 2){
                verf = false;
            }
            entrada.nextLine();
        }
        System.out.printf("%sGRACIAS", cad);

    }
}
