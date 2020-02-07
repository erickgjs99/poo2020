package taller;

public class Animal {
    // Declaración de variables globales
    private String raza;
    private int peso;
    private String comida;
    private int horas;
    private String celo;
    private int metros;
    //metodos de comer duerme reproduce y camina

    /**
     * Metodo que sirve para indicar que animal esta comiendo
     * @return comida
     */
    public String animalComiendo(){
        return this.comida;
    }

    /**
     * Metodo que sirve para indicar el numero de horas que duerme el animal
     * @return genero
     */
    public int animalDuerme(){
        return this.horas;
    }

    /**
     * Metodo que sirve para indicar el nombre
     * @return nombre
     */
    public String animalNombre(){
        return this.raza;
    }
    /**
     * Metodo que sirve para indicar que el peso del animal
     * @return materia
     */
    public int animalpeso(){
        return this.peso;
    }

    /**
     * Metodo que sirve para indicar que el animal esta en celo
     * @return libro
     */
    public String animalCelo(){
        return this.celo;
    }


    /**
     * Metodo que sirve para indicar cuantos metros recorrre el animal
     * @return edad
     */
    public int animalRecorrido(){
        return this.metros;
    }

    /**
     * Metodo qeu extrae todos los datos de los animales
     * @return
     */
    public String obtenerDatos(){
        String data = "Nombre del animal: \n" +raza+"\n"+"Peso: \n"+peso+"\n"+"Tipo de Comida:\n"+comida+"\n"
                +"Horas de sueño:\n"+horas+"\n"+"Metros recorridos: \n"+metros+"\n"+"El animal esta en celo:"+celo;
        return data;
    }

    /**
     *Metodo que sirve para actualizar la comida
     * @param comida
     */
    public void actualizarcomida(String comida){
        this.comida = comida;
    }
    /**
     *Metodo que sirve para actualizar la raza
     * @param raza
     */
    public void actualizaRaza(String raza){
        this.raza = raza;
    }
    /**
     *Metodo que sirve para actualizar el peso
     * @param peso
     *
     */
    public void actualizaPeso(int peso){
        this.peso = peso;
    }
    /**
     *Metodo que sirve para actualizar el  celo del animal
     * @param celo
     */
    public void actualizacelo(String celo){
        this.celo = celo;
    }
    /**
     *Metodo que sirve para actualizar las horas de sueño
     * @param horas
     */
    public void actualizaSueño(int horas){
        this.horas = horas;
    }
    /**
     *Metodo que sirve para actualizar los metros recorridos por el animal
     * @param metros
     */
    public void actualizaMetros(int metros){
        this.metros = metros;
    }
}
