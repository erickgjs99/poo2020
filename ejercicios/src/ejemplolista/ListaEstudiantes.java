package ejemplolista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Estudiante2> estudiantes = new ArrayList<Estudiante2>();
        int opc;
        boolean verf = true;
        String cad = "";
        do {
            System.out.println("Digite | 1 | para almacenar nuevo Estudiante");
            System.out.println("Digite | 2 | para presentar informe");
            System.out.println("Digite | 3 | para salir");
            opc = entrada.nextInt();
            entrada.nextLine();
            switch (opc) {
                case 1:
                    Estudiante2 est = new Estudiante2();
                    System.out.println("Ingrese la nombre");
                    est.setNombre(entrada.nextLine());
                    System.out.println("Ingrese la cedula");
                    est.setCedula(entrada.nextLine());
                    System.out.println("Ingrese la carrera");
                    est.setCarrera(entrada.nextLine());
                    System.out.println("Ingrese la edad");
                    est.setEdad(entrada.nextInt());
                    entrada.nextLine();
                    System.out.println("Ingrese el correo");
                    est.setCorreo(entrada.nextLine());
                    // Agregamos objeto Estudianteswi
                    estudiantes.add(est);
                    break;
                case 2:
                    //Recorremos lista con forech
                    for (Estudiante2 v : estudiantes) {
                        System.out.println("-----------------");
                        System.out.println("Nombre: " + v.getNombre());
                        System.out.println("Cedula: " + v.getCedula());
                        System.out.println("Carrera: " + v.getCarrera());
                        System.out.println("Edad: " + v.getEdad());
                        System.out.println("Correo: " + v.getCorreo());
                        System.out.println("-----------------");
                    }
                    break;
                case 3:
                    verf = false;
                    break;
                default:
                    System.out.println("Entrada no valida");
            }
        } while (verf == true);

        System.out.println("FIN DEL PROGRAMA");
    }
}
