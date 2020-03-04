package polimorfismo_poo;

import java.util.Scanner;

public class EejcutaEmpleado12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        EmpleadoPorHoras2 emplH = new EmpleadoPorHoras2();
        System.out.println("Calculo sueldo quincenal empleado por hora");
        System.out.println("Ingrese las Horas trabajadas");
        emplH.setHoras_trabajadas(entrada.nextDouble());
        System.out.println("Ingrese la cuota por hora");
        emplH.setCuota_por_hora(entrada.nextDouble());
        emplH.calcularSueldoQna();
        System.out.println("El sueldo Quincenal es " + emplH.getSueldo());
        EmpleadoAsalariado2 empl2 = new EmpleadoAsalariado2();
        System.out.println("Calculo de sueldo quincenal de un empleado asalariado");
        System.out.println("Ingrese sueldo mensual::");
        empl2.setSueldo_mensual(entrada.nextDouble());
        empl2.calcularSueldoQna();
        System.out.println("Sueldo Quincenal es " + empl2.getSueldo());
    }
}
