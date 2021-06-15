package Fuentes;
/**
 *
 * @author DELL
 */
public class Nodo {
    Empleado dato;
    Nodo enlace;

    public Nodo(Empleado dato) {
        this.dato = dato;
        this.enlace = null;
    }

    public Nodo(Empleado dato, Nodo enlace) {
        this.dato = dato;
        this.enlace = enlace;
    }

    public Empleado getDato() {
        return dato;
    }

    public void setDato(Empleado dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
    

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
    
    
}
