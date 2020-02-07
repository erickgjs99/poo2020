package intropoo;

public class EjecutaTiempo {
    public static void main(String[] args) {
    // Creacion de objeto Tiempo
        Tiempo tiempo = new Tiempo();
        tiempo.actualizarHora(10);
        tiempo.actualizarMinuto(51);
        tiempo.actualizarsegundo(35);
        String mostrar_tiempo = tiempo.obtenerTiempo();
        System.out.println(mostrar_tiempo);
    }
}




