import Tarea_promedio.Notas;

import java.util.Scanner;

public class EjecutaNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declaración de variables
        String cadena = "";
        boolean eval = true;
        String nombre;
        String materia;
        int comprobante;
        double notabim1;
        double notabim2;
        double promedio;
        cadena = String.format("%s\n\t\t%s\n\t\t%s\n%s\n\n%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\n", cadena, "UTPL",
                "Decide ser más", "Sistema de calificaciones", "Estudiante", "Materia", "Nota Primer Bimestre",
                "Nota Segundo Bimestre", "Promedio","Nota Cualitativa");
        // ciclo while para el ingreso de datos por parte del usuario
        while (eval == true){
            System.out.println("Por favor ingrese el nombre completo del estudiante");
            nombre = entrada.nextLine();
            System.out.println("Por favor ingrese la materia del estudiante");
            materia = entrada.nextLine();
            System.out.println("Por favor ingrese la nota del primer bimestre de la materia escrita");
            notabim1 = entrada.nextDouble();
            System.out.println("Por favor ingrese la nota del segundo bimestre de la materia escrita");
            notabim2 = entrada.nextDouble();
            System.out.println("Desea ingresar más datos. Presione:\n1._Si\n2._No");
            comprobante = entrada.nextInt();
            // envío de datos a la clase Notas
            Notas notas = new Notas(nombre, materia, notabim1, notabim2);
            promedio = notas.prom_Estudiante(notabim1, notabim2);
            cadena = String.format("%s%s\t\t\t%s\t\t\t\t%.2f\t\t\t\t\t\t%.2f\t\t\t\t\t%.2f\t\t\t\t%s\n", cadena,
                    nombre, materia, notabim1, notabim2, promedio, notas.notaFinal(promedio));
            if (comprobante == 2){
                eval = false;
            }
            entrada.nextLine();

        }
        System.out.printf("%s", cadena);
    }
}
