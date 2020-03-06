package datos_tipo_objeto;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaracion de Variables
        int cont, opc;

        boolean verf = true;
        Estudiante [] estudiantes = new Estudiante[3];
        Estudiante estudiante;

        for (cont = 0;cont < estudiantes.length; cont++){
                System.out.println("INGRESO DE NUEVOS ESTUDIANTES");
                Estudiante est = new Estudiante();
                System.out.println("Ingrese el nombre del estudiante");
                est.setNombre(entrada.nextLine());
                System.out.println("Ingrese la cedula del estudiante");
                est.setCedula(entrada.nextLine());
                System.out.println("Ingrese la edad del estudiante");
                est.setEdad(entrada.nextInt());
                entrada.nextLine();
                System.out.println("Ingrese la carrear del estudiante");
                est.setCarrera(entrada.nextLine());
                System.out.println("Ingrese el correo del estudiante");
                est.setCorreo(entrada.nextLine());
                // Asignamos est a la variable estudiante
                estudiantes[cont] = est;

        }

        System.out.println("LISTA DE ESTUDIANTES");
        System.out.println("Nombre\t\t\tCedula");
        int edad_acum = 0;
        double prom;
        for (cont = 0 ; cont < estudiantes.length;cont++){
            edad_acum += estudiantes[cont].getEdad();
            System.out.println(estudiantes[cont].getNombre()+"\t\t\t\t"+estudiantes[cont].getCedula());
        }
        prom = edad_acum / estudiantes.length;
        System.out.println("El promedio de edad es igual a "+ prom);
        System.out.println("FIN DEL PROGRAMA");
    }
}
