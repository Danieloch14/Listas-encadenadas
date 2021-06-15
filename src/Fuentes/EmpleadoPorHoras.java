package Fuentes;

/**
 *
 * @author danie
 */
public class EmpleadoPorHoras extends Empleado{
    
    private int numHoras;
    private double costoXHora;

    public EmpleadoPorHoras(Fecha fechaIngreso, String nombre, Fecha fechaNacimiento) {
        super(fechaIngreso, nombre, fechaNacimiento);
    }

    public EmpleadoPorHoras(int numHoras, double costoXHora, Fecha fechaIngreso, String nombre, Fecha fechaNacimiento) {
        super(fechaIngreso, nombre, fechaNacimiento);
        this.numHoras = numHoras;
        this.costoXHora = costoXHora;
    }
    
    

    @Override
    public double getSalario() {
        double salario = numHoras * costoXHora;
        return salario;
    }

    @Override
    public String toString() {
        return "\n----------------EMPLEADO POR HORAS------------------\n" + super.toString() + "\nNúmero de horas: " + numHoras + "\nCosto por hora: " + costoXHora + "\nSalario: " + getSalario() ;
    }
    
    
    
    
}
