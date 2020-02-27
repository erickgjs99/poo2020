package herencia_empleado;

public class EmpleadoHora extends Empleado{
    double horas_trabajadas;
    double valor_hora;
    double total;


    public EmpleadoHora(String nombre, String edad, String cargo, String area, double horas_trabajadas,
                        double valor_hora){
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
        this.area = area;
        this.horas_trabajadas = horas_trabajadas;
        this.setValor_hora(valor_hora);
    }

    public double salario(){
        total = getHoras_trabajadas() *getValor_hora();
        return total;
    }

    public double getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(double horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }
}
