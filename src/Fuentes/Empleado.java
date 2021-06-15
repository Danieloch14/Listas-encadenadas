package Fuentes;
/**
 *
 * @author danie
 */
public abstract class Empleado extends Persona{
    private Fecha fechaIngreso;
    
    public abstract double getSalario();
    
    public Empleado(String nombres, Fecha fechaNacimiento) {
        super(nombres, fechaNacimiento);
    }

    public Empleado(Fecha fechaIngreso, String nombres, Fecha fechaNacimiento) {
        super(nombres, fechaNacimiento);
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFecha de ingreso:" + fechaIngreso;
    }
    
    
}
