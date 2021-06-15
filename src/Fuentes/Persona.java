package Fuentes;
/**
 *
 * @author danie
 */
public abstract class Persona {
    private String nombres;
    private Fecha fechaNacimiento;

    public Persona(String nombre, Fecha fechaNacimiento) {
        setPersona(nombre, fechaNacimiento);
        
    }
    
    public void setPersona(String nombres, Fecha fechaNacimiento){
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    

    @Override
    public String toString() {
        return "Nombres: " + nombres + "\nFecha de nacimiento: " + fechaNacimiento;
    }
    
    
}
