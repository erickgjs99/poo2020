package ejercicioUniversitario;


import java.util.Scanner;

public class EjecutaEstudianteUniversitario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaracion de Variables
        String [] nombre = new String[5];
        int [] edad = new int[5];
        String [] universidad = new String[5];
        String [] celular = new String[5];
        String informe = " ";

        // Ingreso de datos por JOptionPane
        System.out.println("Ingrese Información de los Estudiantes");
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Ingrese Información para Estudiante "+(i+1));
            System.out.println("Ingrese Nombre");
            nombre[i] = entrada.nextLine();
            System.out.println("Ingrese edad");
            edad[i] = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese Universidad");
            universidad[i] = entrada.nextLine();
            System.out.println(("Ingrese Celular"));
            celular[i] = entrada.nextLine();
            entrada.nextLine();
        }

        // Creacion de objeto
        EstudiateUniversitario estudiante = new EstudiateUniversitario(nombre,edad,universidad,celular);

        // Impresion de resultados
        for (int i = 0; i < nombre.length; i++) {
            informe = (String.format("%sNombre: %s\n Edad: %d\n Universidad: %s\n Celular: %s\n\n",informe,
                    estudiante.getNombre()[i],estudiante.getEdad()[i],estudiante.getUniversidad()[i],
                    estudiante.getCelular()[i]));
        }
        System.out.println("Informe estudiante Universitarios\n"+informe);
    }
}
