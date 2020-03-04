package herenciainversionistas;

public class Inversionista {
    // Declaracion de variables
    protected String nombre;
    protected String num_cuenta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }
}
