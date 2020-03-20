/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

/**
 *
 * @author Erick Jaramillo
 */
public class Cliente {

    public Cliente(String nombreClient, String id, String direccion, String celular) {
        this.nombreClient = nombreClient;
        this.id = id;
        this.direccion = direccion;
        this.celular = celular;

    }

    public Cliente() {
    }

    
    
    

    /**
     * @return the nombreClient
     */
    public String getNombreClient() {
        return nombreClient;
    }

    /**
     * @param nombreClient the nombreClient to set
     */
    public void setNombreClient(String nombreClient) {
        this.nombreClient = nombreClient;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

   

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }


    private String nombreClient, id, direccion, celular;
   
    
    
    
    
}
