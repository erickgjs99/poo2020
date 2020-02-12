package obtenerDia;

public class Dia {
    // Declaracion de variables
    private int numDia;
    private String nombre;

    /**
     * PAL DIA
     * @param numDia
     */
    public Dia(int numDia){
        this.numDia = numDia;
    }

    /**
     * PARA DETERMINAR QUE DIA CORRESPONDE CON EL NUMERO
     * @return
     */
    public String calcularNombre(){
        switch (getNumDia()){
            case 1:
                nombre = "Ese número corresponde con el día Domingo";
                break;
            case 2:
                nombre = "Ese número corresponde con el día Lunes";
                break;
            case 3:
                nombre = "Ese número corresponde con el día Martes";
                break;
            case 4:
                nombre = "Ese número corresponde con el día Miercoles";
                break;
            case 5:
                nombre = "Ese número corresponde con el día Jueves";
                break;
            case 6:
                nombre = "Ese número corresponde con el día Viernes";
                break;
            case 7:
                nombre = "Ese número corresponde con el día Sabado";
                break;
            default:
                nombre = "ESCRIBE BIEN MIJIN";
                break;
        }
        return  nombre;
    }


    /**
     * PARA OBTEENR EL DIA
     * @return numdia
     */
    public int getNumDia() {
        return numDia;
    }

    /**
     * Para guardar el dia
     * @param numDia
     */
    public void setNumDia(int numDia) {
        this.numDia = numDia;
    }

    /**
     * para obtener el nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * para guardar el nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
