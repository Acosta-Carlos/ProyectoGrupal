package oscurilandia;
/**
 * @author Carlos Acosta 
 * @see 
 * @version 20 / 02 / 2020
 *
 */

public class Kromi extends Carro{
	
	
	//------------------------------------------------------------------Atributos
	
	private int anioFabricacion; 
	private String marca;
	
	//------------------------------------------------------------------ Constructores
	
	/**
	 * Método Constructor vacio
	 */
	public Kromi() {
		super();	
	}
	// Fin Constructor vacio
	
	
	
	
	/**
	 *  Método Constructor con atributos super y propios
	 * @param cantidadOcupantes
	 * @param fechaIngreso
	 * @param aniofabricacion
	 * @param marca
	 * @param fila
	 * @param columna
	 */
	public Kromi(int cantidadOcupantes, String fechaIngreso, int aniofabricacion, String marca, int fila, int columna) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.anioFabricacion = aniofabricacion;
		this.marca = marca;
		
	}
	// Fin Método Constructor
	
	
	
	
	
	
	
	//------------------------------------------------------------------ gett y sett 
	public int getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	//------------------------------------------------------------------ To STring 
	@Override
	public String toString() {
		return super.toString() + "Kromi [anioFabricacion=" + anioFabricacion + ", marca=" + marca + "]";
	} 
	//------------------------------------------------------------------ Métodos 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
