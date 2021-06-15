package Fuentes;
/**
 *
 * @author danie
 */
public class EmpleadoComision extends Empleado{
    
    private double TotalVentas;
    private double comisionVentas;

    public EmpleadoComision(Fecha fechaIngreso, String nombre, Fecha fechaNacimiento) {
        super(fechaIngreso, nombre, fechaNacimiento);
    }

    public EmpleadoComision(double TotalVentas, double comisiónVentas, Fecha fechaIngreso, String nombre, Fecha fechaNacimiento) {
        super(fechaIngreso, nombre, fechaNacimiento);
        this.TotalVentas = TotalVentas;
        this.comisionVentas = comisiónVentas;
        
    }

    @Override
    public double getSalario() {
       return  TotalVentas*(comisionVentas/100);
    }

    @Override
    public String toString() {
        return "\n----------------EMPLEADO POR COMISIÓN------------------\n" + super.toString() + "\nTotal en ventas: " + TotalVentas + "\nComisión por ventas: " + comisionVentas + "\nSalario Total: " + getSalario();
    }
    
    
}
