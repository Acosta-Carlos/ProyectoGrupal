package oscurilandia;
/**
 * @author Carlos Acosta 
 * @see 
 * @version 20 / 02 / 2020
 *
 */


public class Huevo {
	
//------------------------------------------------------------ Atributos 
int fila;
int columna; 
int puntaje;


//------------------------------------------------------------ Constructor
/**
 * Constructor 
 * @param fila
 * @param columna
 * @param puntaje
 */
public Huevo(int fila, int columna, int puntaje) {
	this.fila = fila;
	this.columna = columna;
	this.puntaje = puntaje;
}
// Fin Constructor 

//------------------------------------------------------------ GETT y SETT 
public int getFila() {
	return fila;
}
public void setFila(int fila) {
	this.fila = fila;
}
public int getColumna() {
	return columna;
}
public void setColumna(int columna) {
	this.columna = columna;
}
public int getPuntaje() {
	return puntaje;
}
public void setPuntaje(int puntaje) {
	this.puntaje = puntaje;
}
//------------------------------------------------------------ To String 
@Override
public String toString() {
	return "Huevo [fila=" + fila + ", columna=" + columna + ", puntaje=" + puntaje + "]";
}
}