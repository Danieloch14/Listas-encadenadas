package Fuentes;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ListaEncadenada {
    Nodo inicio;

    public ListaEncadenada() {
        this.inicio = null;
    }
    
    public boolean estaVacia(){
        return (inicio==null);
    }
    
    public void addInicio(Empleado empleado){
        if(estaVacia()){
            inicio = new Nodo(empleado);
        }else{
            inicio = new Nodo(empleado, inicio);
        }
    }
    
    public void addFinal(Empleado empleado){
        if (estaVacia()){
            inicio = new Nodo(empleado);
        }else {
            Nodo q, p;
            q = p = this.inicio;
            while(p != null){
                q = p;
                p = p.enlace;
            }
            
            q.enlace = new Nodo(empleado);
        }
    }
    
    public void addOrden(Empleado empleado){
        if(estaVacia()){
            inicio = new Nodo(empleado);
        }else{
            Nodo p, q, r;
            q=p=this.inicio;
            r = new Nodo(empleado);
            while(p != null){
                if(empleado.getNombres().compareToIgnoreCase(p.getDato().getNombres()) > 0){
                    if(p == inicio){
                        r.enlace = inicio;
                        inicio = r;
                    }
                }else {
                    q = p;
                    p = p.enlace;
                }
            }
            
            if(p == null){
                q.enlace = r;
            }
        }
    }
    
    public void eliminarNodo(String nombreEmpleado){
        Nodo p,q;
        boolean r = false;
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }else{
            p = inicio;
            q = inicio;
            while((p != null)){
                if(p.dato.getNombres().equalsIgnoreCase(nombreEmpleado)){
                    if(p == inicio){
                        inicio = p.enlace;
                    }else {
                        q.enlace = p.enlace;
                    }
                    
                    r = true;
                    break;                
                }else{
                    q = p;
                    p = q.enlace;
                }
            }          
        }
        
        if(r == true){
            JOptionPane.showMessageDialog(null, "El empleado ha sido eliminado");
        }else{
            JOptionPane.showMessageDialog(null, "El empleado no existe");
        }
        
    }
    @Override
    public String toString() {
        String salida = "";
        if(estaVacia()){
            return "Lista vacía";
        }else{
            salida="\n\nLa lista de empleados es: ";
            Nodo p = inicio;
            while(p!=null){
                salida+= "\n" + p.getDato().toString();
                p = p.enlace;
            }
        }
        return salida;
    }
    
    
}
