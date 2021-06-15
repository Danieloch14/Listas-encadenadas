package Fuentes;
import Comparadores.ComparadorNombreEmpleado;
import Comparadores.CompraadorSueldo;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author DELL
 */
public class ListaEncadenadaLL {
    private LinkedList <Empleado> lista;
    
    public ListaEncadenadaLL(){
        lista = new LinkedList<Empleado>();
                
    }
    
    public void addEmpleado(Empleado empleado){
        
        lista.add(empleado);
    }
    
    public void addEmpleadoInicio(Empleado empleado){
        
        lista.addFirst(empleado);
    }
    
    public void addEmpleadoFinal(Empleado empleado){
        
        lista.addLast(empleado);
    }
    
    public void oredenarNombreEmpleado(){
        
        Collections.sort(lista, new ComparadorNombreEmpleado());
    }
    
    public Object mayorSueldo(){
        
        return Collections.max(lista, new CompraadorSueldo());
    }
    
    public void borrar(String nombreEmp){
        Iterator <Empleado>it =  lista.iterator();
         
         while(it.hasNext()){
         
             String nombre = it.next().getNombres();
             if(nombre.equalsIgnoreCase(nombreEmp)){
                 it.remove();
             }
         }
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
