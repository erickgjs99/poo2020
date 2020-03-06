package ejemplolista;

import java.util.ArrayList;
import java.util.List;

public class Ejemplolista {
    public static void main(String[] args) {
        List<String> universidades = new ArrayList<String>();
        universidades.add("UTPL");
        System.out.println("Tamaño de la lista: " + universidades.size());
        universidades.add("ESPOL");
        System.out.println("Tamaño de la lista: " + universidades.size());
        universidades.add("USFQ");
        System.out.println("Tamaño de la lista: " + universidades.size());
        //ELIMINACION DEL ELEMENTO EN LA POSICION 1
        universidades.remove(1);
        System.out.println("Tamaño de la lista: " + universidades.size());
        //lista pra presentar valores
        universidades.add(1, "HARDVARD");
       /*
        for (int i = 0;i < universidades.size(); i++ ){
            universidades.set(1, "MIT");
            System.out.println(universidades.get(i));
        }

        */

        for (String univ: universidades){
            System.out.println(univ);
        }

    }
}
