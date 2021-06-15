package Fuentes;

/**
 *
 * @author danie
 */
public class EmpleadoAsalariado extends Empleado{
    private double salarioBasico;

    public EmpleadoAsalariado(Fecha fechaDeIngreso,String nombres, Fecha fechaNacimiento) {
        super(fechaDeIngreso, nombres, fechaNacimiento);
    }
    
    

    public EmpleadoAsalariado(double salarioBasico, Fecha fechaIngreso, String nombres, Fecha fechaNacimiento) {
        super(fechaIngreso, nombres, fechaNacimiento);
        this.salarioBasico = salarioBasico;
    }

    

    @Override
    public double getSalario() {
        return this.salarioBasico;
    }

    @Override
    public String toString() {
        return "\n----------------EMPLEADO ASALARIADO------------------\n" + super.toString() + "\nSalario: " + salarioBasico ;
    }
    
}
