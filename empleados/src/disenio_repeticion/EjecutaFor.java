package disenio_repeticion;

import java.util.Scanner;

public class EjecutaFor {
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
        System.out.println("Cuantos empleados desea ingresar para el respectivo informe");
        verf = teclado.nextInt();
        //limpieza del buffer
        // Ciclo for para el ingreso de datos
        teclado.nextLine();
        for (int i = 0; i < verf; i++){
            System.out.println("Ingrese el nombre del empleado:\n");
            nombre = teclado.nextLine();

            System.out.println("Ingrese las horas trabajas:\n");
            htrabajadas = teclado.nextDouble();

            System.out.println("Ingrese el sueldo por hora del empleado :\n");
            vhoras = teclado.nextDouble();

            Empleado employee = new Empleado(nombre,vhoras,htrabajadas);
            cad = String.format("%s%s", cad, employee.obtenerDatos());
            teclado.nextLine();
        }

        System.out.printf("%s", cad);
    }
}
