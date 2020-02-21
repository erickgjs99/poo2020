package ejercicioCedula;

import java.util.Scanner;

public class EjecutaCedula {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaracion de variables
        String cedula;
        // Ingreso del numero de cedula porparte del usuario
        System.out.println("Ingrese el numero de cedula a verificar:  ");
        cedula = teclado.nextLine();
        // Creacion del objeto
        Cedula ced = new Cedula(cedula);
        // Lamada al metodo de la presentacion
        ced.presentar();
        // Print final
        System.out.println(ced.presentar());
    }




}
