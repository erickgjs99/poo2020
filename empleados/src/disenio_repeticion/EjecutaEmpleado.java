package disenio_repeticion;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaracion de Variables
        double htrabajadas;
        String nombre;
        double vhoras;
        boolean verificador = true;
        int verf;
        String cad = "";
        cad = String.format("%s%s\n%s\t\t\t%s\t\t%s\t\t%s\n", cad, "Informe del Sueldo del Empleado",
                "Nombre del Empleado", "Horas trabajadas", "Sueldo por hora", "Sueldo total del empleado");
        // Preguntas al usuario

        while (verificador == true){
            System.out.println("Ingrese el nombre del empleado:\n");
            nombre = teclado.nextLine();

            System.out.println("Ingrese las horas trabajas:\n");
            htrabajadas = teclado.nextDouble();

            System.out.println("Ingrese el sueldo por hora del empleado :\n");
            vhoras = teclado.nextDouble();

            Empleado employee = new Empleado(nombre,vhoras,htrabajadas);
            cad = String.format("%s%s", cad, employee.obtenerDatos());

            System.out.println("Desea ingresar más empleados Presione:\n1._Si\n2._No\n");
            verf = teclado.nextInt();
            if (verf == 2){
                verificador = false;
            }
            teclado.nextLine();
        }

        System.out.printf("%s", cad);


    }
}
