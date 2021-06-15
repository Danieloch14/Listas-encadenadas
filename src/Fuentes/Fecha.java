package Fuentes;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Fecha {
    private int dia,mes,anio;

    public Fecha(String fecha){
        
        verificarFecha(fecha);
        
    }

    public Fecha() {
    }
    
    
    
    public void setFecha(String fecha){
        StringTokenizer tk = new StringTokenizer(fecha, "/");
        this.dia = Integer.parseInt(tk.nextToken());
        this.mes = Integer.parseInt(tk.nextToken());
        this.anio = Integer.parseInt(tk.nextToken());
        
        
    }
    
    public void verificarFecha(String fecha){
        
        Pattern fec = Pattern.compile("([0-9])([0-9])(\\/)([0-9])([0-9])(\\/)([\\d][\\d][\\d][\\d])");
        Matcher mat  = fec.matcher(fecha);
         if(mat.matches()) {
                this.setFecha(fecha);
                
            }else {
                JOptionPane.showMessageDialog(null, "ingrese  una fecha adecuada");
            }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
    
    
    
}
