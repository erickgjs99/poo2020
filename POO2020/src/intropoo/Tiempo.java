package intropoo;

public class Tiempo {
    //Definicion de atributos
    private int hora;
    private int minuto;
    private int segundo;


    /**
     * Método para obtener el valor de la variable hora
     * @return this.hora
     */
    public int obtenerHora(){
        return this.hora;
    }

    /**
     * Método para obtener el valor de la variable minuto
     * @return this.minuto
     */
    public int obtenerMinuto(){
        return this.minuto;
    }

    /**
     * Método para obtener el valor de la variable segundo
     * @return this.segundo
     */
    public int obtenerSegundo(){
        return this.segundo;
    }

    /**
     * Método para obtener el tiempo en tipo String
     * @return tiempo
     */
    public String obtenerTiempo(){
        String tiempo = hora+":"+minuto+":"+segundo;
        return tiempo;
    }

    /**
     * Método para obtener el valor de la variable hora
     * @param hora
     */
    public void actualizarHora(int hora){
        // con el this hacemos referencia a variables globales
        this.hora = hora;
    }

    /**
     *Método para obtener la actualizacion de minuto
     * @param minuto
     */
    public void actualizarMinuto(int minuto){
        // con el this hacemos referencia a variables globales
        this.minuto = minuto;
    }

    /**
     * Método para obtener la actualizacion de segundo
     * @param segundo
     */
    public void actualizarsegundo(int segundo){
        // con el this hacemos referencia a variables globales
        this.segundo = segundo;
    }
}
