package Ejercicio2;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaracion de Variables

        double htrabajadas;
        String nombre;
        double vhoras;
        String cadFinal;
        // Preguntas al usuario
        System.out.println("Ingrese el nombre del empleado: \n");
        nombre = teclado.nextLine();

        System.out.println("Ingrese las horas trabajas: \n");
        htrabajadas = teclado.nextDouble();

        System.out.println("Ingrese el sueldo por hora del empleado : \n");
        vhoras = teclado.nextDouble();

        Empleado employee = new Empleado(nombre,vhoras,htrabajadas);
        cadFinal = employee.obtenerDatos();
        System.out.println(cadFinal);

    }

}
