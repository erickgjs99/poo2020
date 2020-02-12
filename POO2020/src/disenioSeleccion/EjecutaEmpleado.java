package disenioSeleccion;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //declaracionde variables
        String nombres;
        double horas;
        double cuota;
        double sueldo;

        System.out.println("Ingrese los nombres del empleado\n");
        nombres = entrada.nextLine();
        System.out.println("Ingrese las horas trabajadas por el empleado");
        horas = entrada.nextDouble();
        System.out.println("Ingrese el valor de cuota del empleado");
        cuota = entrada.nextDouble();
        // Creacion del objeto
        Empleado employee = new Empleado(nombres, horas, cuota);
        sueldo = employee.obtenerSueldo();
        String datosEmpleado = employee.obtenerdatos();
        System.out.println(datosEmpleado);
    }
}
