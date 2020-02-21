package oscurilandia;


/**
 * @author carlos
 * @see 
 * @version 20 / 02 / 2020
 *
 */
public class Carro {
	//------------------------------------------------------------------Atributos 
	
	//Atributos 
	private int cantidadOcupantes; 
	private String fechaIngreso;
	private int filac;
	private int columnac;
	//------------------------------------------------------------------Constructores 
	
	/**
	 * metodo Contructor:
	 * @param cantidadOcupantes
	 * @param fechaIngreso
	 * @param fila
	 * @param columna
	 */
	public Carro(int cantidadOcupantes, String fechaIngreso, int fila, int columna) {
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.filac = fila;
		this.columnac = columna; 
	} // Fin metodo Constructor 
	
    
	
	
	/**
     * Constructor por defecto 
     */
	public Carro ( ) {		
	} 
	// Fin Metodo Constructor
	

	
	
	
	
	
	
	//------------------------------------------------------------------ Sett y gett 
	
	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}
	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public int getFilac() {
		return filac;
	}
	public void setFilac(int filac) {
		this.filac = filac;
	}
	public int getColumnac() {
		return columnac;
	}
	public void setColumnac(int columnac) {
		this.columnac = columnac;
	}
	//------------------------------------------------------------------ To String ( metodo que despliega sus datos basicos )

	
	@Override
	public String toString() {
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", filac=" + filac
				+ ", columnac=" + columnac + "]";
	}
	
	
	//-------------------------------------------------------------------- Métodos
	
	
 
	public void desplegarCoordenadas () {
		System.out.println("El carro esta en la fila " + filac + " y en la columna " + columnac);
	}
	
}





