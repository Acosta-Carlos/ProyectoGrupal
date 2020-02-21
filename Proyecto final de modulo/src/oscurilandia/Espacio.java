package oscurilandia;


//------------------------------------------------------------------------------ utilidades importadas 
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Espacio {

//------------------------------------------------------------------------------ Atributos 
	/**
	 * Atributos 
	 */
	private char matriz[][];  
	private Carro listaCarro[]= new Carro[18];
	private ArrayList <Huevo>  listahuevo = new ArrayList <Huevo> ();
	private static int puntajetotal;

//------------------------------------------------------------------------------- Constructor 
	/**
	 * Constructor , en este metodo estamos creando una matriz de tamaño 15 X 15 , hay que considerar que parte desde 0 por lo tanto se puede recorrer desde el 0 hasta el 14 
	 */
	
	public Espacio() {
		matriz = new char[15][15];
		puntajetotal = 0;
	}
	
	// Fin Constructor 
//------------------------------------------------------------------------------- Metodo llenar tablero	
	
	/**
	 * MEtodo llenar tablero , estamos llenando la matriz con asteriscos para que no sean espacios vacios y poder visualizarlo.
	 */
	public void llenarTablero() {
		for (int i= 0 ;i<15;i++) {
			for (int j = 0 ; j<15; j++) {
				matriz[i][j] = '*';
			}
		}		
	}
	// Fin metodo llenar Tablero 
//------------------------------------------------------------------------------- Metodo mostrar tablero		
	
	/**
	 * Mostrar Tablero , estamos mostrando la matriz, sirve para mostrar los valores ingresados en la matriz. 
	 */
	
	
	
	public void mostrarTablero() {
		for (int i=0;i<15;i++) {
			for (int j=0;j<15;j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println("");
		}
	}
	
	// Fin método 
//--------------------------------------------------------------------------------- Crear Kromi
	public Kromi crearKromi() {
		
/**
 * Crear Kromi, estamos ingresando un objeto de la clase Kromi aleatoriamente en el espacio matriz[][],
 * cuando se posicione marcara las celdas que estan con asterisco con un K, 
 * cabe mencionar que la matriz se recorre segun columnas desde el 0-14 y degun las filas se posicionan las kromis de
 * 0-13 pues ocupan 3 espacios y se saldrian de los limites. 
 * Ademas una vez ingresado en la matriz se guarda en la lista Carro. 
 */
		
		
		
		
		
		
		
		/*
		 * JOptionPane.showMessageDialog(null, " Creando Kromi ");
		 * 
		 * int cantidadOcupantes =
		 * Integer.parseInt(JOptionPane.showInputDialog("cantidad ocupantes"));
		 * 
		 * String fecha = JOptionPane.showInputDialog("fecha");
		 * 
		 * int anioFabricacion =
		 * Integer.parseInt(JOptionPane.showInputDialog(" Ingrese año de Fabricacion "
		 * ));
		 * 
		 * String marca = JOptionPane.showInputDialog(" Ingrese Marca ");
		 */

		int fila;
		int columna; 
		
		boolean asterisco = false ; 
		do {
			 fila = (int)( Math.random()*13); 

			 columna = (int)(Math.random()*15);
			
			if (matriz[fila][columna]== '*') {
				if (matriz[fila+1][columna]== '*') {
					if (matriz[fila+2][columna]== '*'){
					asterisco = true; 
					matriz[fila][columna] = 'K';
					matriz[fila+1][columna] = 'K';
					matriz[fila+2][columna] = 'K';
					}
				}
			}
		}while (!asterisco);
		
		Kromi kro = new Kromi (900, "323", 12, "merdeces",fila, columna);
			
		return kro; 
	}
		

	// Fin método 
//-------------------------------------------------------------------------------- Crear Caguano
	public Caguano crearCaguano() {
		/**
		 * 
		 * Crear Caguano, estamos ingresando un objeto de la clase Caguano aleatoriamente en el espacio matriz[][],
		 * cuando se posicione marcara las celdas que estan con asterisco con un C, 
		 * cabe mencionar que la matriz se recorre segun columnas desde el 0-14 ( ocupa dos espacios en hoorizontal ) y segun las filas 0 - 15 
		 * Ademas una vez ingresado en la matriz se guarda en la lista Carro. 
		 */
		
		 
				
		
		/*
		 * JOptionPane.showMessageDialog(null, " Creando Caguano ");
		 * 
		 * int cantidadOcupantes =
		 * Integer.parseInt(JOptionPane.showInputDialog("Cantidad ocupantes"));
		 * 
		 * String fecha = JOptionPane.showInputDialog("Fecha");
		 * 
		 * String colorConfeti = JOptionPane.showInputDialog("Color Confeti ");
		 * 
		 * int alcanceTiro = Integer.parseInt(JOptionPane.showInputDialog("Alcance"));
		 */

		
		int fila;
		int columna;  
		boolean asterisco = false ; 
		do {
			 fila = (int)( Math.random()*15); 

			 columna = (int)(Math.random()*14);
			
			if (matriz[fila][columna]== '*') {
				if (matriz[fila][columna+1]== '*') {
					asterisco = true; 
					matriz[fila][columna] = 'C';
					matriz[fila][columna+1] = 'C'; 
				}
			}
		}while (!asterisco);
			return new Caguano(4, "232","rosado", 4, fila, columna ); 
	}
	
	
	
	
	// Fin método crear caguano  
	
//------------------------------------------------------------------------------------------------ Crear Trupalla 

	
	/**
	 * 
	 * Crear trupalla, estamos ingresando un objeto de la clase  aleatoriamente en el espacio matriz[][],
	 * cuando se posicione marcara las celdas que estan con asterisco con un T, 
	 * cabe mencionar que la matriz se recorre segun columnas desde el 0-14 ( ocupa dos espacios en hoorizontal ) y segun las filas 0 - 15 
	 * Ademas una vez ingresado en la matriz se guarda en la lista Carro. 
	 */
	
	
	
	
	
	
	
	
	public Trupalla crearTrupalla() {
		
		/*
		 * JOptionPane.showMessageDialog(null, " Creando Trupalla ");
		 * 
		 * int cantidadOcupantes =
		 * Integer.parseInt(JOptionPane.showInputDialog("Cantidad ocupantes"));
		 * 
		 * String fecha = JOptionPane.showInputDialog("Fecha");
		 * 
		 * int nivelarmadura =
		 * Integer.parseInt(JOptionPane.showInputDialog("Nivel de Armadura" ));
		 * 
		 * String nombreChofer = JOptionPane.showInputDialog("Nombre Chofer");
		 */
		
		
		
		
		int fila;
		int columna; 
		
		boolean asterisco = false ; 
		do {
			 fila = (int)( Math.random()*15); 

			 columna = (int)(Math.random()*15);
			
			if (matriz[fila][columna]== '*') {
				asterisco = true; 
				matriz[fila][columna] = 'T';
			}
		}while (!asterisco);
			return new Trupalla(32, "23", 4, "caviere", fila, columna ) ; 
	}
	
	
	
	// Fin metodo crear trupalla 
	
//------------------------------------------------------------------------------------------- Metodo Crear Carro 
	
	public void crearCarro() {
		
		/**
		 * Estamos creando 18 instancias de los objetos y las almacenamos en la lista carro. 
		 */
		
		listaCarro [0]= crearKromi (); 
		listaCarro [1]= crearKromi ();
		listaCarro [2]= crearKromi ();
		
		listaCarro [3]= crearCaguano();
		listaCarro [4]= crearCaguano();
		listaCarro [5]= crearCaguano();
		listaCarro [6]= crearCaguano();
		listaCarro [7]= crearCaguano();
		
		
		listaCarro [8]= crearTrupalla();
		listaCarro [9]= crearTrupalla();
		listaCarro [10]= crearTrupalla();
		listaCarro [11]= crearTrupalla();
		listaCarro [12]= crearTrupalla();
		listaCarro [13]= crearTrupalla();
		listaCarro [14]= crearTrupalla();
		listaCarro [15]= crearTrupalla();
		listaCarro [16]= crearTrupalla();
		listaCarro [17]= crearTrupalla();
		
	}
	
//--------------------------------------------------------------------------------------------- Metodo validar Kromi Muerta
	/**
	 * Estamos recorriendo la lista carro, viendo las iteraciones realizadas. Luego revisamos todos los objetos de la clase carro.  
	 * Si las coordenadas del carro encontrado en las columnas son iguales y las filas de la instancia en la  lista carro son menor o 
	 * igual a las coordenadas de la instancia micro y  las filas de la instancia micro  son menor o igual asla fila de la instancia 
	 * carro + 2 ( eso significa que encontramos la kromi dentro de la matriz  y para ello lo verifacamos con sus sus limites)
	 * Una vez que la encontramos creamos variables locales y las posicionamos en las coordenadas iniciales del carro , si todos sus parametros 
	 * en la matriz tienen una H el resultado del metodo boolean es verdadero y se valida la muerte de la instancia carro en la listacarro.
	 * @param filaK
	 * @param columnaK
	 * @return
	 */
		
	public boolean validarKromiMuerto(int filaK, int columnaK) {
		boolean resultado = false;
		
		
		
		for (int i=0;i<listaCarro.length-1;i++) {
			System.out.println("iteracion " + i);
			System.out.println("Revisando carro " + listaCarro[i].toString());
			System.out.println(listaCarro[i].getClass().toString());
			if (listaCarro[i].getClass().toString() == "class oscurilandia.Kromi" && columnaK == listaCarro[i].getColumnac() && listaCarro[i].getFilac() <= filaK && filaK <= (listaCarro[i].getFilac() + 2) ) {
				int f,c;
				f = listaCarro[i].getFilac();
				c = listaCarro[i].getColumnac();
				if (matriz[f][c] == 'H' && matriz[f+1][c] == 'H' && matriz[f+2][c] == 'H') {
					resultado = true;
				}
			}
		}
		return resultado;
	}
	/*for (Carro car:listacarro) { //leo la lista de carros, revisando instancia por instancia,  car = variable local. 
	System.out.println("Revisando carro " + car.toString());
	System.out.println(car.getClass().toString());
	if (car.getClass().toString() == "class oscurilandia.Kromi" && columnaK == car.getColumnac() && car.getFilac() <= filaK && filaK <= (car.getFilac() + 2) ) {
		int f,c;
		f = car.getFilac();
		c = car.getColumnac();
		if (matriz[f][c] == 'H' && matriz[f+1][c] == 'H' && matriz[f+2][c] == 'H') {
			resultado = true;
		}}}return resultado }*/
	
	// Fin validar Kromi muerta
//------------------------------------------------------------------------------------------------------ Metodo validar Caguano Muerto		
	/**
	 * Estamos recorriendo la lista carro, viendo las iteraciones realizadas. Luego revisamos todos los objetos de la clase carro.  
	 * Si las coordenadas del carro encontrado en las filas son iguales y las columnas de la instancia en la  lista carro son menor o 
	 * igual a las coordenadas de la instancia  y  las columnas de la instancia caguano  son menor o igual a la columna de la instancia 
	 * carro + 1 ( eso significa que encontramos el caguano dentro de la matriz  y para ello lo verifacamos con  sus limites)
	 * Una vez que la encontramos creamos variables locales y las posicionamos en las coordenadas iniciales del carro , si todos sus parametros 
	 * en la matriz tienen una H el resultado del metodo boolean es verdadero y se valida la muerte de la instancia carro en la listacarro.
	 * @param filaC
	 * @param columnaC
	 * @return
	 */
	public boolean validarCaguanoMuerto (int filaC, int columnaC) {
		boolean resultado = false ; 
		
		for(int i=0;i<listaCarro.length;i++) {
			if ( listaCarro[i].getClass().toString()== " class oscurilandia.Caguano" && filaC == listaCarro[i].getFilac() && listaCarro[i].getColumnac()<=columnaC && columnaC<=(listaCarro[i].getColumnac()+1)) {
				int f,c; 
				f = listaCarro[i].getFilac();
				c = listaCarro[i].getColumnac();
				if (matriz[f][c] == 'H' && matriz[f][c+1]=='H') {
					resultado = true ; 
				}
			}
		}
		return resultado;
	}
	
	
	// Fin Validar Caguano Muerto. 

//-------------------------------------------------------------------------------------------------------- Metodo Lanzar Huevo 	
	
	/**
	 * Lanzar Huevo : Estamos pidiendo por pantalla  que ingresen donde quieren dirigir el tiro dentro de la matriz
	 * ademas inicializamos las variables locales puntaje obtenido y carromuerto. 
	 * 
	 * Luego verificamos donde callo el huevo y el puntaje asigando a su caida ademas de verificar si matamos o no algun tipo de carro
	 * y el puntaje asignado , para finalizar mostramos el puntaje total. 
	 * 
	 * Los tiros se guardan en la lista huevo . 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	public void lanzarHuevo() { 
		
		int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Fila huevo"));
		int columna =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna huevo"));;
		int puntajeobtenido = 0 ; 
		int carromuerto = 0;
		
		
		if ( matriz [fila][columna] == '*') {
			matriz[fila][columna] = 'H';
			puntajeobtenido = 0 ; 
		}
		else if ( matriz [fila][columna] == 'K') {
			matriz[fila][columna] = 'H';
			puntajeobtenido = 3 ;
			if (validarKromiMuerto(fila,columna) == true) {
				carromuerto = 10;
			}
		}
		else if ( matriz [fila][columna] == 'C') {
			matriz[fila][columna] = 'H';
			puntajeobtenido = 2 ;
			if(validarCaguanoMuerto(fila,columna) == true ) {
				carromuerto = 7 ; 
			}
		}
		else if ( matriz [fila][columna] == 'T') {
			matriz[fila][columna] = 'H';
			puntajeobtenido = 1 ;
		}
		
		Huevo huev = new Huevo(fila,columna,puntajeobtenido+carromuerto);
		
		Espacio.puntajetotal  = puntajeobtenido + carromuerto;
		
		listahuevo.add(huev);
		
		JOptionPane.showMessageDialog(null, " puntajetotal " + puntajetotal);
		/*Integer.parseInt(JOptionPane.showInputDialog("puntaje total " + puntajetotal);*/
		
	
				
	}

}

// Fin lanzar Huevo. 

