package Fuentes;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class ListaEmpleado {
    
    private ArrayList <Empleado> lista;
    
    public ListaEmpleado(){
        lista = new ArrayList<Empleado>();
                
    }
    
    public void addEmpleado(Empleado empleado){
        
        lista.add(empleado);
    }

    @Override
    public String toString() {
        String salida = "";
        for(Empleado aux: lista){
            salida += aux + "\n\n";
            salida += "\n ------------------------------------- \n";
        }
        return salida;
    }
    
    
}
