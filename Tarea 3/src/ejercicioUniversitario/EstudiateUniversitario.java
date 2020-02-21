package ejercicioUniversitario;

public class EstudiateUniversitario {
    // Declaracion de Variables
    private String[] nombre = new String[5];
    private int[] edad = new int[5];
    private String[] universidad = new String[5];
    private String[] celular = new String[5];
    /**
     * Método Constructor de la clase EstudianteUniversitario
     * @param nombre
     * @param edad
     * @param universidad
     * @param celular
     */
    public EstudiateUniversitario(String nombre[], int edad[], String universidad[], String celular[]){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setUniversidad(universidad);
        this.setCelular(celular);
    }

    // Métodos get y set de las variables globales
    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public int[] getEdad() {
        return edad;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    public String[] getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String[] universidad) {
        this.universidad = universidad;
    }

    public String[] getCelular() {
        return celular;
    }

    public void setCelular(String[] celular) {
        this.celular = celular;
    }
 }
