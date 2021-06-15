package Comparadores;

import Fuentes.Empleado;

import java.util.Comparator;

/**
 *
 * @author DELL
 */
public class ComparadorNombreEmpleado implements Comparator{

    @Override
    public int compare(Object t, Object t1) {
        Empleado empleado1,empleado2;
        empleado1 = (Empleado)t;
        empleado2= (Empleado)t1;
        return (empleado1.getNombres().compareToIgnoreCase(empleado2.getNombres()));
    }
    
}
