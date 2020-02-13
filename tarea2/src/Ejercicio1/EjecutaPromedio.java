package Ejercicio1;

import java.util.Scanner;

public class EjecutaPromedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaracion de variables
        double c1;
        double c2;
        double c3;
        double c4;
        // Ingreso de datos por JOptionPanel
        System.out.println("Ingrese nota del primer examen");
        c1 = entrada.nextDouble();
        System.out.println("Ingrese nota del segundo examen");
        c2 = entrada.nextDouble();
        System.out.println("Ingrese nota del tercer examen");
        c3 = entrada.nextDouble();
        System.out.println("Ingrese nota del cuarto examen");
        c4 = entrada.nextDouble();


        // Creacion de objeto
        Promedio alumno = new Promedio(c1,c2,c3,c4);
        // Muestra en pantalla de resultado por medio de JOptionPane
        System.out.println("PROMEDIO DEL ESTUDIANTE\n"+
                "Notas: "+alumno.getC1()+"\n             "+alumno.getC2()+"\n             "+alumno.getC3()+
                "\n             "+alumno.getC4()+"\nPROMEDIO: "+alumno.promedioAlum()+"\n"+
                "ESTADO ESTUDIANTE: "+alumno.estadoAlum());
    }

}
