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
public class Calculo {
    protected String idProducto;
    protected String nombreProducto;
    protected String precProducto;
    protected String cantProduct;

    public Calculo() {
    }

    public Calculo(String idProducto, String nombreProducto,  String cantProduct, String precProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precProducto = precProducto;
        this.cantProduct = cantProduct;
    }

    

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getPrecProducto() {
        return precProducto;
    }

    public void setPrecProducto(String precProducto) {
        this.precProducto = precProducto;
    }

    
    
    
}
