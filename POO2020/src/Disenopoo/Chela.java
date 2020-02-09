package Disenopoo;
import java.util.Scanner;

public class Chela {
    // declaración de variables
    private double precio;
    private int unidVendidas;
    private String nombre;
    private String tipo;



    /**
     * Metodo Constructor
     * @param precio
     * @param unidVendidas
     * @param nombre
     * @param tipo
     */
    public Chela(double precio, int unidVendidas, String nombre, String tipo){
        this.precio = precio;
        this.unidVendidas = unidVendidas;
        this.nombre = nombre;
        this.tipo = tipo;
    }




    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidVendidas() {
        return unidVendidas;
    }

    public void setUnidVendidas(int unidVendidas) {
        this.unidVendidas = unidVendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public double getTotal(){
       double total = precio * unidVendidas;
       return total;
    }


    public String obtenerDatos(){
        String data = "Nombre de la cerveza: \n"+nombre+"\n"+"Tipo: \n"+tipo+"\n"+"Precio:\n"+precio+"\n"+
                "Unidades Vendidas:\n"+unidVendidas+"\n"+ "Total de Ventas:\n"+getTotal();
        return data;
    }

}
