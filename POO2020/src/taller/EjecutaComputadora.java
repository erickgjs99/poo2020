package taller;

public class EjecutaComputadora {
    public static void main(String[] args) {
        Computadora comp1 = new Computadora();
        comp1.actualizar_marca("Asus Rog Strig 3");
        comp1.actualizar_peso(2.5);
        comp1.actualizar_procesador("i7 Novena Generación");
        comp1.actualizar_pulgadas(17.5);
        comp1.actualizar_ram("16 GB");
        comp1.actualizar_rom("1 TB");

        String mostrar_informacion = comp1.obtener_infoComputadora();
        System.out.println(mostrar_informacion);
    }
}

