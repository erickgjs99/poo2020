package Tarea_promedio;

public class Notas {
    // Variables para el ejercicio
    private String nombres;
    private String materia;
    private double notBim1;
    private double notBim2;
    private double promEstudent;
    private double promTotal;

    /**
     * Un constructor para el envío de notas.
     * @param nombres
     * @param notBim1
     * @param notBim2
     */
    public Notas(String nombres,String materia, double notBim1, double notBim2) {
        this.nombres = nombres;
        this.materia = materia;
        this.notBim1 = notBim1;
        this.notBim2 = notBim2;
    }

    /**
     * Método para obtener el promedio del estudiante.
     * @param notBim1
     * @param notBim2
     * @return
     */
    public double prom_Estudiante(double notBim1, double notBim2){
        promEstudent = (notBim1 + notBim2);
        return  promEstudent;
    }


    /**
     * Método para lanzar una cadena si pasa o no el estudiante cursante.
     * @param promEstudent
     * @return
     */
    public String notaFinal(double promEstudent){
        String cad = "";
        if (promEstudent >= 28){
            cad = "El estudiante pasa la materia exitosamente.";
        }
        if (promEstudent < 28){
            cad = "El estudiante pasa directamente Evaluación Final.";
        }
        if (promEstudent < 20){
            cad = "El estudiante pasa a Evaluación de recuperación(Final).";
        }
        return  cad;
    }

    /**
     * Método para obtener el nombre
     * @return nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Método set del nombre
     * @param nombres
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * Método para obtener la nota del primer bimestre
     * @return
     */
    public double getNotBim1() {
        return notBim1;
    }

    /**
     * Método set de la nota del primer bimestre.
     * @param notBim1
     */
    public void setNotBim1(double notBim1) {
        this.notBim1 = notBim1;
    }

    /**
     * Método para obtener la nota del segundo bimestre
     * @return
     */
    public double getNotBim2() {
        return notBim2;
    }

    /**
     * Método set del segundo bimestre
     * @param notBim2
     */
    public void setNotBim2(double notBim2) {
        this.notBim2 = notBim2;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        materia = materia;
    }
}
