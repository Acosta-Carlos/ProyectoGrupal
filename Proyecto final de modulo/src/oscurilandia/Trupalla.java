package oscurilandia;
/**
 * @author carlos
 * @see 
 * @version 20 / 02 / 2020
 *
 */



public class Trupalla extends Carro{

	//------------------------------------------------------------------ Atributos
	private int nivelArmadura;
	private String nombreChofer;
	
	//------------------------------------------------------------------ Constructores
	/**
	 * Constructor vacio
	 */
	public Trupalla() {
		super();
		
	}
	// Fin Constructor vacio 
	
	
	
	
	
	/**
	 * Constructor con atributos super y propios
	 * 
	 * @param cantidadOcupantes
	 * @param fechaIngreso
	 * @param nivelArmadura
	 * @param nombreChofer
	 * @param fila
	 * @param columna
	 */
	public Trupalla(int cantidadOcupantes, String fechaIngreso, int nivelArmadura, String nombreChofer, int fila, int columna) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		
		this.nivelArmadura = nivelArmadura;
		this.nombreChofer = nombreChofer; 
		
	}
	
	// Fin Constructor 
	
	
	//------------------------------------------------------------------ Gett y Sett 
	public int getNivelArmadura() {
		return nivelArmadura;
	}
	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}
	public String getNombreChofer() {
		return nombreChofer;
	}
	public void setNombreChofer(String nombreChofer) {
		this.nombreChofer = nombreChofer;
	}
	
	//------------------------------------------------------------------ To String 
	@Override
	public String toString() {
		return super.toString() + "Trupalla [nivelArmadura=" + nivelArmadura + ", nombreChofer=" + nombreChofer + "]";
	} 
	
	
	
	
}
