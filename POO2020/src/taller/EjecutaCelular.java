package taller ;

public class EjecutaCelular {
    public static void main(String[] args) {

        // Creación de Objeto Celular

        Celular cell1 = new Celular();

        cell1.actualizar_marca("Samsung");
        cell1.actualizar_modelo("S10 E");
        cell1.actualizar_procesador("Snapdragon 865 2.84GHz");
        cell1.actualizar_ram("12 GB");
        cell1.actualizar_rom("256 GB");

        String mostrar_informacion = cell1.obtener_infoCelular();
        System.out.println(mostrar_informacion);

    }
}