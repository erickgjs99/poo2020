package herencia;


import java.util.Date;
import java.util.Scanner;

public class EjecutaPersonal {
    public static void main(String[] args) {
        // Creacion del objeto de la clase Estudiante
        Scanner entrada = new Scanner(System.in);
        String nombre, ident, estado, carrera, area, fecha;

        System.out.println("INGRESO DE DATOS DEL ESTUDIANTE");
        System.out.println("Ingrese el nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la cedula");
        ident = entrada.nextLine();
        System.out.println("Ingrese su carrera");
        carrera = entrada.nextLine();
        System.out.println("Ingrese el estado civil");
        estado = entrada.nextLine();
        System.out.println("Ingrese su fecha de nacimiento");
        fecha = entrada.nextLine();

        Estudiante est = new Estudiante(nombre, ident, carrera, estado, fecha);


        System.out.println("----------------------------------------------------");
        System.out.printf("Datos de objeto estudiante\nNombre: %s\nNúmero de Identificacion: %s\nCarrera: %s\n" +
                "Estado civil: %s\nfecha de nacimiento: %s\n", est.getNombre(), est.getCedula(), est.getCarrera(),
                est.getEstado_civil(), est.getFecha_nacimiento());
        System.out.println("----------------------------------------------------\n");

        System.out.println("INGRESO DE DATOS DEL DOCENTE");
        System.out.println("Ingrese el nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la cedula");
        ident = entrada.nextLine();
        System.out.println("Ingrese su área de trabajo");
        area = entrada.nextLine();
        System.out.println("Ingrese el estado civil");
        estado = entrada.nextLine();
        System.out.println("Ingrese su fecha de nacimiento");
        fecha = entrada.nextLine();

        Docente doc = new Docente(nombre, ident, area, estado, fecha);

        System.out.println("----------------------------------------------------");
        System.out.printf("Datos de objeto docente\nNombre: %s\nNúmero de Identificacion: %s\nCarrera: %s\n" +
                        "Estado civil: %s\nfecha de nacimiento: %s\n", doc.getNombre(), doc.getCedula(), doc.getArea(),
                doc.getEstado_civil(), doc.getFecha_nacimiento());
        System.out.println("----------------------------------------------------\n");

        System.out.println("INGRESO DE DATOS DEL PERSONAL ADMINISTRATIVO");
        System.out.println("Ingrese el nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la cedula");
        ident = entrada.nextLine();
        System.out.println("Ingrese su dependencia");
        area = entrada.nextLine();
        System.out.println("Ingrese el estado civil");
        estado = entrada.nextLine();
        System.out.println("Ingrese su fecha de nacimiento");
        fecha = entrada.nextLine();

        Administracion admin = new Administracion(nombre, ident, area, estado, fecha);
        System.out.println("----------------------------------------------------");
        System.out.printf("Datos de objeto personal administrativo\nNombre: %s\nNúmero de Identificacion: %s\nCarrera: %s\n" +
                        "Estado civil: %s\nfecha de nacimiento: %s\n", admin.getNombre(), admin.getCedula(),
                admin.getDependencia(), admin.getEstado_civil(), admin.getFecha_nacimiento());
        System.out.println("----------------------------------------------------\n");

    }
}
