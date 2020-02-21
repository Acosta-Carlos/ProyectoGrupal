package oscurilandia;
/**
 * @author carlos
 * @see 
 * @version 20 / 02 / 2020
 *
 */

public class Caguano extends Carro {

//------------------------------------------------------------------ Atributos
	private String colorConfeti;
	private int alcanceTiro;
	


//------------------------------------------------------------------ Constructores 

/**
 * Metodo Constructor Vacio
 */
public Caguano() {
	super();

}
// Fin Constructor Vacio


/**
 * Metodo Constructor con atributos super y propios
 * 
 * @param cantidadOcupantes
 * @param fechaIngreso
 * @param colorConfeti
 * @param alcanceTiro
 * @param fila
 * @param columna
 */
public Caguano(int cantidadOcupantes, String fechaIngreso, String colorConfeti, int alcanceTiro,int fila, int columna) {
	super(cantidadOcupantes, fechaIngreso, fila, columna);
	this.colorConfeti = colorConfeti;
	this.alcanceTiro = alcanceTiro;
// Fin Contructor 
	
	
	
//------------------------------------------------------------------ Gett y Sett 
}
public int getAlcanceTiro() {
	return alcanceTiro;
}
public void setAlcanceTiro(int alcanceTiro) {
	this.alcanceTiro = alcanceTiro;
}
public String getColorConfeti() {
	return colorConfeti;
}
public void setColorConfeti(String colorConfeti) {
	this.colorConfeti = colorConfeti;
}
//------------------------------------------------------------------ To String 
@Override
public String toString() {
	return super.toString() + "Caguano [alcanceTiro=" + alcanceTiro + ", colorConfeti=" + colorConfeti + "]";
}




}
