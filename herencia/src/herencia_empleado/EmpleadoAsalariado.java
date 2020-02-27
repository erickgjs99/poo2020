package herencia_empleado;

public class EmpleadoAsalariado extends Empleado {
    double salario;


    public EmpleadoAsalariado(String nombre, String edad, String cargo, String area, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
        this.area = area;
        this.salario = salario;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
