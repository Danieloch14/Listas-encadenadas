package Fuentes;

/**
 *
 * @author danie
 */
public class EmpleadoBaseComision extends EmpleadoComision{
    
    private double salarioBase;

    public EmpleadoBaseComision(double TotalVentas, double comisiónVentas, Fecha fechaIngreso, String nombre, Fecha fechaNacimiento) {
        super(TotalVentas, comisiónVentas, fechaIngreso, nombre, fechaNacimiento);
    }

    public EmpleadoBaseComision(double salarioBase, double TotalVentas, double comisiónVentas, Fecha fechaIngreso, String nombre, Fecha fechaNacimiento) {
        super(TotalVentas, comisiónVentas, fechaIngreso, nombre, fechaNacimiento);
        this.salarioBase = salarioBase;
    }
    
    @Override
    public double getSalario() {
       return super.getSalario() + this.salarioBase;
    }

    @Override
    public String toString() {
        return  "\n----------------EMPLEADO BASE ,------------------\n"  + "\n" + super.toString() +  "\nSalario base: " + salarioBase ;
    }
    
    
}
