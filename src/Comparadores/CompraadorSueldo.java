package Comparadores;
import Fuentes.Empleado;
import java.util.Comparator;
/**
 *
 * @author DELL
 */
public class CompraadorSueldo implements Comparator{

    @Override
    public int compare(Object t, Object t1) {
        Empleado empleado1, empleado2;
        empleado1 = (Empleado) t;
        empleado2 = (Empleado) t1;
        return Double.compare(empleado1.getSalario(), empleado2.getSalario());
    }
    
}
