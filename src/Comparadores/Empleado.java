

public class Empleado implements Comparable{
	private double sueldo;
	private int edad;
	private String nombre;
	private int opcion;
	
	//Constructor 
	public Empleado(int opcion) {
		this.opcion=opcion;
	}
	public Empleado(String nombre,int edad,double sueldo) {
		super();
		
		this.sueldo = sueldo;
		this.edad = edad;
		this.nombre = nombre;
	}
	
	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}
	@Override
	   public String toString() {
	    return nombre+" "+edad+" "+sueldo;   
	}
         
	
/*		@Override
		public int compareTo(Object nuevoEmpleado) {
			   
			Empleado nuevo=(Empleado) nuevoEmpleado;
			
		
				   /*if(sueldo<nuevo.sueldo)
					   return -1;
				   
				   if (sueldo>nuevo.sueldo)
					   return 1;
				   return 0;*/
		
			
				   /*if(edad<nuevo.edad)
					   return -1;
				   if(edad>nuevo.edad)
					   return 1;
				   return 0;
			
			
			
				 if(nombre.equals(nuevo.nombre))
					   return -1;
				   
				   return 0;
			
							 
				   
				   
	     }*/

	@Override	
		public int compareTo(Object nuevoObjeto) {
			// TODO Auto-generated method stub
			Empleado nuevo=(Empleado) nuevoObjeto; 
			return this.nombre.compareTo(nuevo.nombre);
			
		}
	


	
}